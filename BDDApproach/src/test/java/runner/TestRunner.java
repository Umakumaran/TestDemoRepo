package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)  // from junit

//Used to map the deatails
@CucumberOptions(
		features="C:\\Users\\uma k\\eclipse-workspace\\BDDApproach\\src\\test\\java\\features\\BDDTestFeatureDemo..feature",
		glue={"stepDefinitions"},
		plugin={"pretty","html:target/cucumber/report.html"})

public class TestRunner {

}
