package stepdefinitions;

import base.DriverSetUp;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
public class CommonSteps {
    @Before
    public void setUp() {
        String browser = System.getProperty("browser", "chrome");
        DriverSetUp.initializeDriver(browser);
    }

    @Given("I launch PolicyBazaar")
    public void i_launch_policybazaar() {
        DriverSetUp.driver.get("https://www.policybazaar.com");
    }

    @After
    public void tearDown() {
        DriverSetUp.quitDriver();
    }
}
