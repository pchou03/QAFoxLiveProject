package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;
import com.tutorialsninja.automation.pages.CheckoutPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.OrderSuccessPage;
import com.tutorialsninja.automation.pages.SearchResultsPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orders {

	
	//when constructors will be called then only WebElments initialized
	//else you will get 'Null Pointer Exception' without below object creation
	Browser browser = new Browser();
	HeadersSection headersSection = new HeadersSection();
	LoginPage loginPage = new LoginPage();
	ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
	CheckoutPage checkoutPage = new CheckoutPage();
	OrderSuccessPage orderSuccessPage=new OrderSuccessPage();

	
	//Step definitions for feature file
	
	@Given("^I login to the application$")
	public void i_login_to_the_application() {

		Browser.openApplication();
		HeadersSection.navigateToLoginPage();
		LoginPage.doLogin();
		

	}

	@When("^I add a product to bag and check$")
	public void i_add_a_product_to_bag_and_check() {
		
		HeadersSection.searchProduct();
		SearchResultsPage.addFirstProductInSearchResultsToCart();
		HeadersSection.navigateToShoppingCartOption();
		ShoppingCartPage.navigateToCheckoutPage();
		
	}

	@And("^I place an order$")
	public void i_place_an_order() {
		
		CheckoutPage.placeAnOrder();

	}

	@Then("^I should see that the order is placed successfully$")
	public void i_should_see_that_the_order_is_placed_successfully() {

		Waits.waitUntilElementLocated(10, OrderSuccessPage.successBreadCrum);
		Assert.assertTrue(Elements.isDisplayed(OrderSuccessPage.successBreadCrum));
		
	}

}
