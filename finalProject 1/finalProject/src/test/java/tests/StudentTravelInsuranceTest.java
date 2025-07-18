package tests;
 
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CarInsurancePage;
import pages.MedicalInsurancePage;
import pages.StudentTravelInsurancePage;
import utils.ExcelUtils;
 
public class StudentTravelInsuranceTest extends BaseTest {
	public static WebDriver driver;
	
	private static StudentTravelInsurancePage travelInsurance;
	private static MedicalInsurancePage medicalInsurance;
	private static CarInsurancePage carInsurance;
	
	@BeforeClass
	public WebDriver createDriver() throws Exception{
		driver = initilizeBrowser();
		return driver;
		
	}
	
	@BeforeMethod
	public WebDriver setUp() throws Exception{
		driver.get(getKeyValue("appURL"));
		travelInsurance = new StudentTravelInsurancePage(driver);
		medicalInsurance = new MedicalInsurancePage(driver);
		carInsurance = new CarInsurancePage(driver);
		return driver;
		
	}
	
	@DataProvider(name = "data")
	public String[][] dataproviderForStudent() throws Exception{
		// extracting data from excel
		return ExcelUtils.getCellData("testData/travelData.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "phone")
	public String[][] dataproviderForCar() throws Exception{
		// extracting data from excel
		return ExcelUtils.getCellData("testData/phoneData.xlsx", "Sheet1");
	}
	
    @Test(dataProvider = "data")
    public void testTravelInsuranceFlow(String country, String startDate, String endDate) {
    	travelInsurance.selectTravelInsurance();
    	travelInsurance.enterCountry(country);
    	travelInsurance.selectDate(startDate);
    	travelInsurance.selectDate(endDate);
    	travelInsurance.fillPassengerDetails();
 
        //driver.get("https://travel.policybazaar.com/quotes?..."); // Replace with actual URL
        //driver.get("https://travel.policybazaar.com/quotes?encp=RldOWWlZN3lYU3pNd0h2d2Rxd0djdz09&family=0&isPlanCTAExp=1&isRepeatMember=0&msclkid=b523b7aa6d0119ae0187dfc5d59d39bf&newpq=1&profiletypeid=1&sum_insured=d60&token=eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpYXQiOjE3NTIyMzAwOTUsImp0aSI6ImVlNzQ1YzlhLTg4YTQtNGZiZS1iMDY4LTI4NWY0OWVhYzdjMSIsIlByb3Bvc2VySUQiOiI0NzI4MzAxIiwibmJmIjoxNzUyMjMwMDk1LCJleHAiOjE3NTQ4NTgwOTUsImlzcyI6InRyYXZlbC5wb2xpY3liYXphYXIuY29tIiwiYXVkIjoidHJhdmVsIn0.Likrwg-VFw3cmytq6_P0zty5Zl7__l7C-eik3gd-3rIuLpe_eiJIQS8-Fl2wqrAsOn-k_PKuFJQ2naQ8V5JEDQllNwprzxFuvowj-AWCNtc1jn_1EjFTqdskrbAKdEx2KPZDbR-qF7iied6rVz-x6inrXQ9z_W4NUM6RWqkuFqtP8H8J1peCGqWX0r7dcqOPNZpnct1gkRPOj2jj7NSUwVocDkXluBwKDOhpd3WybFeTbzy6f6-vuOnDw59Obp3NzHvDQH0uJ3HVyYnGzsZuAozLvPQAwqAaR9kQbQycX9ygjDPlNIL74rhv5V2ruet_7QdHvrFxEwONLfeqpHvmZg&utm_campaign=PolicyBazaar00PolicyBazaar&utm_content=newpq&utm_medium=cpc&utm_source=yahoo_brand&utm_term=newjourney&visa_type=d32");
    	driver.get(getKeyValue("getURL"));
        travelInsurance.sortAndDisplayTopPlans();
    }
	@Test
	public void testMedicalInsuranceFlow() throws Exception {
		medicalInsurance.robertClass();
		
		medicalInsurance.viewAllProductsOptions();
		
		medicalInsurance.menuItems();
		
	}
	@Test(dataProvider = "phone")
	public void testCarInsuranceFlow(String phoneNo) {
		carInsurance.selectCarInsurance();
		carInsurance.newCarDetails();
		carInsurance.getErrorMsg(phoneNo);
	}
	@AfterClass
	public void close() {
		tearDown();
	}
}