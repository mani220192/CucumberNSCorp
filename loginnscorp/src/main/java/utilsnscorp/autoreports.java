package utilsnscorp;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class autoreports {

	public static void main(String[] args) {

		ExtentSparkReporter reporter=new ExtentSparkReporter("/loginnscorp/src/test/Test_report1.html");
		ExtentReports extend=new ExtentReports();
		extend.attachReporter(reporter);
		ExtentTest test1= extend.createTest("Login to cart portal");
		test1.assignAuthor("Manikandan");
		test1.assignCategory("Smoke Test");
		test1.pass("Enter username & password");
		ExtentTest test2= extend.createTest("Design page");
		test2.assignAuthor("Manikandan");
		test2.assignCategory("Regression Test");
		test2.pass("Enter username & password");
		test2.fail("Invalid username & password",
					MediaEntityBuilder
					.createScreenCaptureFromPath("img.png")
					.build());
		extend.flush();
		
	}

}
