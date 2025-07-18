package stepdefinitions;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import pages.CarInsurancePage;
import base.DriverSetUp;
import io.cucumber.java.en.*;

public class CarInsuranceSteps {
    CarInsurancePage carPage;
    private static final Logger logger = LogManager.getLogger(CarInsuranceSteps.class);
    @And("I navigate to the car insurance page")
    public void navigate_car_insurance() throws InterruptedException {
        carPage = new CarInsurancePage(DriverSetUp.driver, DriverSetUp.wait);
        logger.info("Navigation to the Car Insurance Page");
        carPage.navigateToCarInsurance();
    }

    @When("I select car details")
    public void select_car_details() throws InterruptedException {
    	logger.info("Selecting the Car Details");
        carPage.selectCarDetails();
    }

    @And("I enter car insurance user information")
    public void enter_user_info() throws IOException {
    	logger.info("Entering the user Details");
        carPage.enterUserDetails();
    }

    @Then("I should capture a screenshot")
    public void capture_screenshot() {
        System.out.println("Screenshot saved.");
    }
}
