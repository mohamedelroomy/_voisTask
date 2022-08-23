package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Checkout_Summary extends Checkout_Popup {


    public static void ProceedToCheckOut_Summary() {

        WebElement proceddToChecout = getWebDriver().findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]"));
        proceddToChecout.click();

    }
    public static void Scroll (){

        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("window.scrollBy(0,650)", "");

    }




}
