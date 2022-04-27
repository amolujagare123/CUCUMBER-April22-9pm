package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features" ,
        glue = "stepdefinitions"
        ,dryRun = false
       // , tags = "@login"
        , plugin = {"pretty","html:target/report.html"
        ,"json:target/report.json" , "junit:target/report.xml"}
)
public class TestRunner {
}
