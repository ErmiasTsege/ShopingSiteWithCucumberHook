package com.qa.Examples.cucumber_base.step_deffinations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.qa.Examples.cucumber_base.hooks.Hooks;
import com.qa.Examples.cucumber_base.pages.ShoppingPOMRepository;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PurchaseItemOnShopping {

	private ShoppingPOMRepository pom;
	private WebDriver webDriver;
	// final public static String URL = "https://www.saucedemo.com/";
	private boolean accountExpected;
	private boolean accountActual;

	public PurchaseItemOnShopping(Hooks hooks) {
		this.webDriver = hooks.getWebDriver();
		this.pom = new ShoppingPOMRepository(webDriver);
		this.accountExpected = true;
	}

	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() throws InterruptedException {
		// System.out.println(useremail + " " + password);
		webDriver.get(pom.landingPage.URL);
		pom.landingPage.clicksignin();
		//throw new io.cucumber.java.PendingException();
		  System.out.println(pom.loginpage.getSigninAccountName().getText());
	}

	@When("the user try to sing in with email {word} and password {word}")
	public void when_the_user_try_to_login(String useremail, String password) throws InterruptedException {
		Thread.sleep(10000);
		pom.loginpage.fillInLoginDetails(useremail, password);
		//throw new io.cucumber.java.PendingException();
		Thread.sleep(10000);
	}
	
	@Then("the user is signined in")
	public void then_the_user_is_loged_in() throws InterruptedException {
	
		accountActual=pom.loginpage.signinCompeleted();
     System.out.println(pom.loginpage.getSigninAccountName().getText());
		assertEquals(accountExpected, accountActual);
		
	}
	
//	@Given("the user {word} with the password {word} is logged in")
//	public void theUserStandardUserWithThePasswordShoppingSite(String username, String password)
//			throws InterruptedException {
//		System.out.println(username + " " + password);
//		webDriver.get(pom.landingPage.URL);
//		pom.landingPage.fillInLoginDetails(username, password);
//
//	}
//
//	@When("the user adds the following items to the cart")
//	public void theUserAddsTheFollowingItemsToTheCart(io.cucumber.datatable.DataTable dataTable) {
//		List<String> itemNames = dataTable.asList();
//
//		for (var itemName : itemNames) {
//			pom.productsPage.addItemToCart(itemName);
//		}
//	}
//
//	@When("the user checks out the items")
//	public void theUserChecksOutTheItems() {
//		pom.productsPage.navigateToCart();
//		pom.cartPage.navigateToCheckout();
//		pom.checkoutPage.fillInputFieldsWithJunkData();
//		pom.checkoutPage.navigateToCheckoutOverview();
//		pom.checkoutOverviewViewPage.completeTransaction();
//		this.didOrderCompleteActual = pom.checkoutCompletePage.didOrderComplete();
//	}
//
//	@Then("the purchase is verified via a confirmation page")
//	public void thePurchaseIsVerifiedViaAConfirmationPage() {
//		assertEquals(didOrderCompleteExpected, didOrderCompleteActual);
//	}

}