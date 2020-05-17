package com.orangeHRM.TestRunner;

import java.io.File;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\more\\git\\repository\\OrangeHRM\\src\\main\\java\\com\\orangeHRM\\Feature\\login.feature",//the path of features file
	glue={"com.orangeHRM.StepDefination"}
	//,dryRun = true 
 , tags = {"@Test1"}
	
	)


public class MyRunner {
	
	
	
}
