package testCasae;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.net.URL;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.*;
public class Selenium_Grid {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--remote-allow-origins=*");
 
		//chromeOptions.setCapability("browserVersion", "100");
		chromeOptions.setCapability("platformName", "Windows");
		// Showing a test name instead of the session id in the Grid UI
		// Other type of metadata can be seen in the Grid UI by clicking on the 
		// session info or via GraphQL
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
