package testcases;

import base.baseClass;
import pages.CarInsurancePage;

import java.io.IOException;

import org.testng.annotations.*;

public class CarInsuranceTest {

    @BeforeClass
    public void setup() {
        baseClass.initialize();
    }

    @Test
    public void testCarInsuranceFlow() throws InterruptedException, IOException {
        CarInsurancePage carPage = new CarInsurancePage(baseClass.driver, baseClass.wait);
        baseClass.driver.get("https://www.policybazaar.com");

        carPage.navigateToCarInsurance();
        carPage.selectCarDetails();
        carPage.enterUserDetails();
    }

    @AfterClass
    public void teardown() {
        baseClass.quitDriver();
    }
}
