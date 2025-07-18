package stepdefinitions;

import java.io.IOException;
import java.util.List;

import pages.TravelInsurancePage;
import utils.ExcelWriter;
import base.DriverSetUp;
import io.cucumber.java.en.*;

public class TravelInsuranceSteps {
    TravelInsurancePage travelPage;

    @And("I navigate to the travel insurance page")
    public void navigate_travel_insurance() throws InterruptedException {
        travelPage = new TravelInsurancePage(DriverSetUp.driver, DriverSetUp.wait);
        travelPage.navigateToTravelInsurance();
    }

    @When("I fill in travel insurance details")
    public void fill_travel_details() throws InterruptedException {
        travelPage.fillTravelDetails();
    }

    @And("I apply filters and sort results")
    public void apply_filters_travel() throws InterruptedException {
        travelPage.applyFiltersAndSort();
    }

    @Then("I should see travel insurance companies and prices")
    public void get_travel_quotes() throws IOException {
        List<String> names = travelPage.getCompanyNames();
        List<String> prices = travelPage.getPlanPrices();
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Company: " + names.get(i) + ", Price: " + prices.get(i));
        }
        ExcelWriter.writeCompanyData(names, prices, "outputs/Travel_Insurances_List.xlsx");
    }
}
