package com.testDotDash.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ContextClick {

	public WebDriver ldriver;

	public ContextClick(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	By contlnkbtn = By.linkText("Context Menu");
	By RightClick = By.xpath("//*[@id=\"hot-spot\"]");

}
