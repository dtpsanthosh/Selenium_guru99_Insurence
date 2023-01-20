package com.selenium.insurence;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Insurence extends InsurenceBrowserSetup {
	@Test(priority = 0, enabled = true)
	public void register() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.getTitle();
		webElements.getregister().click();
		Select selectTitle = new Select(webElements.getuserTitle());
		selectTitle.selectByIndex(1);
		webElements.getuserFirstName().sendKeys("Santhosh Kumar");
		webElements.getuserSurName().sendKeys("Gummani");
		webElements.getuserPhone().sendKeys("7780111125");
		Select year = new Select(webElements.getyear());
		year.selectByValue("1995");
		Select month = new Select(webElements.getmonth());
		month.selectByValue("4");
		Select date = new Select(webElements.getdate());
		date.selectByValue("10");
		webElements.getfull().click();
		Select licencePeriod = new Select(webElements.getlicencePeriod());
		licencePeriod.selectByIndex(4);
		Select occupation = new Select(webElements.getoccupation());
		occupation.selectByValue("20");
		webElements.getaddressStreet().sendKeys("R and R Colony");
		webElements.getaddressCity().sendKeys("Kadapa");
		webElements.getcountry().sendKeys("india");
		webElements.getpostalCode().sendKeys("516431");
		webElements.getemail().sendKeys("gsk@123");
		webElements.getpassword().sendKeys("123");
		webElements.getconfirmpassword().sendKeys("123");
		webElements.getsubmit().click();
	}

	@Test(priority = 1, enabled = true)
	public void login() {
		webElements.getloginemail().sendKeys("gsk@gmail.com");
		webElements.getpassword().sendKeys("123");
		webElements.getlogin().click();
	}
}
