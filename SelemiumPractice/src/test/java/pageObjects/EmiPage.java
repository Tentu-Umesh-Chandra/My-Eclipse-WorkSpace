package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmiPage {
	private WebDriver driver;
	private By amountField = By.id("amount");
	private By yearField = By.id("year");
	private By roiField = By.id("roi");
	
	public EmiPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getAmount(){
		return this.driver.findElement(amountField);
	}
	public WebElement getYear(){
		return this.driver.findElement(yearField);
	}
	public WebElement getRoi(){
		return this.driver.findElement(roiField);
	}
}
