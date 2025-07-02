package testCasae;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class Program_Scroll {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\2408320\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		EdgeDriver driver = new EdgeDriver(options);
		driver.get("https://www.selenium.dev");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js=driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		driver.get("https://webapps.tekstac.com/RentaCar/");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.keyDown(Keys.SHIFT).build().perform();
		driver.findElement(By.id("name")).sendKeys("rajat");
		act.keyUp(Keys.SHIFT).build().perform();
		driver.findElement(By.id("name")).sendKeys(" sharma");
	}
}
