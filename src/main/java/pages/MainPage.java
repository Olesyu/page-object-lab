package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.management.monitor.Monitor;
import javax.security.auth.login.LoginContext;

public class MainPage extends BasePage {

    private final By myAccountMenuButton = By.xpath("//a[contains(@title, \"My Account\")]/ancestor::li[1]");
    private final By graphicRegisterSubMenuButton = By.xpath("//a[contains( text(), 'Register')]");
    private final By graphicLoginSubMenuButton = By.xpath("//a[contains( @href, \"https://demo.opencart.com/index.php?route=account/login\")]");
    private final By menuComponentsButton = By.xpath("//a[contains(text(), \"Components\") and @class=\"dropdown-toggle\"]");
    private final By clickOnMonitorsButton = By.xpath("//a[contains(text(), \"Monitors\")]\n");
    private final By wishListButton = By.xpath("//a[@id=\"wishlist-total\"]");
    private final By currentCurrency = By.xpath("//form[@id=\"form-currency\"]/div/button/strong");
    private final By buttonForChooseCurrency = By.xpath("//button[@class=\"btn btn-link dropdown-toggle\"]");
    private final By currencyIsEUR = By.xpath("//button[@class=\"currency-select btn btn-link btn-block\" and @ name=\"EUR\"]");
    private final By currencyIsGBP = By.xpath("//button[@class=\"currency-select btn btn-link btn-block\" and @ name=\"GBP\"]");
    private final By currencyIsUSD = By.xpath("//button[@class=\"currency-select btn btn-link btn-block\" and @ name=\"USD\"]");
    private final By buttonForChooseIphone = By.xpath("//a[contains( @href, \"https://demo.opencart.com/index.php?route=product/product&product_id=40\")]");
    private final By buttonForChooseCameras = By.xpath("//a[contains( @href, \"https://demo.opencart.com/index.php?route=product/category&path=33\")]");


    public MainPage clickOnMyAccountMenuButton() {
        getDriver().findElement(myAccountMenuButton).click();
        return this;
    }

    public RegisterAccountPage clickForRegisterOnAccountPage() {
        getDriver().findElement(graphicRegisterSubMenuButton).click();
        return new RegisterAccountPage();
    }

    public LoginPage clickForLogin() {
        getDriver().findElement(graphicLoginSubMenuButton).click();
        return new LoginPage();
    }

    public MainPage hoverMouseOverComponents() {
        WebElement componentsButton = getDriver().findElement(menuComponentsButton);

        Actions actions = new Actions(getDriver());
        actions.moveToElement(componentsButton).build().perform();
        return this;
    }

    public MonitorPage clickMonitorsButton() {
        getDriver().findElement(clickOnMonitorsButton).click();
        return new MonitorPage();
    }

    public WishListPage clickForWishListButton() {
        getDriver().findElement(wishListButton).click();
        return new WishListPage();
    }

    public MainPage checkThatCurrency(String currency) {
        if (getDriver().findElement(currentCurrency).getText() == currency) {
            return this;
        }
        getDriver().findElement(currentCurrency).click();
        getDriver().findElement(currencyIsUSD).click();
        return this;
    }

        public MainPage clickbuttonForChooseCurrency () {
            getDriver().findElement(buttonForChooseCurrency).click();
            return this;
        }

        public MainPage clickToChooseCurrencyEUR () {
            getDriver().findElement(currencyIsEUR).click();
            return this;
        }

        public MainPage clickToChooseCurrencyGBP () {
            getDriver().findElement(currencyIsGBP).click();
            return this;
        }

        public MainPage clickToChooseCurrencyUSD () {
            getDriver().findElement(currencyIsUSD).click();
            return this;
        }

        public IphonePage clickButtonForChooseIphone () {
            getDriver().findElement(buttonForChooseIphone).click();
            return new IphonePage();
        }

        public CamerasPage clickButtonForChooseCameras () {
            getDriver().findElement(buttonForChooseCameras).click();
            return new CamerasPage();
        }

    }
