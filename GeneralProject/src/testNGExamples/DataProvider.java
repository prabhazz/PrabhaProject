package testNGExamples;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataProvider {

	@org.testng.annotations.DataProvider(name="provider1")
	public static Object[][] data(){
		return new Object[][]{{"name1"}};
	}
	
	@Test(dataProvider="provider1")	
	public void dataProviderMethod(String name){
		
		FirefoxDriver driver = new FirefoxDriver();
		System.out.println(name);
		driver.get("http://demoqa.com/registration/");
		driver.manage().window().maximize();
		
		//fill first name
		driver.findElementById("name_3_firstname").sendKeys(name);
		driver.close();
	}
	
	
	
}
