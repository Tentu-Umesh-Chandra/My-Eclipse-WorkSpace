package finPro_Insu;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class StuTraInsu {
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new EdgeDriver();

		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        driver.get("https://policybazaar.com");
        driver.manage().window().maximize();
        
        //POM
        By travelInsurance = By.xpath("//i[@class='icon-bg homeIconsBg icon-bg-new ti']");
        By selectCountry = By.id("country");
        By clickItaly = By.xpath("//li[contains(text(),'Italy')]");
        By startDateInput = By.xpath("//span[contains(text(), 'Start')]");
        By monthSelect = By.xpath("(//h6)[1]");
        By clickNextArrow = By.xpath("(//button[@data-mui-test = 'next-arrow-button'])[2]");
        By continueButton = By.xpath("//button[contains(text(), 'Continue')]");
        By selectNoOfPassengers = By.xpath("//label[contains(text(), '2')]");
        By clickStudent1Age = By.xpath("(//div[@class='inputRow select '])[1]");
        By selectStudent1Age = By.xpath("//label[@for='22 years_undefined']");
        By clickStudent2Age = By.xpath("(//div[@class='inputRow select '])[2]");
        By selectStudent2Age = By.xpath("//label[@for='21 years_undefined']");
        By MedStatusNo = By.xpath("//label[@for='ped_no']");
        By clikDoneInfo = By.xpath("//button[contains(text(),'Done')]");
        By clickSortBy = By.xpath("//*[@id=\"root\"]/div/div[2]/aside/section[1]/details/summary/p");
        By clickSortByLowToHigh = By.xpath("//input[@value='Premium low to high']");
        By insuranceProviderName = By.xpath("//p[@class='quotesCard--insurerName']");
        By insurancePrice = By.xpath("//span[@class='premiumPlanPrice']");
        
        driver.findElement(travelInsurance).click();
        
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectCountry)).sendKeys("Italy");
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectCountry)).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickItaly)).click();
        
        //Selecting From Date
        wait.until(ExpectedConditions.elementToBeClickable(startDateInput)).click();
        String startDate = "Jul 29, 2025";
        String startMonth = startDate.split(" ")[0];
        boolean startCheck = true;
        //From Date Picker
        while(startCheck) {
        	WebElement startDateBuffer= wait.until(ExpectedConditions.elementToBeClickable(monthSelect));
        	String startBufferCheck = startDateBuffer.getText();
        	if(startBufferCheck.contains(startMonth)) {
        		WebElement startDateClick= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label ='" + startDate + "']")));
        		startDateClick.click();
        		startCheck = false;
        	}
        	else {
        		WebElement nextClick= wait.until(ExpectedConditions.elementToBeClickable(clickNextArrow));
        		nextClick.click();
        	}
        }
        
        //To Date Picker
        String endDate = "Aug 29, 2025";
        String endMonth = endDate.split(" ")[0];
        boolean endCheck = true;
        while(endCheck) {
        	WebElement endDateBuffer= wait.until(ExpectedConditions.elementToBeClickable(monthSelect));
        	String endBufferCheck = endDateBuffer.getText();
        	if(endBufferCheck.contains(endMonth)) {
        		WebElement endDateClick= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label ='" + endDate + "']")));
        		endDateClick.click();
        		endCheck = false;
        	}
        	else {
        		WebElement nextClick= wait.until(ExpectedConditions.elementToBeClickable(clickNextArrow));
        		nextClick.click();
        	}
        }
        
        
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
        
        //Selecting No of Students
        WebElement noOfPassenger= wait.until(ExpectedConditions.elementToBeClickable(selectNoOfPassengers));
        noOfPassenger.click();
        
        //Selecting Age
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickStudent1Age)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectStudent1Age)).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickStudent2Age)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectStudent2Age)).click();
        
        //Clicking for the medical Status
        wait.until(ExpectedConditions.visibilityOfElementLocated(MedStatusNo)).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(clikDoneInfo)).click();
        
        
        driver.get("https://travel.policybazaar.com/quotes?encp=RldOWWlZN3lYU3pNd0h2d2Rxd0djdz09&family=0&isPlanCTAExp=1&isRepeatMember=0&msclkid=b523b7aa6d0119ae0187dfc5d59d39bf&newpq=1&profiletypeid=1&sum_insured=d60&token=eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpYXQiOjE3NTIyMzAwOTUsImp0aSI6ImVlNzQ1YzlhLTg4YTQtNGZiZS1iMDY4LTI4NWY0OWVhYzdjMSIsIlByb3Bvc2VySUQiOiI0NzI4MzAxIiwibmJmIjoxNzUyMjMwMDk1LCJleHAiOjE3NTQ4NTgwOTUsImlzcyI6InRyYXZlbC5wb2xpY3liYXphYXIuY29tIiwiYXVkIjoidHJhdmVsIn0.Likrwg-VFw3cmytq6_P0zty5Zl7__l7C-eik3gd-3rIuLpe_eiJIQS8-Fl2wqrAsOn-k_PKuFJQ2naQ8V5JEDQllNwprzxFuvowj-AWCNtc1jn_1EjFTqdskrbAKdEx2KPZDbR-qF7iied6rVz-x6inrXQ9z_W4NUM6RWqkuFqtP8H8J1peCGqWX0r7dcqOPNZpnct1gkRPOj2jj7NSUwVocDkXluBwKDOhpd3WybFeTbzy6f6-vuOnDw59Obp3NzHvDQH0uJ3HVyYnGzsZuAozLvPQAwqAaR9kQbQycX9ygjDPlNIL74rhv5V2ruet_7QdHvrFxEwONLfeqpHvmZg&utm_campaign=PolicyBazaar00PolicyBazaar&utm_content=newpq&utm_medium=cpc&utm_source=yahoo_brand&utm_term=newjourney&visa_type=d32");
        
        //Sorting Prices From low to high
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickSortBy)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickSortByLowToHigh)).click();
        
        //Storing the Insurance provider and its price in a 2 List's
        List<WebElement> insurenceName = driver.findElements(insuranceProviderName);
        
        List<WebElement> insurencePrice = driver.findElements(insurancePrice);
        for(int i = 0; i < 3; i++) {
        	//Displaying the three lowest international  travel insurance plan with amount and insurance provider company
        	System.out.println(insurenceName.get(i).getText() + " " +insurencePrice.get(i).getText());
        }
	}
}
