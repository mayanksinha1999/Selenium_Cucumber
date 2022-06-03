package StepDefenitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
	features="C:/Users/Lenovo/OneDrive/Desktop/selenium_work/CucumberJava/src/test/resources/Features", 
	glue= {"StepDefenitions"},
	monochrome=true,
	plugin= {"pretty","html:target/HtmlReports",
			"json:target/JSONReports",
			"junit:target/JunitReports"}
	)
public class TestRunner {

}
