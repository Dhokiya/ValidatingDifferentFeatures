package com.testDotDash.TestCases;

import org.testng.annotations.Test;

import com.testDotDash.BaseLayer.BaseClass3;
import com.testDotDash.pageObjects.CheckBox;

public class TC_CheckBoxes_3 extends BaseClass3 {

	@Test

	public void CheckBoxesValidation() throws InterruptedException {

		driver.get(baseUrl);
		logger.info("Url Is Opened");

		CheckBox ck = new CheckBox(driver);

		Thread.sleep(2000);

		ck.checkboxclick();

		logger.info("Clicked on CheckBoxs");

		ck.uncheckCb2();
		Thread.sleep(2000);
		logger.info("CheckBox2 is Disabled");

		ck.checkCb1();
		Thread.sleep(2000);
		logger.info("CheckBox1 is Enabled");
	}
}
