package pages;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ConfigReader;
import utils.ScreenshotUtil;

public class CarInsurancePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;

    public CarInsurancePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        this.actions = new Actions(driver);
    }
    public void navigateToCarInsurance() throws InterruptedException {
    	WebElement Car = driver.findElement(By.xpath("//div[@class='prd-block car']//div/div[1]"));
		actions.moveToElement(Car).click().build().perform();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[@class='CarRegDetails_blueTextButton__P1blP blueTextButton fontMedium']")))).click();
		Thread.sleep(2000);
    }
    public void selectCarDetails() throws InterruptedException {
    	WebElement city = driver.findElement(By.xpath("//div[@class=\"slideToLeft\"]//ul//li[2]"));
		actions.moveToElement(city).click().build().perform();
		Thread.sleep(2000);
		WebElement cc = driver.findElement(By.xpath("//div[@class=\"animationWrap\"]/ul/li[1]"));
		actions.moveToElement(cc).click().build().perform();
		Thread.sleep(2000);
		WebElement Brand = driver.findElement(By.xpath("//div[@class='carModelsWrap']/div[3]/ul/li[2]"));
		actions.moveToElement(Brand).click().build().perform();
		Thread.sleep(2000);
		WebElement Type = driver.findElement(By.xpath("//div[@class=\"animationWrap\"]/ul/li[1]"));
		actions.moveToElement(Type).click().build().perform();
		Thread.sleep(2000);
		List<WebElement> L = driver.findElements(By.xpath("//div[@class=\"animationWrap\"]/ul/li"));
		WebElement L1 = L.get(1);
		actions.moveToElement(L1).click().build().perform();
		Thread.sleep(2000);
    }
    public void enterUserDetails() throws IOException {
    	String name = ConfigReader.getProperty("user.name");
    	String mobile = ConfigReader.getProperty("user.mobile");
    	driver.findElement(By.xpath("//div[@class=\"inputBox \"]/input")).sendKeys(name);
		driver.findElement(By.xpath("//div[@class=\"countryCodeMob\"]/input")).sendKeys(mobile);
		WebElement submit = driver.findElement(By.xpath("//div[@class=\"submitBtn\"]/button"));
		actions.moveToElement(submit).click().build().perform();
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String filePath = "outputs/screenshots/" + "ScreenShot" + "_" + timestamp + ".png";
		ScreenshotUtil.takeScreenshot(driver, filePath);
//		ScreenshotUtil.takeScreenshot(driver, "outputs/screenshots/screenshot.png");
    }
    public String RandomUtils() {
    	String res = RandomStringUtils.randomAlphabetic(3,5);
    	return res;
    }

}
