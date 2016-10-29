package webDriverThings;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.online.citibank.co.in/");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//explicitly wait for 10 secs to find login button with its class name
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("txtSign")));   //explicit wait has been achieved using webDriverWait and ExpectedConditions
		//click on login button
		driver.findElementByXPath("//span[.='Login']").click();;  

	}

}
