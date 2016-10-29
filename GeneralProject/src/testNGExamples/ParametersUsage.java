package testNGExamples;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersUsage {
	
	@Test()
	@Parameters({"firstName"})
	public void method1(String firstName){
		
		//step 1: set the parameter name and value in testNG suite/xml
		//step 2: use @Parameters annotation with args as required parameters from suite file
		//step 3: also pass the required values as args in the @Test method with the datatype
		
		FirefoxDriver driver = new FirefoxDriver();
		System.out.println("value from parameter"+firstName);
		driver.get("http://demoqa.com/registration/");
		driver.manage().window().maximize();
		
		//fill first name
		driver.findElementById("name_3_firstname").sendKeys(firstName);
		
		driver.close();
		
	}
	
	
	
	
	
	

}
