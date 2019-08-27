package com.hotels.www.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src\\test\\resources\\reservadxhotels.features\\reservadxhotels.feature",
		glue= "com.hotels.www.stepdefinitions", 
		snippets = SnippetType.CAMELCASE)

public class RunnerTestSite {

}
