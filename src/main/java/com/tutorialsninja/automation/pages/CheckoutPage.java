package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class CheckoutPage {

	public CheckoutPage() {
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(id = "button-payment-address")
	public static WebElement continueButtonOfBillingDetailsSection;

	@FindBy(id = "button-shipping-address")
	public static WebElement continueButtonOfDeliveryDetailsSection;

	@FindBy(id = "button-shipping-method")
	public static WebElement continueButtonOfDeliveryMethodSection;

	@FindBy(name = "agree")
	public static WebElement termsAndConditionCheckbox;

	@FindBy(id = "button-payment-method")
	public static WebElement continueButtonOfPaymentMethodSection;

	@FindBy(id = "button-confirm")
	public static WebElement confirmOrderButton;
	
	
	//reusable method
	public static void placeAnOrder() {

		Elements.click(continueButtonOfBillingDetailsSection);
		Elements.click(continueButtonOfDeliveryDetailsSection);
		Elements.click(continueButtonOfDeliveryMethodSection);
		Elements.click(termsAndConditionCheckbox);
		Elements.click(continueButtonOfPaymentMethodSection);
		Elements.click(confirmOrderButton);

	}
}
