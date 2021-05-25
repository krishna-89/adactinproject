package com.adactin.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver browserLaunch(String browsername) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUN\\Documents\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);

	}

	public static void inputElement(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static void clickOnElement(WebElement clickon) {
		clickon.click();

	}

	public static void clearElement(WebElement clean) {
		clean.clear();

	}

	public static void dropDown(WebElement element, String option, String value) {

		Select sc = new Select(element);
		try {
			if (option.equalsIgnoreCase("index")) {
				sc.selectByIndex(Integer.parseInt(value));
			} else if (option.equalsIgnoreCase("value")) {
				sc.selectByValue(value);
			} else if (option.equalsIgnoreCase("text")) {
				sc.selectByVisibleText(value);

			}

		} catch (NumberFormatException e) {
			e.printStackTrace();

		}

	}

}
