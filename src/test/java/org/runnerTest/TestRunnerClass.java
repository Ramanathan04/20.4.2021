package org.runnerTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources",glue = "org.stepdefsd",dryRun = false,monochrome = true,
snippets = SnippetType.CAMELCASE,
plugin= {"pretty","html:src\\test\\resources\\Reports","json:src\\test\\resources\\Reports\\output.jason",
		"junit:src\\test\\resources\\Reports\\output.xml"})

public class TestRunnerClass {

}
