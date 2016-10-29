package testNGExamples;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Groups {

	
	@Test(groups={"google"},dependsOnMethods="method2")
	public void method1(){
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		
	}
	
	@Test(groups={"yahoo"})
	public void method2(){
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com");
		driver.manage().window().maximize();

		
	}
	
	
}
