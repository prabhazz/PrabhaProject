package webDriverThings;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindRedColor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.kohls.com/");
		
		driver.findElementByXPath("//a[@id='pb_signin']").click();
		
		Thread.sleep(10000);
		
		//driver.findElementById("modal_kohls_login_signin_button").click();
		driver.findElement(By.id("modal_kohls_login_signin_button")).click();
		
		
		
		System.out.println(driver.findElementById("user_password").getCssValue("border-top-color"));
	}

}
