package com.qa.Examples.cucumber_base.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	//final public static String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

	@FindBy(id = "email")
	private WebElement useremailInputField;

	@FindBy(id = "passwd")
	private WebElement passwordInputField;

	@FindBy(id = "SubmitLogin")
	private WebElement loginButton;

	public void fillInLoginDetails(String useremail, String password) throws InterruptedException {
		useremailInputField.sendKeys(useremail);
		passwordInputField.sendKeys(password);

		loginButton.submit();
	}
	
	
	@FindBy(css = "#header > div.nav > div > div > nav > div:nth-child(1) > a")
	private WebElement signinAccountName;
	
	public WebElement getSigninAccountName() {
		return signinAccountName;
	}

	public boolean signinCompeleted() {
		if (signinAccountName != null) {
			if (signinAccountName.getText()
									  .equals("Ermias Tsege")) {
				return true;
			}
		}
		return false;
	}

}
