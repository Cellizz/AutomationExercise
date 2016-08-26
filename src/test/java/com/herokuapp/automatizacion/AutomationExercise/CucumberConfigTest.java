package com.herokuapp.automatizacion.AutomationExercise;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, features = { "src/test/resources/cucumber/" }, format = { "pretty",
		"html:target/cucumber" }, glue = { "com.herokuapp.automatizacion.AutomationExercise" })
public class CucumberConfigTest {

}
