package framework.tests;

import framework.GlobalConstants;
import framework.TestCaseBase;
import framework.logger.Logger;
import framework.pageobjectmodel.StoreHomePage;
import framework.pageobjectmodel.StoreLoginPage;

public class InvalidLoginTest extends TestCaseBase {

	@Override
	public void run() {
		
	StoreLoginPage loginpage = new StoreLoginPage();
	StoreHomePage homepage = new StoreHomePage();
	
		homepage.verifyPage();
		Logger.logInfo("Homepage Verified before login");
		
		loginpage.Validlogin("Invalid_Username", "Invalid_Password");
		Logger.logInfo("loggedin Unsuccessfull");
		
		loginpage.setLoginError();
		Logger.logInfo("Login Error Verified");
		
		
		loginpage.verifyPage();
		Logger.logInfo("Login page Verified");
		
		homepage.verifyPage();
		Logger.logInfo("Homepage Verified after login fail");
		
	}

}
