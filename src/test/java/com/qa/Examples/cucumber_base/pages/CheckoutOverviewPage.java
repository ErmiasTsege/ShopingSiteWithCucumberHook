package com.qa.Examples.cucumber_base.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPage {
	
	
	
	
	public class CheckoutOverviewViewPage {

		@FindBy(id = "finish")
		private WebElement finishTransactionButton;
		
		public void completeTransaction() {
			finishTransactionButton.click();
		}
	}

}
