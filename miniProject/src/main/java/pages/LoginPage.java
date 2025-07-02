package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    
    //Using POM 
    @FindBy(name="username") 
    WebElement userNamePom;
    @FindBy(name="password") 
    WebElement passwordPom;
    @FindBy(css="button[type='submit']")
    WebElement submitPom;
    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public void setUserName(String username) {
    	userNamePom.sendKeys(username);
    }
    public void setPassword(String password) {
    	passwordPom.sendKeys(password);
    }
    public void clickSubmit() {
    	submitPom.click();
    }
    /*
    public void login(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
    */
}
