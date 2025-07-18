package com.cts.cucumberDemo.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	private WebDriver driver;
	
	@Given("I am on the login page")
	public void iamOnLogin() {
		driver = new EdgeDriver();
		driver.get("file:///C:/Users/2408320/Downloads/login_page.html");
	}
	
	@When("I enter {string} as username and {string} as password")
	public void iEnterUserNameAndPassword(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@And("I click the login button")
	public void iClickLoginButton() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Then("I should see the success message {string}")
	public void iSeeSuccessMessage(String successMsg) {
		Assert.assertEquals(driver.findElement(By.id("message")).getText(), successMsg);
		driver.quit();
	}
}
