package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.project.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\adactin\\feature\\Adactin.feature", glue = "com\\adactin\\stepdefinition",
				plugin = {"rerun:report1/FailedScenario.txt"
							
					}
)

public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {

		driver = BaseClass.browserLaunch("Chrome");

	}

	@AfterClass
	public static void tearDown() {

		driver.quit();
	}

}
