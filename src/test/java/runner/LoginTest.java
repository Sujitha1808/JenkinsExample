package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class LoginTest 
{
	@CucumberOptions(
		    features = "src/test/resources/features/loginTest.feature",
		    glue = "stepDefinitions",
//		    plugin = {"pretty","html:target/cucumber-reports-html.html"}
		    plugin = {"pretty", "json:target/cucumber-reports-json/Cucumber.json"} // Generate JSON report
		)
		public class TestRunner extends AbstractTestNGCucumberTests 
		{
			
		}

}
