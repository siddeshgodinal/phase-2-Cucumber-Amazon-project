
package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/Amazon.feature", glue = { "steps" }, plugin = {
		"html:target/Cucumberamazonreport.html", "pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "timeline:test-output-thread/" },
tags="@all")

public class TestRunnerAmazon {

	// A cucumber runner file is used to build a communication between your feature
	// files and step defination file
	// Whenever we have to run multiple features or multiple steps, then we use
	// Cucumber runner file.
	// Whenever have to generate reports , we will use cucumber runner file

	/*
	 * - cucumber report - Extent report - Cucumber reports in PDF format - HTML
	 * Reports - TestNG Reports
	 * 
	 * Various Cucumber options or properties :
	 * 
	 * features : comma separted paths to feature file. dryRun=true : It will check
	 * if every steps has an step defination method implemented or not glue : comma
	 * separated package names of step def. file plugin = pretty : Tags
	 * 
	 */

}
