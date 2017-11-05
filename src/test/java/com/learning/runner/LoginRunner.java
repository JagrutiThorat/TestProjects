package com.learning.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/feature",
		glue = "com.learning.steps"
	)

public class LoginRunner {
	
	@BeforeClass
    public static void before() {
		System.setProperty("webdriver.gecko.driver", "D:\\Drivers for selenium\\geckodriver-v0.17.0-win64\\geckodriver.exe");
    }
	
	}
