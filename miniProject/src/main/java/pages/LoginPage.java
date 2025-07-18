package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;
    
    //Using POM 
    @FindBy(name="username") 
    WebElement userNamePom;
    @FindBy(name="password") 
    WebElement passwordPom;
    By submitPom = By.xpath("//button[@type='submit']");
    
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    public void setUserName(String username) {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	userNamePom.sendKeys(username);
    }
    public void setPassword(String password) {
    	passwordPom.sendKeys(password);
    }
    public void clickSubmit() {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(submitPom)).click();
    }
    /*
    public void login(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
    */
}
