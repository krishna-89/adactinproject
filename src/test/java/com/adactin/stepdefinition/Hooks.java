package com.adactin.stepdefinition;

import com.adactin.project.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	
	
	@Before
	public static void beforeHooks(Scenario scenario) {
		
		System.out.println(scenario.getName());
	}

	@After
	
	public static void afterHooks(Scenario scenario) {

		System.out.println(scenario.getStatus());
		
	}
}
