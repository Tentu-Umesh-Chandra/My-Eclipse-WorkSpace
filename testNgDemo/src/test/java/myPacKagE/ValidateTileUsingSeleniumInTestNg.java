package myPacKagE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidateTileUsingSeleniumInTestNg {
	ChromeDriver driver;
	@BeforeClass
	public void openDriver() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void validateTile() {
		Assert.assertTrue(driver.getTitle().equals("Google"));
		driver.close();
	}
	@Test
	public void validateSearchContainsAKeyWord() throws InterruptedException {
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("selenium");
		search.submit();
		Thread.sleep(10000);
		//h3 class
	}
	
}