package testNGExamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGClass {
	
	/**annotations covered here
	all basic annotations
	enabled
	invocationCount
	priority
	
	*/
  @Test(enabled=true,priority=2)
  public void testCase1() {
	  System.out.println("test case 1 executing");
	  
  }
  @Test(invocationCount=3,priority=1)
  public void testCase2() throws FileNotFoundException {
	  System.out.println("test case 2 executing");
  }  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");
  }
  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }

  
}