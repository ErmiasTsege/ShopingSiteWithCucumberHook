package com.qa.Examples.cucumber_base.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {
	@FindAll({
		@FindBy(className = "inventory_item")
	})
	private List<WebElement> itemsOnPage;
	
	@FindBy(className = "shopping_cart_link")
	private WebElement shoppingCartButton;
	
	public void addItemToCart(String itemName) {
		for (var currentItem : itemsOnPage) {
			String title = currentItem.findElement(
					By.className("inventory_item_name")
			).getText();
			
			if (title.equals(itemName)) {
				WebElement addToCartButton = currentItem.findElement(
					By.tagName("button")
				);
				addToCartButton.click();
			}
		}
	}
	
	public void navigateToCart() {
		shoppingCartButton.click();
	}
	
	
	
	
}
