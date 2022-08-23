package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class Registration extends BaseClass{




    public static void SelectGender (char Gender){
    if (Gender == 'M'|| Gender =='m') {
        WebElement GenderMale = getWebDriver().findElement(By.id("id_gender1"));
        GenderMale.click();
    }
    else if (Gender == 'F'|| Gender=='f')
    {
        WebElement GenderMale = getWebDriver().findElement(By.id("id_gender2"));
        GenderMale.click();
    }
    else {
        System.out.println("error on inserting gender type");
    }

    }

    public static void insertCustomerFirstName (String Fname){

        WebElement CustFname = getWebDriver().findElement(By.id("customer_firstname"));
        CustFname.sendKeys(Fname);

    }
    public static void insertCustomerLastName (String Lname){

        WebElement CustLname = getWebDriver().findElement(By.id("customer_lastname"));
        CustLname.sendKeys(Lname);

    }
    public static void inserUserPassword (String Password){
    if (Password.length() >= 5) {

    WebElement Pass = getWebDriver().findElement(By.id("passwd"));
    Pass.sendKeys(Password);

    }
    else {
        System.out.println("You have to insert password with 5 characters minimum");
    }

    }

    public static void SelectDateOfBirth (String Days,String Months,String Years){

        Select daysDDl = new Select(getWebDriver().findElement(By.id("days")));
        daysDDl.selectByValue(Days);
        Select monthDDl = new Select(getWebDriver().findElement(By.id("months")));
        monthDDl.selectByValue(Months);
        Select yearDDl = new Select(getWebDriver().findElement(By.id("years")));
        yearDDl.selectByValue(Years);

    }

    public static void ClickOnNewsLetterCheckBox (){

        WebElement Newsletter = getWebDriver().findElement(By.id("newsletter"));
        Newsletter.click();

    }

    public static void ClickOnReceiveOffersCheckBox (){

        WebElement Option = getWebDriver().findElement(By.id("optin"));
        Option.click();

    }

    public static void insertAddressFirstName (String FirstName){

        WebElement Fname = getWebDriver().findElement(By.id("firstname"));
        Fname.sendKeys(FirstName);

    }

    public static void insertAddressLastName (String LastName){

        WebElement Lname = getWebDriver().findElement(By.id("lastname"));
        Lname.sendKeys(LastName);

    }

    public static void insertCompany (String Comp){

        WebElement Company = getWebDriver().findElement(By.id("company"));
        Company.sendKeys(Comp);

    }

    public static void insertFirstAdress (String Add1){

        WebElement Address1 = getWebDriver().findElement(By.id("address1"));
        Address1.sendKeys(Add1);


    }

    public static void insertSecondAdress (String Add2){

        WebElement Address2 = getWebDriver().findElement(By.id("address2"));
        Address2.sendKeys(Add2);


    }

    public static void insertCity (String city){

        WebElement City = getWebDriver().findElement(By.id("city"));
        City.sendKeys(city);


    }

    public static void SelectState (String state){
    try {
    Select stateDDl = new Select(getWebDriver().findElement(By.id("id_state")));
    stateDDl.selectByVisibleText(state);
    }
   catch (NullPointerException e){
    System.out.println("invalid state name");

   }
   }

   public static void SelectUSACountry (){

       Select countryDDl = new Select(getWebDriver().findElement(By.id("id_country")));
       countryDDl.selectByValue("21");

   }


   public static void insertPostalCode (String Zip){
   if (Zip.length() == 5) {
       WebElement PostalCode = getWebDriver().findElement(By.id("postcode"));
       PostalCode.sendKeys(Zip);
   }
   else {

       System.out.println("the postal code should be numbers with length 5");
   }

   }

   public static void insertAdditionalInfo (String Txt){

       WebElement AdditionalInfo = getWebDriver().findElement(By.id("other"));
       AdditionalInfo.sendKeys(Txt);


   }

   public static void insertHomeNo (String HomeNo){

       WebElement HomeNumber = getWebDriver().findElement(By.id("phone"));
       HomeNumber.sendKeys(HomeNo);

   }


   public static void insertPhoneNo (String PhoneNo){

       WebElement MobileNumber = getWebDriver().findElement(By.id("phone_mobile"));
       MobileNumber.sendKeys(PhoneNo);


   }


   public static void insertAlias (String alias){
       WebElement Alias = getWebDriver().findElement(By.id("alias"));
       Alias.clear();
       Alias.sendKeys(alias);
   }


   public static void ClickRegister (){
       WebElement Register = getWebDriver().findElement(By.id("submitAccount"));
       Register.click();
   }

    public static String GeneratePassword() {
        // It will generate 6 digit random Number.
        // from 0 to 999999
        Random rnd = new Random();
        int number = rnd.nextInt(9999999);

        // this will convert any number sequence into 6 character.
        return String.format("%06d", number);
    }


    public static char GenerateGender (){

        Random rand = new Random();
        int maxNumber = 2;
        int random = rand.nextInt(maxNumber) +1 ;

        if (random ==1){
            return 'm';
        }
        else if (random == 2)
        {
            return 'f';
        }
        else {
            return 'm';
        }
    }




}
