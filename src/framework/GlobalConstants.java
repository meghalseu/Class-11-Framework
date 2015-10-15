package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class GlobalConstants {
	
	
	
	public static final int ELEMENT_LOCATING_DEFAULT_TIMEOUT = 10;
	
	public static final String VALID_USERNAME = "10janbatch_test1";	
	public static final String VALID_PASSWORD = "18NYVIZMI52f";
	
	public static final String HOME_PAGE_URL = "http://store.demoqa.com/";
	
	public static final String LOGIN_PAGE_URL = "http://store.demoqa.com/products-page/your-account/";	
	public static final String HOME_PAGE_TITLE = "ONLINE STORE";
	
	public static final String LOGIN_PAGE_TITLE = "Your Account | ONLINE STORE";
	public static final String MY_ACCOUNT_PAGE_TITLE = "Your Account | ONLINE STORE";
	
	public static WebDriver currentDRiver = null;
	
	public static final String MESSAGE_FILE = "C:\\Users\\meghal.patel\\Desktop\\selenium-learning\\ReadFrom\\MessageFile.txt";
	public static final String EXCEL_DATA_FILE = "C:\\Users\\meghal.patel\\Desktop\\selenium-learning\\ReadFrom\\ExcelData.xlsx";
	
	public static WebDriver getdriver(String browser)
	{
		if (browser.equalsIgnoreCase("ie")) 
			return new InternetExplorerDriver();
		if (browser.equalsIgnoreCase("chrome")) 
			return new ChromeDriver();
		else 
			return new FirefoxDriver();
		
	}

}
