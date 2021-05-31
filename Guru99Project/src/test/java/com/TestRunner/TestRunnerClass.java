package com.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFile",
glue= {"com.StepDefinition"},
plugin= {"pretty", "html:target/HTML/reports.html",
		"json:target/JSONReports/reports.json",
		"junit:target/JUnitReports/reports.xml"},
tags="@TestCase1 or @TestCase2 or @TestCase3 or @TestCase4 or @TestCase5"
)
public class TestRunnerClass {
	
}
