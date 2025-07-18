package testcases;

import base.baseClass;
import pages.TravelInsurancePage;
import utils.ExcelWriter;

import java.io.IOException;
import java.util.List;
import org.testng.annotations.*;

public class TravelInsuranceTest {

    @BeforeClass
    public void setup() {
		baseClass.initialize();
    }

    @Test
    public void testTravelInsuranceFlow() throws InterruptedException, IOException {
        TravelInsurancePage travelPage = new TravelInsurancePage(baseClass.driver, baseClass.wait);

        travelPage.navigateToTravelInsurance();
        travelPage.fillTravelDetails();
        travelPage.applyFiltersAndSort();

        List<String> names = travelPage.getCompanyNames();
        List<String> prices = travelPage.getPlanPrices();

        for (int i = 0; i < names.size(); i++) {
            System.out.println("Company: " + names.get(i) + " | Price: " + prices.get(i));
        }

        ExcelWriter.writeCompanyData(names, prices, "outputs/InsuranceData.xlsx");
    }

    @AfterClass
    public void teardown() {
        baseClass.quitDriver();
    }
}
