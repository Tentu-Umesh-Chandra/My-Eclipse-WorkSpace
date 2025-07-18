package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class StudentTravelInsurancePage {
 
	WebDriver driver;
    WebDriverWait wait;
    
    public StudentTravelInsurancePage(WebDriver driver) {
    	this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//i[@class='icon-bg homeIconsBg icon-bg-new ti']")
    WebElement travelInsuranceIcon;
    By selectCountry = By.id("country");
    @FindBy(xpath = "//li[@class='search-item']")
    WebElement clickCountry;
    @FindBy(xpath = "//span[contains(text(), 'Start')]")
    WebElement startDateInput;
    By monthHeader = By.xpath("(//h6)[1]");
    @FindBy(xpath = "(//button[@data-mui-test = 'next-arrow-button'])[2]")
    WebElement nextArrow;
    @FindBy(xpath = "//button[contains(text(), 'Continue')]")
    WebElement continueButton;
    By passengerCount = By.xpath("//*[@id=\"modal-root\"]/section/article/div/div/div[2]/div[1]/div[1]/div[2]/label");
    @FindBy(xpath = "(//div[@class='inputRow select '])[1]")
    WebElement student1AgeDropdown;
    @FindBy(xpath = "//label[@for='22 years_undefined']")
    WebElement student1Age;
    @FindBy(xpath = "(//div[@class='inputRow select '])[2]")
    WebElement student2AgeDropdown;
    @FindBy(xpath = "//label[@for='21 years_undefined']")
    WebElement student2Age;
    @FindBy(xpath = "//label[@for='ped_no']")
    WebElement medicalStatusNo;
    @FindBy(xpath = "//button[contains(text(),'Done')]")
    WebElement doneButton;
    By clickSortBy = By.xpath("//*[@id=\"root\"]/div/div[2]/aside/section[1]/details/summary/p");
    @FindBy(xpath = "//input[@value='Premium low to high']")
    WebElement sortLowToHigh;
    @FindBy(xpath = "//p[@class='quotesCard--insurerName']")
    java.util.List<WebElement> insurerNames;
    @FindBy(xpath = "//span[@class='premiumPlanPrice']")
    java.util.List<WebElement> insurerPrices;
 
 
public void selectTravelInsurance() {
        travelInsuranceIcon.click();
    }
 
    public void enterCountry(String country) {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(selectCountry)).sendKeys(country);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(selectCountry)).click();
    	clickCountry.click();
    	
    	startDateInput.click();
    }
 
    public void selectDate(String date) {
        String month = date.split(" ")[0];
        while (true) {
            if (wait.until(ExpectedConditions.elementToBeClickable(monthHeader)).getText().contains(month)) {
                WebElement dateButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label ='" + date + "']")));
                dateButton.click();
                break;
            } else {
                nextArrow.click();
            }
        }
    }
 
public void fillPassengerDetails() {
        continueButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(passengerCount)).click();
        student1AgeDropdown.click();
        student1Age.click();
        student2AgeDropdown.click();
        student2Age.click();
        medicalStatusNo.click();
        doneButton.click();
    }
 
    public void sortAndDisplayTopPlans() {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(clickSortBy)).click();
        sortLowToHigh.click();
        for (int i = 0; i < 3 && i < insurerNames.size(); i++) {
            System.out.println(insurerNames.get(i).getText() + " - " + insurerPrices.get(i).getText());
        }
    }
    
}
