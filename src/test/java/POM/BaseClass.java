package POM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseClass {

   public static WebDriver drive;


    public static void OpenBrowser (){

        WebDriverManager.chromedriver().setup();
        drive = new ChromeDriver() ;
        drive.manage().window().setSize(new Dimension(1024, 768));
        drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }
    public static void navigate (String url) {

        drive.get(url);
    }
    public static WebDriver getWebDriver (){

        return drive;

    }


}
