package StepDefenitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
	features="C:/Users/Lenovo/OneDrive/Desktop/selenium_work/CucumberJava/src/test/resources/HooksDemo/HooksDemo.feature", 
	glue= {"StepsforHooks"},
	monochrome=true,
	plugin= {"pretty","html:target/HtmlReports",
			"json:target/JSONReports",
			"junit:target/JunitReports"}
	)
public class TestRunnerforHooks {
	
}
