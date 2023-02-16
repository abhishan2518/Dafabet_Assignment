package com.dafabet.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;


@CucumberOptions(monochrome = true, strict = true,
        features = "C:\\Users\\Abhilash\\IdeaProjects\\dafabet_unix-timestamp\\src\\test\\resources\\features\\Unix2Date.feature",
        glue = {"com.dafabet.automation"},
        tags = {"@Test"},
        plugin = { "pretty","html:target/cucumber-reports" }

)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
