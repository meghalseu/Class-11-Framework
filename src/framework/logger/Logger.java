package framework.logger;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Logger {
	
	private static String getCurrentTimeStamp()
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return "["+dateFormat.format(date)+"]"; //2015/02/14 15:59:48
	}
	
	public static void logFail(String message) {
		System.out.println(getCurrentTimeStamp()+" FAIL: " + message);
	}

	public static void logPass(String message) {
		System.out.println(getCurrentTimeStamp()+" PASS :" + message);
	}

	public static void logInfo(String message)
	{
		System.out.println(getCurrentTimeStamp() + message);
	}
	
	public static void logTestStart(String message) {
		System.out.println();
		System.out.println(getCurrentTimeStamp()+" STARTED: " + message);
	}
	
	public static void logTestEnd(String message, boolean hasPassed) {
		if(hasPassed)
			System.out.println(getCurrentTimeStamp()+" PASSED_ENDED: " + message);
		else
			System.out.println(getCurrentTimeStamp()+" FAILED_ENDED: " + message);
		System.out.println();
	}
	
	public static void logException(Exception e, WebDriver driver) throws Exception
	{
		//take Screenshot
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\meghal.patel\\Desktop\\selenium-learning\\screenshot\\logexception-screenshot.png"), true );
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
		
		//capture URL
		System.out.println("=============================");
		System.out.println("URL" +driver.getCurrentUrl());
		System.out.println("=============================");
		
		//capture TITLE
		System.out.println("TITLE" +driver.getTitle());
		
		//capture Source
		throw e;
		
	}
	
	
}
