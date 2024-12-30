package loginnscorp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LoginSteps {

    WebDriver driver;

    // Step 1: Given user is on login page
    @Given("user is on login page")
    public void userIsOnLoginPage() {
        // Setup and open the login page using Selenium WebDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chdriver\\chromedriver-win64\\chromedriver.exe"); // Update path to chromedriver
        driver = new ChromeDriver();
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");  // Replace with the actual URL of the login page
    }

    // Step 2: When user enters valid username and password
    @When("user enters valid username and password")
    public void userEntersValidUsernameAndPassword() {
        // Enter username and password in the login form
        driver.findElement(By.id("userName")).sendKeys("urfrnd92");  // Replace with actual username field id and value
        driver.findElement(By.id("password")).sendKeys("Jack123");  // Replace with actual password field id and value
    }

    // Step 3: And Clicks on Login Button
    @And("Clicks on Login Button")
    public void clicksOnLoginButton() {
        // Click the login button
        driver.findElement(By.xpath("//input[@type='submit']")).click();  // Replace with actual login button id
    }

    // Step 4: Then user is navigated to Home page
    @Then("navigate to home page")
    public void userIsNavigatedToHomePage(){
        // Verify that the user is redirected to the home page
        String expectedUrl = "https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm";  // Replace with actual home page URL
        String actualUrl = driver.getCurrentUrl();
        assert actualUrl.equals(expectedUrl) : "User was not navigated to the home page. Actual URL: " + actualUrl;
    	
    
    }

    // Step 5: And close the browser
    @And("close the browser")
    public void closeTheBrowser() {
        // Close the browser
        driver.quit();
    }


	
}