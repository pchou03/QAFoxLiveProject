package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "classpath:FeatureFiles/Login.feature" }, 
		glue = {"classpath:com.tutorialsninja.automation.stepdef" },
		plugin = { "html:target/cucumber_html_report" },
		tags= {"@Login", "@Four"}

)
public class Runner {

}
