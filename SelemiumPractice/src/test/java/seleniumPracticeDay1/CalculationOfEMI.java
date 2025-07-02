package seleniumPracticeDay1;

import org.openqa.selenium.edge.EdgeDriver;

import pageObjects.EmiPage;
import pageObjects.EmiPage2;

public class CalculationOfEMI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://webapps.tekstac.com/FormRegistration/EMICalculator.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//EmiPage emi = new EmiPage(driver);
		EmiPage2 emi = new EmiPage2(driver);
		emi.getAmount().sendKeys("1000");
		Thread.sleep(2000);
		emi.getYear().sendKeys("5");
		Thread.sleep(2000);
		emi.getRoi().sendKeys("5000");
	}

}
