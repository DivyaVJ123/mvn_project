package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="StepDefinations",monochrome=true,
plugin= {"pretty","html:target/reports.html"})
public class Runnerclass {

	
		

	}


