package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.pom.LoginPage;
import com.adactin.project.BaseClass;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepdefinition extends BaseClass {
	
	public static WebDriver driver = Runner.driver;
	

	@Given("^User launch url of adactin application$")
	public void user_launch_url_of_adactin_application() throws Throwable {

		getUrl("https://adactinhotelapp.com/");
	}

	@When("^User enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {

		inputElement(driver.findElement(By.id("username")), arg1);
	}

	@When("^User enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {

		inputElement(driver.findElement(By.id("password")), arg1);

	}

	@When("^User click login button$")
	public void user_click_login_button() throws Throwable {

		clickOnElement(driver.findElement(By.id("login")));

	}

	@Then("^User validate valid username and valid password$")
	public void user_validate_valid_username_and_valid_password() throws Throwable {

	}

}
