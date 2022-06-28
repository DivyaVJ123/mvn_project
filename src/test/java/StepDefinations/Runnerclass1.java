package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\dell\\eclipse-workspace\\mvn_project\\Features\\smoke.feature",glue="StepDefinations"
,tags="@smoke and @regression",monochrome=true,
plugin= {"pretty","html:target/reports.html"})
public class Runnerclass1 {

}
