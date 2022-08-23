package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseClass {




    public static void CLickOnSignIn (){


        WebElement SignIN = getWebDriver ().findElement(By.linkText("Sign in"));
        SignIN.click();
    }


}
