package batchTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="practical.feature",glue= {"stepglu"},tags= {"@tag1"},
plugin= {"json:target/cucumber-report.json"})

public class TestRunner {
	

}
