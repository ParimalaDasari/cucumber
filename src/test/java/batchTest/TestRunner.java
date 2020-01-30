package batchTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="demoJan.feature",glue= {"stepglu"},tags= {"@data-driven"},
plugin= {"json:target/cucumber-report.json"})

public class TestRunner {
	

}
