package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
public class BaseTest {
	static WebDriver driver;
	static Properties propertiesObj;
	public static WebDriver initilizeBrowser() throws IOException {
		if(getProperties().getProperty("execution_env").equalsIgnoreCase("remote")) {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			//os
			if (getProperties().getProperty("os").equalsIgnoreCase("windows")) {
				capabilities.setPlatform(Platform.WIN11);
			}
			else if (getProperties().getProperty("os").equalsIgnoreCase("mac")) {
				capabilities.setPlatform(Platform.MAC);
			}
			else {
				System.out.println("No matching OS..");
		    }
			//browser
			switch (getProperties().getProperty("browser").toLowerCase()) {
		    	case "chrome":
		    		capabilities.setBrowserName("chrome");
		    		break;
		    	case "edge":
		    		capabilities.setBrowserName("MicrosoftEdge");
		    		break;
		    	default:
		    		System.out.println("No matching browser");
			}       
			driver = new RemoteWebDriver(new URL("http://localhost:4444/ui/"),capabilities);
		}
		else if(getProperties().getProperty("execution_env").equalsIgnoreCase("local")) {
			switch(getProperties().getProperty("browser").toLowerCase()) {
				case "chrome":
					driver=new ChromeDriver();
					break;
				case "edge":
					driver=new EdgeDriver();
					break;
				default:
					System.out.println("No matching browser");
					driver=null;
			}
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		return driver;
	}
 
	public static WebDriver getDriver() {
		return driver;
	}
 
	public static Properties getProperties() throws FileNotFoundException, IOException{		
		propertiesObj = new Properties();
		propertiesObj.load(new FileInputStream("data.properties"));
		return propertiesObj;
	}
	public static String getKeyValue(String url) {
		return propertiesObj.getProperty(url);
	}
	public static void tearDown() {
		if(driver != null) {
			driver.quit();
		}
	}
}