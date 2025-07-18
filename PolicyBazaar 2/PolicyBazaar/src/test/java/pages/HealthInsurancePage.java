package pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class HealthInsurancePage {
    private WebDriver driver;
    private Actions actions;

    public HealthInsurancePage(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
    }
    public void hoverHealthMenu() throws InterruptedException {
        driver.navigate().refresh();
        Thread.sleep(2000);
        WebElement menu = driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/ul/li[2]/a"));
        actions.moveToElement(menu).perform();
        Thread.sleep(1000);
        WebElement healthSection = driver.findElement(By.xpath("//div[@class='ruby-row']/div[3]/h3"));
        actions.moveToElement(healthSection).perform();
    }

    public List<String> getHealthMenuItems() throws InterruptedException {
    	Thread.sleep(2000);        
    	List<WebElement> items = driver.findElements(By.xpath("//div[@class='ruby-row']/div[3]//li"));
        List<String> menuTexts = new ArrayList<>();
        for (WebElement item : items) {
            menuTexts.add(item.getText());
        }
        return menuTexts;
    }
}
