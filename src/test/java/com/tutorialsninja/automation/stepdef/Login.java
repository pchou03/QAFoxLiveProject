package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.ForgetPasswordPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	HeadersSection headersSection = new HeadersSection();
	LoginPage loginPage = new LoginPage();
	MyAccountPage myAccountPage = new MyAccountPage();
	ForgetPasswordPage forgetPasswordPage = new ForgetPasswordPage();

	@And("^I navigate to Account Login page$")
	public void i_navigate_to_Account_Login_page() {

		Elements.click(HeadersSection.myAccountLik);
		Elements.click(HeadersSection.login);
	}

	@When("^I login to the Application using Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void i_login_to_the_Application_using_Username_and_Password(String email, String password) {

		LoginPage.doLogin(email, password);

	}

	@Then("^I should see that the user is able to login successfully$")
	public void i_should_see_that_the_user_is_able_to_login_successfully() {

		Assert.assertTrue(Elements.isDisplayed(MyAccountPage.registerAffiliateAccount));

	}

	@Then("^I should see a error message that the credentials invalid$")
	public void i_should_see_a_error_message_that_the_credentials_invalid() {
		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.mainWarning,
				"Warning: No match for E-Mail Address and/or Password."));

	}

	@When("^I reset the forgotten password for email \"([^\"]*)\"$")
	public void i_reset_the_forgotten_password_for_email(String email) {

		Elements.click(LoginPage.forgetPassword);
		Elements.TypeText(ForgetPasswordPage.emailField, email);
		Elements.click(ForgetPasswordPage.continueButton);

	}

	@Then("^I should see a message informing the User that information related to ressetting password have been sent to email address$")
	public void i_should_see_a_message_informing_the_User_that_information_related_to_ressetting_password_have_been_sent_to_email_address() {

		Assert.assertTrue(Elements.VerifyTextEquals(LoginPage.mainWarning,
				" An email with a confirmation link has been sent your email address."));
	}

}
