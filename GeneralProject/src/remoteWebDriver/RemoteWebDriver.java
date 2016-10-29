package remoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class RemoteWebDriver {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		//java -jar selenium-server-standalone-2.49.1.jar -role hub
		//C:\selenium>java -jar selenium-server-standalone-2.49.1.jar -role node -port 5555 debug mode hub http://172.20.10.3:4444/grid/register \browser browserName=firefox,platform=WINDOWS
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		
		org.openqa.selenium.remote.RemoteWebDriver driver = new org.openqa.selenium.remote.RemoteWebDriver(new URL("http://localhost:4444"), capabilities);
		
		
		driver.get("http://www.yahoo.com");
		
	}

}
