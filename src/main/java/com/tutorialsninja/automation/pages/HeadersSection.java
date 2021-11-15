package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class HeadersSection {

	public HeadersSection() {

		PageFactory.initElements(Base.driver, this);

	}

	@FindBy(xpath = "//span[text()='My Account']")
	public static WebElement myAccountLik;

	@FindBy(linkText = "Register")
	public static WebElement register;

	@FindBy(linkText = "Login")
	public static WebElement login;

	// Search field after Login
	@FindBy(name = "search")
	public static WebElement searchBoxField;

	@FindBy(css = "input[name='search']+span")
	public static WebElement searchButton;
	
	@FindBy(xpath = "//span[text()='Shopping Cart']")
	public static WebElement viewShoppingCart;
	
	

	// reusable methods belongs to Header section

	public static void navigateToLoginPage() {

		Elements.click(myAccountLik);
		Elements.click(login);
	}

	public static void searchProduct() {

		// Elements.TypeText(HeadersSection.searchBoxField, Base.reader.getProduct());
		Elements.TypeText(searchBoxField, Base.reader.getProduct());

		// Elements.click(HeadersSection.searchButton);
		Elements.click(searchButton);
	}
	
	public static void navigateToShoppingCartOption() {
		
		Elements.click(HeadersSection.viewShoppingCart);
		
	}

}
