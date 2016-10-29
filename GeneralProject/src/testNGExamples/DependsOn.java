package testNGExamples;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {

	//depends on allows to maintain the order in which @Test should get executed
	//similarly dependsOnGroups also there
	@Test(groups={"google"},dependsOnMethods="method2")
	public void method1(){
		
		try {
			FirefoxDriver driver = new FirefoxDriver();		
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Assert.fail("test case failed");
		}
	}
	
	@Test(groups={"yahoo"})
	public void method2(){
		
		FirefoxDriver driver = new FirefoxDriver();		
		driver.get("https://www.yahoo.com");
		driver.manage().window().maximize();
		driver.close();
		
	}
	
	
}
