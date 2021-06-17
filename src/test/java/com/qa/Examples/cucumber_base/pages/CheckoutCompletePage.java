package com.qa.Examples.cucumber_base.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutCompletePage {

	@FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
	private WebElement checkoutCompleteHeader;
	
	public boolean didOrderComplete() {
		if (checkoutCompleteHeader != null) {
			if (checkoutCompleteHeader.getText()
									  .equals("THANK YOU FOR YOUR ORDER")) {
				return true;
			}
		}
		return false;
	}
	
	
}
