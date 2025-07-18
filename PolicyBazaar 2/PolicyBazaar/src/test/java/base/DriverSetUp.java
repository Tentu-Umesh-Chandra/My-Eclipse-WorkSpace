package base;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

public class DriverSetUp {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void initializeDriver(String browser) {
        setupLocalDriver(browser);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    private static void setupLocalDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
        	ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-blink-features=AutomationControlled");
            options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
        } else if (ConfigReader.getProperty(browser).equalsIgnoreCase("edge")) {
        	EdgeOptions options = new EdgeOptions();
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-blink-features=AutomationControlled");
            options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver(options);
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
