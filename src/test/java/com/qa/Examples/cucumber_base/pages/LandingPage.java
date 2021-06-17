package com.qa.Examples.cucumber_base.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	final public String URL = "http://automationpractice.com/";

	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	private WebElement loginbutton;

	public void clicksignin() throws InterruptedException {

		loginbutton.click();
	}

}
