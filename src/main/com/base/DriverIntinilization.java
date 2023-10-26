package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverIntinilization {

    static WebDriver driver;
    public static void InitiizeBrowser(String browsername) {

        if(browsername.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();
            driver.get("https://rahulshettyacademy.com/angularpractice/");
            driver.manage().window().maximize();
        }

        if(browsername.equalsIgnoreCase("Firefox"))
        {
            driver = new FirefoxDriver();
        }

        if(browsername.equalsIgnoreCase("Safari"))
        {
            driver = new SafariDriver();
        }

        else if(browsername.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();
        }

    }
}