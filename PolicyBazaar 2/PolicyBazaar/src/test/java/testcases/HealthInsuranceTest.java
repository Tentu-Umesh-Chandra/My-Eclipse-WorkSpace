package testcases;

import base.baseClass;
import pages.HealthInsurancePage;
import utils.ExcelWriter;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.List;

public class HealthInsuranceTest {

    @BeforeClass
    public void setup() {
        baseClass.initialize();
    }

    @Test
    public void testHealthInsuranceMenu() throws InterruptedException, IOException {
        baseClass.driver.get("https://www.policybazaar.com");
        HealthInsurancePage healthPage = new HealthInsurancePage(baseClass.driver);

        healthPage.hoverHealthMenu();
        List<String> menuItems = healthPage.getHealthMenuItems();

        for (String item : menuItems) {
            System.out.println("Item: " + item);
        }

        ExcelWriter.writeSingleColumnData(menuItems, "Menu Items", "outputs/HealthInsuranceMenu.xlsx");
    }

    @AfterClass
    public void teardown() {
        baseClass.quitDriver();
    }
}
