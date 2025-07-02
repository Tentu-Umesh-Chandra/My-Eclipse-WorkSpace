package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	By userNameField = By.id("username");
	By passwordField = By.id("password");
	By buttonSubmitField  = By.xpath("//button[@type='submit']");
	By messageField = By.id("message");
	
	public void enterUserName(String userName) {
		driver.findElement(userNameField).sendKeys(userName);
	}
	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	public void clickBtn() {
		driver.findElement(buttonSubmitField).click();
	}
	
	public boolean isUserNameEnebled() {
		return driver.findElement(userNameField).isEnabled();
	}
	public boolean isPasswordEnabled() {
		return driver.findElement(passwordField).isEnabled();
	}
	public boolean isClickEnabled() {
		return driver.findElement(buttonSubmitField).isEnabled();
	}
	public boolean isMessageSuccess() {
		return driver.findElement(messageField).getText().equals("Welcome, Alex!");
	}
	public boolean isMessageFailure() {
		return driver.findElement(messageField).getText().equals("Invalid Credentials");
	}
}
