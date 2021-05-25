package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.LoginPage;

public class PageObjectmanager {

	public static WebDriver driver;

	private LoginPage lp;

	public PageObjectmanager(WebDriver pdriver) {
		this.driver = pdriver;
	}

	public LoginPage getLp() {

		lp = new LoginPage(driver);
		return lp;
	}

}
