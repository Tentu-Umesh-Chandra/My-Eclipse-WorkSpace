package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import finPro_Insu.CarInsurancePage;
import utils.ExcelUtils;

public class StudentTravelInsuranceTest extends BaseTest {
	/*
    @Test
    public void testTravelInsuranceFlow() {
        setup();

        String country = ExcelUtils.getCellData("Sheet1", 1, 0);
        String startDate = ExcelUtils.getCellData("Sheet1", 1, 1);
        String endDate = ExcelUtils.getCellData("Sheet1", 1, 2);

        StudentTravelInsurancePage page = new StudentTravelInsurancePage(driver);
        page.selectTravelInsurance();
        page.enterCountry(country);
        page.selectDate(startDate);
        page.selectDate(endDate);
        page.fillPassengerDetails();

        //driver.get("https://travel.policybazaar.com/quotes?..."); // Replace with actual URL
        driver.get("https://travel.policybazaar.com/quotes?encp=RldOWWlZN3lYU3pNd0h2d2Rxd0djdz09&family=0&isPlanCTAExp=1&isRepeatMember=0&msclkid=b523b7aa6d0119ae0187dfc5d59d39bf&newpq=1&profiletypeid=1&sum_insured=d60&token=eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpYXQiOjE3NTIyMzAwOTUsImp0aSI6ImVlNzQ1YzlhLTg4YTQtNGZiZS1iMDY4LTI4NWY0OWVhYzdjMSIsIlByb3Bvc2VySUQiOiI0NzI4MzAxIiwibmJmIjoxNzUyMjMwMDk1LCJleHAiOjE3NTQ4NTgwOTUsImlzcyI6InRyYXZlbC5wb2xpY3liYXphYXIuY29tIiwiYXVkIjoidHJhdmVsIn0.Likrwg-VFw3cmytq6_P0zty5Zl7__l7C-eik3gd-3rIuLpe_eiJIQS8-Fl2wqrAsOn-k_PKuFJQ2naQ8V5JEDQllNwprzxFuvowj-AWCNtc1jn_1EjFTqdskrbAKdEx2KPZDbR-qF7iied6rVz-x6inrXQ9z_W4NUM6RWqkuFqtP8H8J1peCGqWX0r7dcqOPNZpnct1gkRPOj2jj7NSUwVocDkXluBwKDOhpd3WybFeTbzy6f6-vuOnDw59Obp3NzHvDQH0uJ3HVyYnGzsZuAozLvPQAwqAaR9kQbQycX9ygjDPlNIL74rhv5V2ruet_7QdHvrFxEwONLfeqpHvmZg&utm_campaign=PolicyBazaar00PolicyBazaar&utm_content=newpq&utm_medium=cpc&utm_source=yahoo_brand&utm_term=newjourney&visa_type=d32");
        
        page.sortAndDisplayTopPlans();

        tearDown();
    }
    */
	/*
	@Test
	public void testMedicalInsuranceFlow() throws Exception {
		setup();
		MedicalInsurancePage page1 = new MedicalInsurancePage(driver);
		page1.robertClass();
		
		page1.viewAllProductsOptions();
		
		page1.menuItems();
		
		tearDown();
	}
	*/
	@Test
	public void testCarInsuranceFlow() {
		setup();
		String phoneNo = ExcelUtils.getCellData("Sheet1", 1, 3);
		CarInsurancePage page2 = new CarInsurancePage(driver);
		page2.selectCarInsurance();
		page2.newCarDetails();
		page2.getErrorMsg(phoneNo);
		tearDown();
	}
}
