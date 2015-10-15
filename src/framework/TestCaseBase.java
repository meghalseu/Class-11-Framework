package framework;

import framework.logger.Logger;

public abstract class TestCaseBase implements ITestCase {

	@Override
	public void setup() {
		
		
		Logger.logInfo("INside Test Setup");
		GlobalConstants.currentDRiver = GlobalConstants.getdriver("FF");

	}

	@Override
	public abstract void run();
	

	@Override
	public void cleanup() {
		Logger.logInfo("INside Test Cleanup");
		GlobalConstants.currentDRiver.quit();

	}

}
