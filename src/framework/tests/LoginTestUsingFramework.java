package framework.tests;

import framework.GlobalConstants;
import framework.TestCaseBase;
import framework.logger.Logger;
import framework.pageobjectmodel.StoreLoginPage;
import framework.pageobjectmodel.UserDashboard;

public class LoginTestUsingFramework extends TestCaseBase{

	@Override
	public void run() {
		
		StoreLoginPage loginpage = new StoreLoginPage();
		Logger.logInfo("Inside Login Page");
		
		loginpage.verifyPage();
		Logger.logInfo("Verify Page");
		
		loginpage.setUserName(GlobalConstants.VALID_USERNAME);
		Logger.logInfo("Entered Username");
		
		loginpage.SetPassword(GlobalConstants.VALID_PASSWORD);
		Logger.logInfo("Entered Password");
		
		UserDashboard userdb = loginpage.clickLoginButton();
		Logger.logInfo("Clicked Login Button");
		
		
		

		
		
	}


}
