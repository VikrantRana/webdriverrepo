package Tests;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static base.DriverIntinilization.InitiizeBrowser;

public class RegistrationPage extends pages.RegistrationPage {
    ExtentReports extent = new ExtentReports();

    @BeforeTest
    public void setup() {
        String CODE1 = "{\n    \"theme\": \"standard\",\n    \"encoding\": \"utf-8\n}";
        String CODE2 = "{\n    \"protocol\": \"HTTPS\",\n    \"timelineEnabled\": false\n}";

        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/Spark.html");
        extent.attachReporter(spark);
        InitiizeBrowser("chrome");
    }
    @Test
    public void EnterUserName()
    {
        EnterUserEmail();
    }

    @AfterTest
    public  void teardown()
    {
        extent.flush();
    }

}
