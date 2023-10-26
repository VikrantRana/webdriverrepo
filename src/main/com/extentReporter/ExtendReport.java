package extentReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ExtendReport {
    ExtentReports extent = new ExtentReports();
    @BeforeTest
    public void setup()
    {
        String CODE1 = "{\n    \"theme\": \"standard\",\n    \"encoding\": \"utf-8\n}";
        String CODE2 = "{\n    \"protocol\": \"HTTPS\",\n    \"timelineEnabled\": false\n}";

        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/Spark.html");
        extent.attachReporter(spark);

    }

    @AfterTest
    public  void teardown()
    {
        extent.flush();
    }

}
