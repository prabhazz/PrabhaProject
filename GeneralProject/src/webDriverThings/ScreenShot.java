package webDriverThings;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.corba.se.impl.util.Utility;
import com.sun.jna.platform.FileUtils;

public class ScreenShot {

	static UtilityMethods utility = new UtilityMethods();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.online.citibank.co.in/");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//explicitly wait for 10 secs to find login button with its class name
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("txtSign")));   //explicit wait has been achieved using webDriverWait and ExpectedConditions
		
//		File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		org.apache.commons.io.FileUtils.copyFile(image, new File("C:\\image1.png"));
		
		utility.getScreenShot(driver, "C:\\imageNew.png");
	}
	
	
	

}
