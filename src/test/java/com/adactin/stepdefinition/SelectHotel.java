package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.project.BaseClass;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SelectHotel extends BaseClass {

	public static WebDriver driver = Runner.driver;
	

	@Given("^User click ans select the hotel details$")
	public void user_click_ans_select_the_hotel_details() throws Throwable {

		clickOnElement(driver.findElement(By.id("radiobutton_0")));

	}

	@When("^User click continue button$")
	public void user_click_continue_button() throws Throwable {

		clickOnElement(driver.findElement(By.id("continue")));

	}

}
