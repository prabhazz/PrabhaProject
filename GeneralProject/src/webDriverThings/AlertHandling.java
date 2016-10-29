package webDriverThings;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//button[contains(text(),'Try it')]").click();
		Thread.sleep(5000);
		driver.switchTo().alert();
		
		
		
		Alert alert = driver.switchTo().alert();
		
		alert.getText();
		Thread.sleep(5000);
		alert.accept();
		
		
	}

}
