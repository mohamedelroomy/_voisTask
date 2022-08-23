package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OrderHistory extends BaseClass{

    public static void Scroll (){

        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("window.scrollBy(0,300)", "");
    }
    public static void Sort_By_Order_Date_Desc (){

        WebElement Date = getWebDriver().findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/thead/tr/th[2]"));
        Date.click();
        Date.click();


    }
    public static void Get_Latest_order_in_Order_table(){

        WebElement TABLE = getWebDriver().findElement(By.id("order-list"));
        List<WebElement> rows = TABLE.findElements(By.tagName("tr"));
        WebElement OrderRefernce = rows.get(0).findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[1]/td[1]"));
        OrderRefernce.click();

    }

    public static void Click_On_Detail_button (){



        WebElement Details = getWebDriver().findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr[2]/td/div/div[3]/div[2]/a[1]"));
        Details.click();
    }

    public static void Scroll_to_product_table(){

        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        WebElement Product = getWebDriver().findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/form[1]/div/table/tbody/tr/td[2]"));
        js.executeScript("arguments[0].scrollIntoView();", Product);
    }

    public static String Get_Product_name (){
        WebElement ProductLabel = getWebDriver().findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/form[1]/div/table/tbody/tr/td[2]/label"));
        return ProductLabel.getText();

    }


}
