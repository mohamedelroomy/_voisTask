package Test;

import POM.BaseClass;
import POM.HomePage;
import POM.LogIn;
import POM.Registration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AuthenticateUser {
    public static BaseClass BS = new BaseClass();
    public static HomePage HP = new HomePage();
    public static LogIn login = new LogIn();


    @BeforeTest
    public void openBrowser (){

        BS.OpenBrowser();


    }



    @Test(priority = 0)
    public void navigation (){

        BS.navigate("http://automationpractice.com/index.php");
        HP.CLickOnSignIn();
    }

    @Test (priority = 1)
    public void FillingLoginForm() throws InterruptedException{

    login.insertUserEmail ("mrmr24@yahoo.com");
    login.insertUserPassqord("432573");
    Thread.sleep(1000);
    login.ClickOnLogIN();




    }



}
