package base;

import config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    protected WebDriver driver;
    protected ConfigReader config = new ConfigReader();

    public void setup() {
        String browser = config.getProperty("browser");
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } 
        else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("edge")) {
        	driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.get(config.getProperty("baseURL"));
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
