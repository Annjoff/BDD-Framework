package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(features = {"src/test/features/order.feature"},
            plugin= {"pretty", "html:target/reports.html"}
            //glue= {"steps"}
    )
    public class TestRunner {
    }


