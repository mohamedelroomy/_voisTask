package Test;

import POM.Checkout_Popup;
import POM.Checkout_Address;
import POM.Checkout_Shipping;
import POM.Checkout_Summary;
import org.testng.annotations.Test;

public class CheckoutProcedure extends SelectResultedProduct {

    @Test (priority = 2 )
    public void ProceedToCheckOutSteps  () throws InterruptedException{
        // click on proceed to check out button from Add to cart POPUP
        Checkout_Popup.ProceedToCheckOut();
        Thread.sleep(1500);

        // click on proceed to check out button from summary page
        Checkout_Summary.Scroll();
        Checkout_Summary.ProceedToCheckOut_Summary();
        Thread.sleep(1500);

        // click on proceed to check out button from Address page
        Checkout_Address.Scroll();
        Checkout_Address.ProceedToCheckOut_Address();
        Thread.sleep(1500);

        // click on proceed to check out button from Shipping page
        Checkout_Shipping.CheckOnTerms();
        Checkout_Shipping.Scroll();
        Checkout_Shipping.ProceedToCheckOut_Shipping();
        Thread.sleep(1500);



    }

}
