package bases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	protected WebDriver driver;
	public void initializeBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void closeBrowser() {
		driver.quit();
	}
}
