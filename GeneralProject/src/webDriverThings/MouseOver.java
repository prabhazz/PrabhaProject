package webDriverThings;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/menu/");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(driver.findElementByLinkText("News")).build().perform();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

	
	
	
}
