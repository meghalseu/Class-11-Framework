package framework.tests;

import java.io.IOException;

import framework.GlobalConstants;
import framework.TestCaseBase;
import framework.dataaccess.ExcelReader;
import framework.pageobjectmodel.StoreHomePage;
import framework.pageobjectmodel.StoreLoginPage;

public class InvalidLoginUsingExcel extends TestCaseBase {
	
	private String pword;
	private String uname;

	@Override
	public void run() {
		
		ExcelReader data = new ExcelReader();
		
		try {
			uname = data.getExcelData(GlobalConstants.EXCEL_DATA_FILE, "Sheet1", 2, 1);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			pword = data.getExcelData(GlobalConstants.EXCEL_DATA_FILE, "Sheet1", 2, 2);
		} catch (IOException e) {
		
			e.printStackTrace();								
		}
		
		StoreLoginPage loginpage = new StoreLoginPage();
		loginpage.Validlogin(uname, pword);
		loginpage.setLoginError();
		
		StoreHomePage homepage = new StoreHomePage();
		homepage.verifyPage();
		
	}

}


