package framework.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestNGSampleTest {
  
	@Test
  public void run1() {
		System.out.println("Run 1");
  }
  
	@Test
	  public void run2() {
			System.out.println("Run 2");
	  }
	  
	@BeforeMethod
	  public void beforemethod() {
			System.out.println("b4 Run");
	  }
	  
	@AfterMethod
	  public void aftermethod() {
			System.out.println("after Run");
	  }
	  
	    
}
