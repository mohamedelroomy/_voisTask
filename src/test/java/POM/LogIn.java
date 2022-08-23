package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.Random;

public class LogIn extends BaseClass {



    public static void insertNewEmail (String Mail){

        WebElement EmailBox = getWebDriver().findElement(By.id("email_create"));
        EmailBox.sendKeys(Mail);

    }

    public static void ClickCreateAccount (){

        WebElement CreateBtn = getWebDriver().findElement(By.id("SubmitCreate"));
        CreateBtn.click();
        getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


    }

    public static void insertUserEmail (String UserMail){

        WebElement UserEmailBox =getWebDriver().findElement(By.id("email"));
        UserEmailBox.sendKeys(UserMail);

    }

    public static void insertUserPassqord (String UserPass){

        WebElement UserPassBox = getWebDriver().findElement(By.id("passwd"));
        UserPassBox.sendKeys(UserPass);

    }
    public static void ClickOnLogIN (){

        WebElement Login = getWebDriver().findElement(By.id("SubmitLogin"));
        Login.click();

    }
    public static String GenerateEmail (){

        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr + "@gmail.com";



    }





}
