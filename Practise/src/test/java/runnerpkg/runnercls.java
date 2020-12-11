package runnerpkg;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;  
 
import cucumber.api.testng.TestNGCucumberRunner;  
import org.testng.annotations.AfterClass;  
import org.testng.annotations.BeforeClass;  
import org.testng.annotations.DataProvider;  
import org.testng.annotations.Test; 


@CucumberOptions(
		features= {"src/test/java/features"},
		glue= {"stepdefinitions"},
		monochrome=true,
		plugin= {"pretty" , "html:target/cucumber","json:target/CucumberTestReport.json"})

public class runnercls extends AbstractTestNGCucumberTests {

}
