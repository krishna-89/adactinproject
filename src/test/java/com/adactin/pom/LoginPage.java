package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.stepdefinition.SelectHotel;

public class LoginPage {

	public static WebDriver driver;

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement login_button;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement roomnumber;

	@FindBy(id = "datepick_in")
	private WebElement checkin;

	@FindBy(id = "datepick_out")
	private WebElement checkout;

	@FindBy(id = "adult_room")
	private WebElement adultroom;

	@FindBy(id = "child_room")
	private WebElement children;

	@FindBy(id = "Submit")
	private WebElement searchhotel;

	@FindBy(id = "radiobutton_0")
	private WebElement selectdetails;

	@FindBy(id = "continue")
	private WebElement nextpage;

	@FindBy(id = "first_name")
	private WebElement firstname;

	@FindBy(id = "last_name")
	private WebElement lastname;

	@FindBy(id = "address")
	private WebElement billingaddress;

	@FindBy(id = "cc_num")
	private WebElement cardnumber;

	@FindBy(id = "cc_type")
	private WebElement cardtype;

	@FindBy(id = "cc_exp_month")
	private WebElement expirymonth;

	@FindBy(id = "cc_exp_year")
	private WebElement expiryyear;

	@FindBy(id = "cc_cvv")
	private WebElement cvvnumber;

	@FindBy(id = "book_now")
	private WebElement bookhotel;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, ldriver);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_button() {
		return login_button;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnumber() {
		return roomnumber;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSearchhotel() {
		return searchhotel;
	}

	public WebElement getSelectdetails() {
		return selectdetails;
	}

	public WebElement getNextpage() {
		return nextpage;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBillingaddress() {
		return billingaddress;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public WebElement getBookhotel() {
		return bookhotel;
	}
}
