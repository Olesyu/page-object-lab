package pageObjactLabTests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.BasePage;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();   // дозволяє обійти ошибку, оновлення хрому відбулося а...
        chromeOptions.addArguments("--disable-site-isolation-trials");  // ... бібліотека боні гарсіа ще не оновилася
        WebDriver driver = new ChromeDriver(chromeOptions);
        //driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/");
        BasePage.setDriver(driver);
    }

    @AfterMethod
    public void quite() {
        BasePage.getDriver().quit();
    }

}
