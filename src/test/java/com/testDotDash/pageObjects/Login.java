package com.testDotDash.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver ldriver;

	public Login(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(id = "username")
	WebElement txtid;

	@FindBy(id = "password")
	WebElement txtpwd;

	@FindBy(xpath = "//*[@id=\"login\"]/button")
	WebElement btnlogin;

	@FindBy(xpath = "//*[@id=\"content\"]/div/a")
	WebElement lnklogout;

	public void setUserName(String uname) {

		txtid.sendKeys(uname);

	}

	public void setPassWord(String pwd) {

		txtpwd.sendKeys(pwd);

	}

	public void clickLogin() {

		btnlogin.click();

	}

	public void clickLogout() {

		lnklogout.click();

	}

}