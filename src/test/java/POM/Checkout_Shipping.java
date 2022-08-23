package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Checkout_Shipping extends Checkout_Address {



    public static void ProceedToCheckOut_Shipping(){
        WebElement proceddToChecout = getWebDriver().findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button"));
        proceddToChecout.click();
    }

   public static void CheckOnTerms(){

       WebElement TermsCheckbox = getWebDriver().findElement(By.id("cgv"));
       TermsCheckbox.click();

   }


    public static void Scroll (){

        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("window.scrollBy(0,400)", "");
    }



}
