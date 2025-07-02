package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class EmiPage2 {
	private WebDriver driver;
	@FindBy(id="amount")
	private WebElement amountField;
	@FindBy(id="year")
	private WebElement yearField;
	@FindBy(id="roi")
	private WebElement roiField;
	
	public EmiPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//	public EmiPage2(WebDriver driver) {
//		this.driver = driver;
//	}
	public WebElement getAmount(){
		return (amountField);
	}
	public WebElement getYear(){
		return (yearField);
	}
	public WebElement getRoi(){
		return (roiField);
	}
}
