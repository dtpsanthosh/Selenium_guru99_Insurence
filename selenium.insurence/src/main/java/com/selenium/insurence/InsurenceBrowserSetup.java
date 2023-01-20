package com.selenium.insurence;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.insurence.webelements.InsurenceWebElements;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InsurenceBrowserSetup {
	WebDriver driver;
	InsurenceWebElements webElements;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void setup(String browser, String url) {
		if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		webElements = new InsurenceWebElements(driver);
		driver.get(url);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
