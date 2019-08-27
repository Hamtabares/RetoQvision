package com.metrope.www.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src\\test\\resources\\com\\metrope\\www\\features\\metrope.features\\comprametrope.feature",
		glue= "com.metrope.www.stepdefinitions", 
		snippets = SnippetType.CAMELCASE)

public class RunnerTestSite {

}
