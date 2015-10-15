package framework.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import framework.GlobalConstants;

public class UserDashboard extends PageBase{

	UserDashboard(WebDriver driver) 
	{
		super(driver);
	}
	

	public StoreLoginPage clickLogoutLink()
	
		{
		
		driver.findElement(By.partialLinkText("Logout")).click();
		StoreLoginPage logpage = new StoreLoginPage();
		return logpage;
		//return null;
				
	}

	@Override
	public void verifyPage() {
		if (!driver.getTitle().contains(GlobalConstants.MY_ACCOUNT_PAGE_TITLE))
			throw new IllegalStateException();
		
	}

	
		
	}
