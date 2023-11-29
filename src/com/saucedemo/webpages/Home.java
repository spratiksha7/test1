package com.saucedemo.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	public Home(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);
	}
	//identify element
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement addtocart;
	
	@FindBy(className="shopping_cart_link")
	WebElement shoppingcart;
	
	@FindBy(xpath ="//div[text()='Sauce Labs Backpack']")
	WebElement  verifyproduct;
	
	@FindBy(className = "product_sort_container")
	WebElement Filter;
	
	public void clickOnAddToCart()
	{
		addtocart.click();
	}
	public void ShoppingCartButton()
	{
		shoppingcart.click();
	}
	
	public void verifyProduct()
	{
		boolean value = verifyproduct.isDisplayed();
		if(value)
		{
			System.out.println("product added to cart");
		}
		else
		{
			System.out.println("product not added to cart");
		}

		}

	}
	




