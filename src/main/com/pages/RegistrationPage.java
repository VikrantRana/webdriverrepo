package pages;

import base.CommonMethods;
import org.openqa.selenium.By;

public class RegistrationPage extends CommonMethods
{
     By name = By.name(("name"));
     By email = By.name(("email"));

    public void EnterUserEmail()
    {
         EnterTextInTextBox("Vikrant@gmail.com",name);
    }







}
