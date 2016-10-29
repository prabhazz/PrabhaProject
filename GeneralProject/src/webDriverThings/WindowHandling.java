package webDriverThings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		Thread.sleep(10000);

		driver.switchTo().frame(driver.findElementById("iframeResult"));
		driver.findElementByXPath("//a[.='Visit W3Schools.com!']").click();
		UtilityMethods utility = new UtilityMethods();
		utility.windowHandling(driver);

		driver.close();
	}

}
