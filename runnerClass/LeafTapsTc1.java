package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;


	
@CucumberOptions(features = {"src/test/java/features/LogInPage.feature"},glue = {"stepDefinitions"},publish = true, dryRun = false)

public class LeafTapsTc1 extends AbstractTestNGCucumberTests{
	
	

}
