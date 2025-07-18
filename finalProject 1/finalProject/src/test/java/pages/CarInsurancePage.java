package pages;

import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CarInsurancePage {
	WebDriver driver;
    WebDriverWait wait;
    public CarInsurancePage(WebDriver driver) {
    	this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    By carOption = By.xpath("//p[contains(text(), 'Car')]");
    By clickOption = By.xpath("//span[contains(text(), 'Click')]");
    By bangaloreOption = By.xpath("//span[contains(text(), 'Bangalore')]");
    By tataOption = By.xpath("//span[contains(text(), 'TATA')]");
    By punchOption = By.xpath("//li[contains(text(), 'Punch')]");
    By petrolOption = By.xpath("//li[contains(text(), 'Petrol')]");
    By packOption = By.xpath("//li[contains(text(), 'Pure')]");
    By selectDropdown = By.xpath("//select");
    By inputField = By.xpath("(//input)[2]");
    By errorText = By.xpath("(//div)[36]");
    public void selectCarInsurance() {
    	driver.findElement(carOption).click();
    }
    public void newCarDetails() {
    	wait.until(ExpectedConditions.elementToBeClickable(clickOption)).click();
    	wait.until(ExpectedConditions.elementToBeClickable(bangaloreOption)).click();
    	wait.until(ExpectedConditions.elementToBeClickable(tataOption)).click();
    	wait.until(ExpectedConditions.elementToBeClickable(punchOption)).click();
    	wait.until(ExpectedConditions.elementToBeClickable(petrolOption)).click();
        wait.until(ExpectedConditions.elementToBeClickable(packOption)).click();
    }
    public void getErrorMsg(String phoneNo) {
    	wait.until(ExpectedConditions.elementToBeClickable(selectDropdown)).click();
    	wait.until(ExpectedConditions.elementToBeClickable(inputField)).sendKeys(phoneNo);
    	WebElement errorElement = driver.findElement(errorText);
        String text = errorElement.getAttribute("textContent");
        System.out.println("Extracted Error text: " + text);
    }
}