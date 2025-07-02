package testCasae;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTest {
	EdgeDriver driver;
	@BeforeMethod
	void setup() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2408320\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver(options);
	}
	@AfterMethod
	void tearDown() throws InterruptedException{
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	void methodA() {
		
		driver.get("https://www.geeksforgeeks.org/");
		
	}
	@Test
	void methodB() {
		driver.get("https://www.amazon.com/");
		
	}
	@Test
	void method() {
		driver.get("https://www.flipkart.com/");
		
	}
}
