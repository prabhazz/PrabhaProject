package webDriverThings;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicWebPageElement {
	private FirefoxDriver driver = null;
    private UtilityMethods utility = null;
	
	  @BeforeClass
	  public void beforeClass() {
		  
		  //implicit wait
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
			
		  //initialize utility object
		  utility = new UtilityMethods();
		
	  }
	
	  @BeforeTest
	  public void beforeTest() {
	  
		  //launch browser and maximize
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  
	  
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  
	  }

	  
	  @Test
	  public void basicWebElements() throws InterruptedException{
			//load demoqa site
			driver.get("http://demoqa.com/registration/");
			
			//fill first name
			driver.findElementById("name_3_firstname").sendKeys("AutomationUser1");
			
			//fill last name
			driver.findElementById("name_3_lastname").sendKeys("autouserlast");
			
			//marital status - radio button
			driver.findElementByXPath("//input[@value='single']").click();
			
			//hobby - check box
			if (!driver.findElementByXPath("//input[@value='dance']").isSelected()) {
				driver.findElementByXPath("//input[@value='dance']").click();
			}
			
			Thread.sleep(5000);
			utility.dropDown(driver, "Id", "dropdown_7", "India");
			
			//choose month, date and year
			Thread.sleep(5000);
			utility.dropDown(driver, "Name", "date_8[date][mm]", "9");
			utility.dropDown(driver, "Name", "date_8[date][dd]", "23");
			utility.dropDown(driver, "Name", "date_8[date][yy]", "1989");
			
			//enter phone number
			driver.findElementById("phone_9").sendKeys("9898989898");
			
			//user name
			driver.findElementById("username").sendKeys("autoUSer");
			
			//email
			driver.findElementById("email_1").sendKeys("hihi@gmail.com");
			
			//password
			driver.findElementById("password_2").sendKeys("Biscuit@123");
			
			//confirm password
			driver.findElementById("confirm_password_password_2").sendKeys("Biscuit@123");
			
			//submit
			driver.findElementByName("pie_submit").click();		  
	  }
	
	  @Test
	  public void implicitWait(){
		  
			//see implicit wait implementation in beforeClass
			driver.get("https://www.online.citibank.co.in/");
			
			//by default, implicit wait in web driver is 0 secs.
			//here in this example, we have made it as 3 secs
			driver.findElementByXPath("//span[.='Login']").click();

	  }

	  @Test
	  public void explicitWait(){
			driver.get("https://www.online.citibank.co.in/");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			//explicitly wait for 10 secs to find login button with its class name
			wait.until(ExpectedConditions.presenceOfElementLocated(By.className("txtSign")));   //explicit wait has been achieved using webDriverWait and ExpectedConditions
			
			//click on login button
			driver.findElementByXPath("//span[.='Login']").click();;  

	  }
	  
	  @Test
	  public void screenShot() throws IOException{
			driver.get("https://www.online.citibank.co.in/");
			WebDriverWait wait = new WebDriverWait(driver, 10);
			
			//explicitly wait for 10 secs to find login button with its class name
			wait.until(ExpectedConditions.presenceOfElementLocated(By.className("txtSign")));   //explicit wait has been achieved using webDriverWait and ExpectedConditions

			//take screen shot
			File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			org.apache.commons.io.FileUtils.copyFile(image, new File("C:\\image1.png"));
	  }
	  
	  @Test
	  public void frameHandling() throws InterruptedException{
			driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
			
			utility.movingToFrame(driver);
		  
	  }
	  
	  
	  @Test
	  public void windowHandling() throws InterruptedException{
			driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
			Thread.sleep(10000);

			driver.switchTo().frame(driver.findElementById("iframeResult"));
			driver.findElementByXPath("//a[.='Visit W3Schools.com!']").click();
			UtilityMethods utility = new UtilityMethods();
			utility.windowHandling(driver);		  
	  }
	  
	  @Test
	  public void dragAndDrop() throws InterruptedException{
			driver.get("http://demoqa.com/draggable/");
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
		
			Actions actions =new Actions(driver);
			Action action = actions.dragAndDropBy(driver.findElement(By.id("draggable")), 254, 24).build();
//			Action action = actions.dragAndDrop(driver.findElement(By.xpath("//li[.='Item 2']")), driver.findElement(By.xpath("//li[.='Item 5']"))).build();		
			action.perform();		  
	  }
	  
	  @AfterMethod
	  public void afterMethod() {

	  
	  }


	  @AfterClass
	  public void afterClass() {
		  
	  }


	  @AfterTest
	  public void afterTest() {
		  
		  //quit browser
		  driver.quit();
	  }	
	
	
}
