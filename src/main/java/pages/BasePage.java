package pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    public static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }

    public static void  setDriver(WebDriver webdriver){
        driver=webdriver;
    }
}
