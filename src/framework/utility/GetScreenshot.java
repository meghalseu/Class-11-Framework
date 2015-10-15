package framework.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GetScreenshot {

	
	public static void takeScreenShot(WebDriver driver) throws IOException{
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in d drive with name "screenshot.png"
        FileUtils.copyFile(scrFile, new File("C:\\Users\\meghal.patel\\Desktop\\selenium-learning\\screenshot\\new2.png"));
		
	}
}
