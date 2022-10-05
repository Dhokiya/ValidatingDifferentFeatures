package com.testDotDash.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckBox {

	public WebDriver ldriver;

	public CheckBox(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	By lnkbtn = By.linkText("Checkboxes");
	By cb2 = By.xpath("//*[@id=\"checkboxes\"]/input[2]");
	By cb1 = By.xpath("//*[@id=\"checkboxes\"]/input[1]");

	public void checkboxclick() {

		ldriver.findElement(lnkbtn).click();

	}

	public void uncheckCb2() throws InterruptedException {
		System.out.println("CheckBox Is Already Selected : " + ldriver.findElement(cb2).isSelected());
		Thread.sleep(2000);
		ldriver.findElement(cb2).click();
		System.out.println("CheckBox Is Selected : " + ldriver.findElement(cb2).isSelected());

	}

	public void checkCb1() {
		ldriver.findElement(cb1).click();
		System.out.println("CheckBox Is Selected : " + ldriver.findElement(cb1).isSelected());

	}

}
