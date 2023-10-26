package base;
import org.openqa.selenium.By;
import static base.DriverIntinilization.driver;

public class CommonMethods
{
    public static void EnterTextInTextBox(String text, By ele)
    {
        driver.findElement(ele).sendKeys(text);

    }
    public static void ClickOnElement(By ele)
    {
        driver.findElement(ele).click();
    }
}
