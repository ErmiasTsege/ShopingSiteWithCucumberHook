package com.qa.Examples.cucumber_base.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPOMRepository {

	private WebDriver webDriver;

	public LandingPage landingPage;
	public CartPage cartPage;
	public CheckoutCompletePage checkoutCompletePage;
	public CheckoutOverviewPage checkoutOverviewViewPage;
	public ProductsPage productsPage;
	public CheckoutPage checkoutPage;
	public LoginPage loginpage;

	public ShoppingPOMRepository(WebDriver webDriver) {
		this.webDriver = webDriver;
		this.webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		this.webDriver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		this.landingPage = PageFactory.initElements(webDriver, LandingPage.class);
		this.cartPage = PageFactory.initElements(webDriver, CartPage.class);
		this.checkoutCompletePage = PageFactory.initElements(webDriver, CheckoutCompletePage.class);
		this.checkoutOverviewViewPage = PageFactory.initElements(webDriver, CheckoutOverviewPage.class);
		this.productsPage = PageFactory.initElements(webDriver, ProductsPage.class);
		this.checkoutPage = PageFactory.initElements(webDriver, CheckoutPage.class);
		this.loginpage = PageFactory.initElements(webDriver, LoginPage.class);
	}
}
