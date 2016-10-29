package webDriverThings;

import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/autocomplete/");
		driver.manage().window().maximize();
		//if you are able to edit the text box, you can enter the text and then TAB to get out
//		driver.findElementById("tagss").sendKeys("Java",Keys.TAB);
		
		
		//if you are not able to edit text box, you can use KEYS.down
		driver.findElementById("tagss").sendKeys("a");
		driver.findElementById("tagss").sendKeys(Keys.DOWN);
		driver.findElementById("tagss").sendKeys(Keys.DOWN);
		driver.findElementById("tagss").sendKeys(Keys.DOWN);
		driver.findElementById("tagss").sendKeys(Keys.TAB);
		
		
		Thread.sleep(5000);
		
	}

	@Test
	public void test(){
		
	}
}
