package webDriverThings;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/draggable/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	
		Actions actions =new Actions(driver);
		
		//use layout option in in firefox to get x and y offset. layout option will be displayed when firebug is enabled.
		
		Action action = actions.dragAndDropBy(driver.findElement(By.id("draggable")), 254, 24).build();
//		Action action = actions.dragAndDrop(driver.findElement(By.xpath("//li[.='Item 2']")), driver.findElement(By.xpath("//li[.='Item 5']"))).build();		
		action.perform();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
