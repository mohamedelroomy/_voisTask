package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Checkout_Popup extends BaseClass  {


    public static void ProceedToCheckOut() {
        getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement proceddToChecoutBTN = getWebDriver().findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a"));
        proceddToChecoutBTN.click();

    }


}
