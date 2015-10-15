package framework.tests;

import framework.GlobalConstants;
import framework.TestCaseBase;
import framework.logger.Logger;
import framework.pageobjectmodel.StoreLoginPage;

public class ValidLoginTest extends TestCaseBase {

	@Override
	public void run() {
		
		StoreLoginPage loginpage = new StoreLoginPage();
		
		loginpage.Validlogin(GlobalConstants.VALID_USERNAME, GlobalConstants.VALID_PASSWORD);
		Logger.logInfo("loggedin successfully");
		
		loginpage.verifyPage();
		Logger.logInfo("Login page Verified");
		
	}

}
