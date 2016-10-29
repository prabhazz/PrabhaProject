package webDriverThings;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class UtilityMethods {
	
	
	public void textBox(FirefoxDriver driver){
		WebElement textBox = driver.findElementById("userRegistrationForm:userName");
		textBox.sendKeys("user1");

		//to handle opened alert
		Alert alert = driver.switchTo().alert();
		alert.accept();	
	}

	public void clickLink(FirefoxDriver driver){
		WebElement link = driver.findElementByLinkText("Check Availability");
		link.click();
	}
	
	public void radioButton(FirefoxDriver driver){
		 WebElement radioButton =  driver.findElementById("userRegistrationForm:gender:0");
		 if(!radioButton.isSelected()){
			 radioButton.click();
		 }else{
			 System.out.println("radio button already selected");
		 }
	}
	
	public void checkBox(FirefoxDriver driver){
		String checkBoxLocator=null;
		 WebElement checkBox =  driver.findElementById(checkBoxLocator);
		 if(!checkBox.isSelected()){
			 checkBox.click();
		 }else{
			 System.out.println("check box already selected");
		 }
	}
	
	public void dropDown(FirefoxDriver driver,String locatorType, String locator, String valueToBeSelected) throws InterruptedException{
		//driver, "Id", "dropdown_7", "India" - incoming data
		WebElement dropDownLocator = null;
		if(locatorType.equals("Id")){
			dropDownLocator = driver.findElementById(locator);
		}else if(locatorType.equals("Name")){
			dropDownLocator = driver.findElementByName(locator);
		}else if(locatorType.equals("Xpath")){
			dropDownLocator = driver.findElementByXPath(locator);
		}else{
			Assert.fail("not a valid locator type has been passed");
		}
			
		
		Select dropdown = new Select(dropDownLocator);
		
/**		//select by index
 		//but selectByValue access invisible drop down options. 
		dropdown.selectByIndex(2);
		driver.wait(10000); **/
		
		dropdown.selectByValue(valueToBeSelected);
		

/**		//select by visible text
 * 		//selectByVisibleText() access only the elements visible in the drop down.
		dropdown.selectByVisibleText("What make was your first car or bike?");
		**/
	} 
	
	public void javaScriptAlert(FirefoxDriver driver, boolean accept)
	{
		WebElement link = driver.findElementByLinkText("Check Availability");
		link.click();
		
		//move control to alert
		Alert alert = driver.switchTo().alert();

		//to get the text from alert box
		alert.getText();
		
		if(accept){
			alert.accept();	
		}else{
			alert.dismiss();
		}
	}
	
	public void windowHandling(FirefoxDriver driver) throws InterruptedException{

		String parentWindow = driver.getWindowHandle();
		for(String windowHandle:driver.getWindowHandles()){
			
			System.out.println("window id is "+windowHandle);
			if (!parentWindow.equals(windowHandle)){
				driver.switchTo().window(windowHandle);	
				driver.manage().window().maximize();
				Thread.sleep(5000);
				driver.findElementById("navbtn_tutorials").click();
				Thread.sleep(10000);
			}
			//moving the control back to parent window
			driver.switchTo().window(parentWindow);
		}
		
	}
	
	public void movingToFrame(FirefoxDriver driver) throws InterruptedException{

/**		<body>
		    <div class="box">
		      <iframe name="iframe1" id="IF1" height="600" width="400" src="http://toolsqa.com"></iframe>
		    </div>
		    <div class="box">
		      <iframe name="iframe2" id="IF2" height="600" width="400" align="left" src="http://demoqa.com"></iframe>
		    </div>
	   </body>   **/
		
		//switch to frame by webElement
//		driver.switchTo().frame(1);   //by index
		driver.switchTo().frame(driver.findElementById("iframeResult"));
		Thread.sleep(5000);
		
		//click on the link to open new window
		driver.findElementByXPath("//a[.='Visit W3Schools.com!']").click();
		Thread.sleep(5000);
		
		//to get control out of iframe to main page`
		driver.switchTo().defaultContent();
/**
		//switch to frame by index
		driver.switchTo().frame(1);
		
		//switch to frame by name or id
		driver.switchTo().frame("");
		
		*/
	}	
	
	public void getScreenShot(FirefoxDriver driver, String fileNameWithpath) throws IOException 
	{
		java.io.File image = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(image, new java.io.File(fileNameWithpath));
//		File fil = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	}		
}
