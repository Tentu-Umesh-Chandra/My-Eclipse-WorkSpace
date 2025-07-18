package pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TravelInsurancePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public TravelInsurancePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void navigateToTravelInsurance() throws InterruptedException {
        driver.get("https://www.policybazaar.com");
        driver.findElement(By.xpath("//i[@class='icon-bg homeIconsBg icon-bg-new ti']")).click();
        Thread.sleep(2000);
    }
    public void fillTravelDetails() throws InterruptedException {
    	Thread.sleep(2000);
		driver.findElement(By.xpath("//p[normalize-space()='USA']")).click();
		WebElement startDate = driver.findElement(By.xpath("//article[@class='newPq_duration_wrap']//div[1]"));
		startDate.click();
		Thread.sleep(2000);
	    List<WebElement> StartDate = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//button[@class=\"MuiButtonBase-root MuiPickersDay-root MuiPickersDateRangeDay-day MuiPickersDateRangeDay-notSelectedDate MuiPickersDateRangeDay-dayOutsideRangeInterval\"]"))));
	    for(int i = 0; i < StartDate.size();i++) {
	    	if(StartDate.get(i).isEnabled()) {
	    		StartDate.get(i).click();
	    		break;
	    	}
	    }
		Thread.sleep(2000);
		List<WebElement> EndDate = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//button[@class=\"MuiButtonBase-root MuiPickersDay-root MuiPickersDateRangeDay-day MuiPickersDateRangeDay-notSelectedDate MuiPickersDateRangeDay-dayOutsideRangeInterval\"]"))));
	    for(int i = 0; i < EndDate.size();i++) {
	    	if(EndDate.get(i).isEnabled()) {
	    		EndDate.get(i+15).click();
	    		break;
	    	}
	    }
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"modal-root\"]/section/article/div/div/div[2]/div[3]/div/button")))).click();
		Thread.sleep(2000);
		WebElement p = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='memSelectRadioWrapper']/div[2]//label")));
		p.click();
		driver.findElement(By.xpath("//div[@class=\"pqMembersAgeWrap\"]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"options_box_wrapper\"]/div[24]//label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"pqMembersAgeWrap\"]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"options_box_wrapper\"]/div[23]//label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"ped_no\"]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Done']")).click();
    }
    public void applyFiltersAndSort() throws InterruptedException {
    	Thread.sleep(6000);
    	WebElement view = driver.findElement(By.cssSelector(".pqCtaWrapper>button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", view);
        view.click();

        Thread.sleep(2000);
        driver.findElement(By.id("studentTrip")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class='options_box_wrapper ageOptions']/div[1]/input")).click();
        driver.findElement(By.xpath("//div[@class='options_box_wrapper ageOptions']/div[2]/input")).click();

        WebElement durationDropdown = driver.findElement(By.id("feet"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", durationDropdown);
        durationDropdown.click();
        driver.findElement(By.xpath("//option[text()='90 Days']")).click();

        WebElement apply = driver.findElement(By.xpath("//div[@class='pqCtaWrapper']/button"));
        wait.until(ExpectedConditions.elementToBeClickable(apply)).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//p[@class='filter_name_heading']")).click();
        driver.findElement(By.id("17_sort")).click();
    }
    public List<String> getCompanyNames() {
        List<WebElement> companies = driver.findElements(By.xpath("//p[@class='quotesCard--insurerName']"));
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 3 && i < companies.size(); i++) {
            names.add(companies.get(i).getText());
        }
        return names;
    }
    public List<String> getPlanPrices() {
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='premiumPlanPrice']"));
        List<String> amounts = new ArrayList<>();
        for (int i = 0; i < 3 && i < prices.size(); i++) {
            amounts.add(prices.get(i).getText());
        }
        return amounts;
    }
}
