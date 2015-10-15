package framework.tests;

import java.io.IOException;

import framework.GlobalConstants;
import framework.TestCaseBase;
import framework.dataaccess.ExcelReader;
import framework.pageobjectmodel.StoreLoginPage;

public class LoginUsiingExcel extends TestCaseBase{

	private String pword;
	private String uname;

	@Override
	public void run() {
		
		ExcelReader data = new ExcelReader();
		
		try {
			uname = data.getExcelData(GlobalConstants.EXCEL_DATA_FILE, "Sheet1", 1, 1);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			pword = data.getExcelData(GlobalConstants.EXCEL_DATA_FILE, "Sheet1", 1, 2);
		} catch (IOException e) {
		
			e.printStackTrace();								
		}
		
		StoreLoginPage loginpage = new StoreLoginPage();
		loginpage.Validlogin(uname, pword);
		
	}

}
