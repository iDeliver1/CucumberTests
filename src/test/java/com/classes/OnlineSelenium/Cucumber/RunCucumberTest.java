package com.classes.OnlineSelenium.Cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report.html", 
		"json:target/cucumber-reports/Cucumber.json",
		"junit:target/cucumber-reports/Cucumber.xml"},
features= "src/test/resources/Features",
glue= {"com.classes.OnlineSelenium.Cucumber"},
tags= "@RegressionTest or @SmokeTest"
)
public class RunCucumberTest {

}
