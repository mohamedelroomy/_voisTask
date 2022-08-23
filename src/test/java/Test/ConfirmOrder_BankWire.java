package Test;

import POM.Payment;
import org.testng.annotations.Test;

public class ConfirmOrder_BankWire extends CheckoutProcedure {


    @Test (priority = 3 )
    public static void Click_on_pay_by_bank_wire () throws InterruptedException{

        Payment.Scroll();
        Payment.ClickOnBankWirePayment();
        Payment.Scroll();
        Payment.ClickConfirmMyOrder();
        Thread.sleep(1500);


    }

}
