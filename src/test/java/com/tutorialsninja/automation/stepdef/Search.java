package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.SearchResultsPage;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {

	// to avoid NullPointer Exception create Object of class which methods you are
	// using
	HeadersSection headersSection = new HeadersSection();
	SearchResultsPage SearchPage = new SearchResultsPage();

	@When("^I serch for a product \"([^\"]*)\"$")
	public void i_serch_for_a_product(String product) {

		Elements.TypeText(HeadersSection.searchBoxField, product);
		Elements.click(HeadersSection.searchButton);

	}

	@Then("^I should see the product in the search results$")
	public void i_should_see_the_product_in_the_search_results() {

		Assert.assertTrue(Elements.isDisplayed(SearchResultsPage.samsungSyncMasterSearchResult));

	}

	@Then("^I should see a message informing \"([^\"]*)\"$")
	public void i_should_see_a_message_informing(String message) {

		Assert.assertTrue(Elements.VerifyTextEquals(SearchResultsPage.noResultsMessage, "There is no product that matches the search criteria"));
	}

}
