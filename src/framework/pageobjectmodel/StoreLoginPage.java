package framework.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.GlobalConstants;

public class StoreLoginPage extends PageBase{
	
	
	
	public StoreLoginPage()
	{
		this(GlobalConstants.currentDRiver);
	}
			
	public StoreLoginPage(WebDriver driver) {
		super(driver);
		driver.get(GlobalConstants.LOGIN_PAGE_URL);
		
	}

	public void setUserName (String username)
	{
		driver.findElement(By.id("log")).sendKeys(username);
	}
	
	public void SetPassword (String password)
	{
		driver.findElement(By.id("pwd")).sendKeys(password);
	}
	
	public UserDashboard clickLoginButton ()
	{
		driver.findElement(By.id("login")).click();
		UserDashboard udb = new UserDashboard(GlobalConstants.currentDRiver);
		return udb;
	}
	
	public void setRememberMe(boolean check)
	{
		
	}
	
	public boolean getSetOfRememberMe()
	{
		return false;
	}
	
	public WebElement setLoginError()
	{
		WebElement error = driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[1]/article/div/div/div/div[1]/form/p[1]"));
		return error;
	}
	
	public UserDashboard Validlogin (String Username, String Password)
	{
		driver.findElement(By.id("log")).sendKeys(Username);
		driver.findElement(By.id("pwd")).sendKeys(Password);
		driver.findElement(By.id("login")).click();
		//UserDashboard udb = new UserDashboard(GlobalConstants.currentDRiver);
		//return udb;
		return null;
		
	}
		

	@Override
	public void verifyPage() {
		if (!driver.getTitle().contains(GlobalConstants.LOGIN_PAGE_TITLE))
			throw new IllegalStateException();
		

	}
}
