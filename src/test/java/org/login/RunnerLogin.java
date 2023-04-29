package org.login;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.ReportBuilder;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/org/login",
glue="org.login",
dryRun = false,
plugin = {"json:C:\\Users\\thiyagarajan\\Desktop\\workspace\\Ba\\target\\first.json"})
public class RunnerLogin {
	@AfterClass
	public static void report() {
		Report.generateReport("C:\\Users\\thiyagarajan\\Desktop\\workspace\\Ba\\target\\first.json");
	}
}
