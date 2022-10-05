package com.testDotDash.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testDotDash.BaseLayer.BaseClass2;
import com.testDotDash.pageObjects.Login;

public class TC_InvalidLoginTest_2 extends BaseClass2 {

	@Test
	public void invalidlogintest() throws InterruptedException {
		driver.get(baseUrl);
		logger.info("Url Is Opened");

		Login lp = new Login(driver);

		lp.setUserName(username);
		logger.info("User name is Provided");

		lp.setPassWord(password);
		logger.info("Password is Provided");

		Thread.sleep(2000);

		lp.clickLogin();
		logger.info("Clicked in Login");

		Thread.sleep(2000);

		Assert.assertEquals(driver.getTitle(), "The Internet");
		logger.info("Login Test Failed");

		lp.clickLogout();
		logger.info("Logout Successfully");

	}
}
