package stepdefinitions;

import java.io.IOException;
import java.util.List;

import pages.HealthInsurancePage;
import utils.ExcelWriter;
import base.DriverSetUp;
import io.cucumber.java.en.*;

public class HealthInsuranceSteps {
    HealthInsurancePage healthPage;

    @When("I hover on health insurance section")
    public void hover_health_menu() throws InterruptedException {
        healthPage = new HealthInsurancePage(DriverSetUp.driver);
        healthPage.hoverHealthMenu();
    }

    @Then("I should list health insurance menu items")
    public void list_health_menus() throws InterruptedException, IOException {
        List<String> items = healthPage.getHealthMenuItems();
        items.forEach(System.out::println);
        ExcelWriter.writeSingleColumnData(items, "Menu Items", "outputs/HealthInsuranceMenu.xlsx");
    }
}
