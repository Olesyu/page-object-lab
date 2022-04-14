package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public abstract class BasePage {

    public static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }

    public static void  setDriver(WebDriver webdriver){
        driver=webdriver;
    }

    public static WebDriverWait getWaiter () {
        return new WebDriverWait(driver, Duration.ofSeconds(10) );

    }
}
