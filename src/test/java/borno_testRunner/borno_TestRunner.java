package borno_testRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import borno_UtiliTY.borno_base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/borno_featureFolder"},
plugin = {"json:target/cucumber.json"},
glue = "borno_stepDefinition",tags = {"@Sweet"})


public class borno_TestRunner extends AbstractTestNGCucumberTests{
	
	@BeforeTest 
	public void bornoSTARTurl() {
		borno_base borno = new borno_base();
		borno.bornobrowser();
	}
	@AfterTest
	public void bornoCLOSEurl() {
		borno_base borno = new borno_base();
		//borno.driver.quit();
	}
	
	

}
