package com.testrunnercucum.com;

import java.io.IOException;
import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.MavenProject.Base_Class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactinfeature\\com", glue = "com.stepdefinition.com", 
plugin = {"pretty","html:Report/Cucumber_Html_Report",
		"json:Report/Cucumber_Json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/Cucumber_Extent_Report.html"})
//monochrome = true, dryRun = true, strict = false)
//tags={"@smoketest"}}
public class Adactin_cucumRunner {
	public static WebDriver driver;

	@BeforeClass
	public static void browserlaunch() {
		driver = Base_Class.browserlaunch("chrome");
	}

	@AfterClass
	public static void tearDown() throws IOException {
		Base_Class.screenshot();

	}
}
