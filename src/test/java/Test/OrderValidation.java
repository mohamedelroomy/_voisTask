package Test;

import POM.OrderHistory;
import POM.Payment;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderValidation extends ConfirmOrder_BankWire{

    @Test(priority = 4)
    public static void View_the_Latest_Order () throws InterruptedException{

        Payment.ClickOnBackToOrderBtn();
        OrderHistory.Scroll();
        OrderHistory.Sort_By_Order_Date_Desc();
        OrderHistory.Get_Latest_order_in_Order_table();
        Thread.sleep(1000);
        OrderHistory.Click_On_Detail_button();
        Thread.sleep(1000);

    }

    @Test (priority = 5)
    public static void Validate_Product_name (){

        OrderHistory.Scroll_to_product_table();
        String ProductName = OrderHistory.Get_Product_name();
        Assert.assertEquals(ProductName,"Blouse - Color : Black, Size : S");


    }


}
