package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	public LoginPage() {
		super();
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
	WebElement userNameField;
	@FindBy(id="password")
	WebElement passwordField;
	@FindBy(xpath="//button[@type='submit']")
	WebElement buttonSubmitField;
	@FindBy(id="message")
	WebElement messageField;
	
	
}
