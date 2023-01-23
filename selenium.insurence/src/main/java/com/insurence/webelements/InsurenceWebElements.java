package com.insurence.webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurenceWebElements {
	WebDriver driver;

	public InsurenceWebElements(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(linkText = "Register")
	WebElement register;

	public WebElement getregister() {
		return register;
	}

	@FindBy(id = "user_title")
	WebElement userTitle;

	public WebElement getuserTitle() {
		return userTitle;
	}

	@FindBy(id = "user_firstname")
	WebElement userFirstName;

	public WebElement getuserFirstName() {
		return userFirstName;
	}

	@FindBy(id = "user_surname")
	WebElement userSurName;

	public WebElement getuserSurName() {
		return userSurName;
	}

	@FindBy(id = "user_phone")
	WebElement userPhone;

	public WebElement getuserPhone() {
		return userPhone;
	}

	@FindBy(id = "user_dateofbirth_1i")
	WebElement year;

	public WebElement getyear() {
		return year;
	}

	@FindBy(id = "user_dateofbirth_2i")
	WebElement month;

	public WebElement getmonth() {
		return month;
	}

	@FindBy(id = "user_dateofbirth_3i")
	WebElement date;

	public WebElement getdate() {
		return date;
	}

	@FindBy(id = "licencetype_t")
	WebElement full;

	public WebElement getfull() {
		return full;
	}

	@FindBy(id = "user_licenceperiod")
	WebElement licencePeriod;

	public WebElement getlicencePeriod() {
		return licencePeriod;
	}

	@FindBy(id = "user_occupation_id")
	WebElement occupation;

	public WebElement getoccupation() {
		return occupation;
	}

	@FindBy(id = "user_address_attributes_street")
	WebElement addressStreet;

	public WebElement getaddressStreet() {
		return addressStreet;
	}

	@FindBy(id = "user_address_attributes_city")
	WebElement addressCity;

	public WebElement getaddressCity() {
		return addressCity;
	}

	@FindBy(id = "user_address_attributes_county")
	WebElement country;

	public WebElement getcountry() {
		return country;
	}

	@FindBy(id = "user_address_attributes_postcode")
	WebElement postalCode;

	public WebElement getpostalCode() {
		return postalCode;
	}

	@FindBy(id = "user_user_detail_attributes_email")
	WebElement email;

	public WebElement getemail() {
		return email;
	}

	@FindBy(id = "user_user_detail_attributes_password")
	WebElement password;

	public WebElement getpassword() {
		return password;
	}

	@FindBy(id = "user_user_detail_attributes_password_confirmation")
	WebElement confirmpassword;

	public WebElement getconfirmpassword() {
		return confirmpassword;
	}

	@FindBy(name = "submit")
	WebElement submit;

	public WebElement getsubmit() {
		return submit;
	}

	@FindBy(id = "email")
	WebElement loginemail;

	public WebElement getloginemail() {
		return loginemail;
	}

	@FindBy(xpath = "/html/body/div[3]/form/div[2]/input")
	WebElement loginpassword;

	public WebElement getloginPassword() {
		return loginpassword;
	}

	@FindBy(name = "submit")
	WebElement login;

	public WebElement getlogin() {
		return login;
	}
}
