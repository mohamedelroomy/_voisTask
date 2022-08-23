package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MyAccount extends BaseClass{

    public static void HoverOnWomenCategory (){

        WebElement WomenLink = getWebDriver().findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
        Actions action = new Actions(getWebDriver());
        action.moveToElement(WomenLink).perform();
        getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));


    }

    public static void ClickOnBlousesSubCategory (){

        WebElement blouses = getWebDriver().findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[2]/a"));
        blouses.click();



    }


}
