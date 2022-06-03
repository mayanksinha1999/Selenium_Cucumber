package StepDefenitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
	features="C:/Users/Lenovo/OneDrive/Desktop/selenium_work/CucumberJava/src/test/resources/FeatureWithTags", 
	glue= {"StepDefenitions"},
	tags= "@smoke or @regression"
	)
public class TestRunner_RuNWithSingleTag {

}
