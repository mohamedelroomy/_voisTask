package Test;

import POM.BaseClass;
import POM.HomePage;
import POM.LogIn;
import POM.Registration;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class CreateUser {


    @BeforeTest
    public void openBrowser (){

        BaseClass.OpenBrowser();


    }



    @Test(priority = -1)
    public void navigation (){

        BaseClass.navigate("http://automationpractice.com/index.php");
        HomePage.CLickOnSignIn();
    }



    @Test (priority = 1)
    public void InsertingNewEmail (){

        LogIn.insertNewEmail(LogIn.GenerateEmail());
        LogIn.ClickCreateAccount();
    }

   @Test ( priority = 2)
    public void fillingPersonalInfo () throws InterruptedException{

        Registration.SelectGender(Registration.GenerateGender());
        Registration.insertCustomerFirstName("mohamed");
        Registration.insertCustomerLastName("hamdy");
        Registration.inserUserPassword(Registration.GeneratePassword());
        Registration.SelectDateOfBirth("25","7","1999");
        Registration.ClickOnNewsLetterCheckBox();
        Registration.ClickOnReceiveOffersCheckBox();

        Thread.sleep(1000);

    }

    @Test (priority = 3)
    public void fillingAddressInfo() throws InterruptedException{

        Registration.insertAddressLastName("salah");

        Registration.insertAddressFirstName("elroomy");

        Registration.insertCompany("Andalusia");

        Registration.insertFirstAdress("31 bitash st, alexandria, egypt");

        Registration.insertSecondAdress("elhanouvil , alex, egy");

        Registration.insertCity("Alexandria");

        Registration.SelectState("Nevada");

        Registration.insertPostalCode("55599");

        Registration.SelectUSACountry();

        Registration.insertAdditionalInfo("Hi My Name Is Mohamed Elroomy");

        Registration.insertHomeNo("034349654");

        Registration.insertPhoneNo("01010133515");

        Registration.insertAlias("sidi gaber ,alexandria ,egypt");

        Thread.sleep(1000);


    }

    @AfterTest
    public static void Submit (){

        Registration.ClickRegister();
    }




}
