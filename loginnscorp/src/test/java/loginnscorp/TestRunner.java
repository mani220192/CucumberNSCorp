package loginnscorp;

import io.cucumber.junit.Cucumber;

import org.junit.runner.RunWith;
import org.testng.annotations.Listeners;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Path to feature files
    glue = "loginnscorp",     // Package where step definitions are located
    plugin = {"pretty", "html:target/cucumber-reports.html"} // Optional: For better reports
)
@Listeners({ExtentITestListenerClassAdapter.class})
public class TestRunner extends AbstractTestNGCucumberTests{
}
