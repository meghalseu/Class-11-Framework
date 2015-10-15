package framework.tests;

import framework.GlobalConstants;
import framework.TestCaseBase;
import framework.logger.Logger;
import framework.pageobjectmodel.StoreLoginPage;
import framework.pageobjectmodel.UserDashboard;


public class LogoutTest extends TestCaseBase{

	@Override
	public void run() 
	{
		StoreLoginPage loginpage = new StoreLoginPage();
		Logger.logInfo("Testcase : 2 - Inside Login Page");
		
		loginpage.verifyPage();
		Logger.logInfo("Testcase : 2 - Verify login Page");
		
		loginpage.setUserName(GlobalConstants.VALID_USERNAME);
		Logger.logInfo("Testcase : 2 - Entered Username");
		
		loginpage.SetPassword(GlobalConstants.VALID_PASSWORD);
		Logger.logInfo("Testcase : 2 - Entered Password");
		
		UserDashboard userdb = loginpage.clickLoginButton();
		Logger.logInfo("Testcase : 2 - Clicked Login Button");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userdb.clickLogoutLink();
		Logger.logInfo("Testcase : 2 - Clicked Logout Button");
		
		
		userdb.verifyPage();
		Logger.logInfo("Testcase : 2 - Verify logged out Page");
	
		
	}

}
