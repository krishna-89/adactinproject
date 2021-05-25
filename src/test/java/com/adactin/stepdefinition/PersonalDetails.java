package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.project.BaseClass;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PersonalDetails extends BaseClass {
	
	public static WebDriver driver = Runner.driver;

	@Given("^User enter \"([^\"]*)\" as firstname$")
	public void user_enter_as_firstname(String arg1) throws Throwable {

		inputElement(driver.findElement(By.id("first_name")), arg1);

	}

	@When("^User \"([^\"]*)\" as lastname$")
	public void user_as_lastname(String arg1) throws Throwable {

		inputElement(driver.findElement(By.id("last_name")), arg1);

	}

	@When("^User enter \"([^\"]*)\" as billing address$")
	public void user_enter_as_billing_address(String arg1) throws Throwable {

		inputElement(driver.findElement(By.id("address")), arg1);
	}

	@When("^User enter \"([^\"]*)\" as credit card number$")
	public void user_enter_as_credit_card_number(String arg1) throws Throwable {

		inputElement(driver.findElement(By.id("cc_num")), arg1);

	}

	@When("^User click and select \"([^\"]*)\" as credit card type$")
	public void user_click_and_select_as_credit_card_type(String arg1) throws Throwable {

		dropDown(driver.findElement(By.id("cc_type")), arg1, arg1);
		inputElement(driver.findElement(By.id("cc_type")), arg1);
	}

	@When("^User click and select \"([^\"]*)\" as expiry month$")
	public void user_click_and_select_as_expiry_month(String arg1) throws Throwable {

		dropDown(driver.findElement(By.id("cc_exp_month")), arg1, arg1);
		inputElement(driver.findElement(By.id("cc_exp_month")), arg1);
	}

	@When("^User click and select \"([^\"]*)\" as expiry year$")
	public void user_click_and_select_as_expiry_year(String arg1) throws Throwable {

		dropDown(driver.findElement(By.id("cc_exp_year")), arg1, arg1);
		inputElement(driver.findElement(By.id("cc_exp_year")), arg1);
	}

	@When("^User enter \"([^\"]*)\" as cvv number$")
	public void user_enter_as_cvv_number(String arg1) throws Throwable {

		inputElement(driver.findElement(By.id("cc_cvv")), arg1);

	}

	@When("^User click book now button$")
	public void user_click_book_now_button() throws Throwable {

		clickOnElement(driver.findElement(By.id("book_now")));

	}

}
