package com.qa.Examples.cucumber_base.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	
	
	@FindBy(id = "checkout")
	private WebElement checkoutButton;
	
	public void navigateToCheckout() {
		checkoutButton.click();
	}

}
