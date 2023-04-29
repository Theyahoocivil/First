package org.productOne;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/org.productOne",glue="org.productOne",
dryRun = true)
public class RunnerProduct {

}
