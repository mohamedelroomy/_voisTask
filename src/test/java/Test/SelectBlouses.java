package Test;

import POM.MyAccount;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectBlouses {


    @BeforeTest
    public void Login () throws InterruptedException {
        AuthenticateUser Signin =new AuthenticateUser();
        Signin.openBrowser();
        Signin.navigation();
        try {
            Signin.FillingLoginForm();
        }
        catch (InterruptedException e ){

            System.out.println("error occured");
        }


    }
    @Test (priority = 0)
    public  void  SelectBlousesFromWomen (){

        MyAccount.HoverOnWomenCategory();
        MyAccount.ClickOnBlousesSubCategory();

    }



}
