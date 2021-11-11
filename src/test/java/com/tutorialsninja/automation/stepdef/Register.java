package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;

public class Register {
	
	@Given("^I launch the application$")
	public void i_launch_the_application()  {
		
		Base.driver.get(Base.reader.getUrl());
	    
	}

	@And("^I navigate to Account Registarion page$")
	public void i_navigate_to_Account_Registarion_page()  {
	  
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable dataTable) {
	    
	}

	@And("^I select the Privacy Policy$")
	public void i_select_the_Privacy_Policy() {
	    
	}

	@And("^I cick on continue button$")
	public void i_cick_on_continue_button() {
	    
	}

	@Then("^I should see that the User Account has successfully created$")
	public void i_should_see_that_the_User_Account_has_successfully_created(){
	   
	}

}
