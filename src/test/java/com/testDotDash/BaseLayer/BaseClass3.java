package com.testDotDash.BaseLayer;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass3 {

	public String baseUrl = "http://localhost:7080";
	public static WebDriver driver;
	public Logger logger;

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		logger = Logger.getLogger("testDotDash");
		PropertyConfigurator.configure("Log4j.properties");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
