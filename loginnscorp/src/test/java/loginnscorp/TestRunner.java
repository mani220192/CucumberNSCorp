package loginnscorp;

import io.cucumber.junit.Cucumber;

import org.junit.runner.RunWith;



import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Path to feature files
    glue = "loginnscorp",     // Package where step definitions are located
    plugin = {"pretty", "html:target/cucumber-reports.html"} // Optional: For better reports
)

public class TestRunner {
}
