package com.testDotDash.BaseLayer;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass2 {
	public String baseUrl = "http://localhost:7080/login";
	public String username = "tomsmit";
	public String password = "SuperSecretPassword";
	public static WebDriver driver;
	public Logger logger;

	@BeforeClass
	public void setup() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		logger = Logger.getLogger("testDotDash");
		PropertyConfigurator.configure("Log4j.properties");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
