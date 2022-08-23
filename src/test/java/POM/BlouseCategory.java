package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BlouseCategory extends BaseClass{

    public static void Scrolling (){

        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("window.scrollBy(0,550)", "");

    }
    public static void ClickOnToAddCart (){

       WebElement AddToCart = getWebDriver().findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]"));
       AddToCart.click();

    }
}
