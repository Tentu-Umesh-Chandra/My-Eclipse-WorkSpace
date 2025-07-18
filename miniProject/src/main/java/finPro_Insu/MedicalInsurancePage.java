package finPro_Insu;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class MedicalInsurancePage {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public MedicalInsurancePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	//POM for Each WebElement
    By viewAllProductsLocator = By.xpath("//a[contains(text(), 'View all products')]");
    By noOfMenuItems = By.xpath("//p[contains(text(),'Health Insurance')]/following-sibling::ul/li/a/span[1]");
    
    public void robertClass() throws Exception {
    	Robot robot = new Robot();
        
        // Press and hold the Control key
        robot.keyPress(KeyEvent.VK_CONTROL);
 
        // Press the minus key
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        
        // Press the minus key
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        
        // Press the minus key
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
 
        // Release the Control key
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }
	
    public void viewAllProductsOptions() {
    	// Wait until the "View all products" button is visible
        WebElement viewAllProducts = wait.until(ExpectedConditions.visibilityOfElementLocated(viewAllProductsLocator));
 
        // Click the button
        viewAllProducts.click();
    }
    
    public void menuItems() {
    	//create the list of menuitems in health insurance
        List<WebElement> healthInsurance = driver.findElements(noOfMenuItems);
        for(int i = 0; i < healthInsurance.size(); i++) {
        	//get the text for each element in list
	        String msg =healthInsurance.get(i).getText();
	        System.out.println(msg);
        }
    }
}
 
 