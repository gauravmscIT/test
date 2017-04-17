package com.automation.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json"},
        features = {"src/test/resources/features"},
        tags = {"@acceptance_test", "~@not_developed_yet", "~@manual"}
)
public class ATRunner {


}
