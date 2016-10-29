package webDriverThings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 0);
		
		
		
		driver.get("https://www.online.citibank.co.in/");
		
		//by default, implicit wait in web driver is 0 secs.
		//here in this example, we have made it as 3 secs
		//find invalid elements
		driver.findElementByXPath("//span[.='Login1222']");
//		driver.findElementByXPath("//span[.='Login1']").click();

	}

}
