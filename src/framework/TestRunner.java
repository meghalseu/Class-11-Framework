package framework;

import java.io.IOException;
import java.util.ArrayList;

import framework.logger.Logger;
import framework.tests.InvalidLoginTest;
import framework.tests.InvalidLoginUsingExcel;
import framework.tests.LoginTestUsingFramework;
import framework.tests.LoginUsiingExcel;
import framework.tests.LogoutTest;
import framework.tests.ValidLoginTest;
import framework.utility.GetScreenshot;

public class TestRunner {

	public static void main(String[] args) throws Exception {
		
		ArrayList<ITestCase> Testcases = new ArrayList<>();
		
		//Testcases.add(new LoginTestUsingFramework());
		//Testcases.add(new LogoutTest());
		//Testcases.add(new ValidLoginTest());
		//Testcases.add(new InvalidLoginTest());
		Testcases.add(new LoginUsiingExcel());
		Testcases.add(new InvalidLoginUsingExcel());
		
		for (ITestCase tc : Testcases) {
			Logger.logTestStart("Starting TestCase");
			tc.setup();
			
			try 
			{
				tc.run();	
				Logger.logTestEnd("Test Ended", true);
			} 
			catch (Exception e) 
			{
				Logger.logTestEnd("Test Case Failed.", false);
				GetScreenshot.takeScreenShot(GlobalConstants.currentDRiver);
				//Logger.logException(e, GlobalConstants.currentDRiver);
			
			}
			finally
			{
				tc.cleanup();
				
			}
		}
		
		
	}
}
 