package com.qa.Examples.cucumber_base.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {

	
	@FindBy(id = "first-name")
	private WebElement forenameInputField;
	
	@FindBy(id = "last-name")
	private WebElement surnameInputField;
	
	@FindBy(id = "postal-code")
	private WebElement postalcodeInputField;

	@FindBy(id = "continue")
	private WebElement continueToOverviewButton;
	
	public void fillInputFieldsWithJunkData() {
		forenameInputField.sendKeys("Bobby");
		surnameInputField.sendKeys("Pineapples");
		postalcodeInputField.sendKeys("PINE123");
	}
	
	public void navigateToCheckoutOverview() {
		continueToOverviewButton.click();
	}
}
	
	
	
	
	

