package webDriverThings;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		UtilityMethods utility = new UtilityMethods();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		
		
		utility.movingToFrame(driver);
	}

}
