package Test;

import POM.BlouseCategory;
import org.checkerframework.framework.qual.PreconditionAnnotation;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SelectResultedProduct extends SelectBlouses {

public static BlouseCategory BlouseCat = new BlouseCategory();

    @BeforeTest
    public void Login() throws InterruptedException{

        super.Login();
        Thread.sleep(1000);
    }



    @Test (priority = 1,dependsOnMethods = "SelectBlousesFromWomen")
    public void SelectProduct ()  {

        BlouseCat.Scrolling();
        BlouseCat.ClickOnToAddCart();

    }









}
