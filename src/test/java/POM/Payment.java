package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Payment extends BaseClass {

    public static void Scroll (){

        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("window.scrollBy(0,400)", "");
    }

    public static void ClickOnBankWirePayment (){

        WebElement BankWireBTN = getWebDriver().findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a"));
        BankWireBTN.click();


    }

    public static void ClickConfirmMyOrder (){

        WebElement ConfirmOrder = getWebDriver().findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
        ConfirmOrder.click();


    }
    public static void ClickOnBackToOrderBtn (){

        WebElement BackToOrder = getWebDriver().findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p/a"));
        BackToOrder.click();

    }




}
