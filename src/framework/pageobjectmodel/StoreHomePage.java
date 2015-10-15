package framework.pageobjectmodel;

import org.openqa.selenium.WebDriver;

import framework.GlobalConstants;

public class StoreHomePage extends PageBase{

	StoreHomePage(WebDriver driver) {
		super(driver);
		}
	
	public StoreHomePage()
	{
		this(GlobalConstants.currentDRiver);
	}

	@Override
	public void verifyPage() {
		
		if (!driver.getTitle().contains(GlobalConstants.HOME_PAGE_TITLE))
			throw new IllegalStateException();
			
	}
		
		
}


