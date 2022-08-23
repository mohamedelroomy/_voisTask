package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Checkout_Address extends Checkout_Summary {

    public static void ProceedToCheckOut_Address(){
        WebElement proceddToChecout = getWebDriver().findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
        proceddToChecout.click();
    }

    public static void Scroll (){

        Checkout_Summary.Scroll();
    }


}
