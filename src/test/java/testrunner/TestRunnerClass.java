package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Featurefiles\\SignInPage.feature",
glue=("stepdefinition.org"),
//plugin= {"pretty","html:target/htmlReports/loginreporthtml.html"}
//plugin= {"pretty","json:target/jsonReports/loginreportjson.json"}
//plugin= {"pretty","junit:target/junitReports/loginreport.xml"}
plugin= {"pretty","junit:target/junitReports/loginreport.xml",
		"json:target/jsonReports/loginreportjson.json",
		"html:target/htmlReports/loginreporthtml.html"},
//monochrome for alignment on console
monochrome=true,
dryRun = false
)
public class TestRunnerClass {

}
