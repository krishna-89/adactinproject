package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.project.BaseClass;
import com.adactin.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelDetails extends BaseClass {
	
	public static WebDriver driver = Runner.driver;

	@Given("^User click and select location as \"([^\"]*)\"$")
	public void user_click_and_select_location_as(String arg1) throws Throwable {

		dropDown(driver.findElement(By.id("location")), arg1, arg1);
		inputElement(driver.findElement(By.id("location")), arg1);
	}

	@When("^User click and select hotels as \"([^\"]*)\"$")
	public void user_click_and_select_hotels_as(String arg1) throws Throwable {

		dropDown(driver.findElement(By.id("hotels")), arg1, arg1);
		inputElement(driver.findElement(By.id("hotels")), arg1);
	}

	@When("^User click and select roomtype as \"([^\"]*)\"$")
	public void user_click_and_select_roomtype_as(String arg1) throws Throwable {

		dropDown(driver.findElement(By.id("room_type")), arg1, arg1);
		inputElement(driver.findElement(By.id("room_type")), arg1);
	}

	@When("^User click and select number of rooms for \"([^\"]*)\"$")
	public void user_click_and_select_number_of_rooms_for(String arg1) throws Throwable {

		dropDown(driver.findElement(By.id("room_nos")), arg1, arg1);
		inputElement(driver.findElement(By.id("room_nos")), arg1);
	}

	@When("^User enters valid check in date as \"([^\"]*)\"$")
	public void user_enters_valid_check_in_date_as(String arg1) throws Throwable {

		clearElement(driver.findElement(By.id("datepick_in")));
		inputElement(driver.findElement(By.id("datepick_in")), arg1);

	}

	@When("^User enters valid check out date as \"([^\"]*)\"$")
	public void user_enters_valid_check_out_date_as(String arg1) throws Throwable {

		clearElement(driver.findElement(By.id("datepick_out")));
		inputElement(driver.findElement(By.id("datepick_out")), arg1);
	}

	@When("^User click and select adults per room as \"([^\"]*)\"$")
	public void user_click_and_select_adults_per_room_as(String arg1) throws Throwable {

		dropDown(driver.findElement(By.id("adult_room")), arg1, arg1);
		inputElement(driver.findElement(By.id("adult_room")), arg1);

	}

	@When("^User click and select children per room \"([^\"]*)\"$")
	public void user_click_and_select_children_per_room(String arg1) throws Throwable {

		dropDown(driver.findElement(By.id("child_room")), arg1, arg1);
		inputElement(driver.findElement(By.id("child_room")), arg1);

	}

	@When("^User click search button$")
	public void user_click_search_button() throws Throwable {

		clickOnElement(driver.findElement(By.id("Submit")));

	}

	@Then("^User validate given details$")
	public void user_validate_given_details() throws Throwable {

	}

}
