package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features=".//Features/Login.feature",
glue="StepDefinations",
monochrome=false,
dryRun=false,
plugin= {"html:target/sarath1.html"}
		)
public class TestRun extends AbstractTestNGCucumberTests {

}
