package pages;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class IphonePage extends MainPage {


    private final By priceForIphone = By.xpath("//div[@class=\"col-sm-4\"]/ul[@class=\"list-unstyled\"]/li/h2");
    private final By buttonForChooseCurrency = By.xpath("//button[@class=\"btn btn-link dropdown-toggle\"]");
    private final By currencyIsEUR = By.xpath("//button[@class=\"currency-select btn btn-link btn-block\" and @ name=\"EUR\"]");
    private final By currencyIsGBP = By.xpath("//button[@class=\"currency-select btn btn-link btn-block\" and @ name=\"GBP\"]");
    private final By currencyIsUSD = By.xpath("//button[@class=\"currency-select btn btn-link btn-block\" and @ name=\"USD\"]");




    public IphonePage comparePriceForIphone(String priceIphone) {
        getWaiter().until(ExpectedConditions.visibilityOfElementLocated(priceForIphone));
        if (getDriver().findElement(priceForIphone).getText().equals(priceIphone)) {
            return this;
        }
        return null;
    }

    public IphonePage clickbuttonForChooseCurrency() {
        getDriver().findElement(buttonForChooseCurrency).click();
        return this;
    }

    public IphonePage clickToChooseCurrencyEUR() {
        getDriver().findElement(currencyIsEUR).click();
        return this;
    }

    public IphonePage clickToChooseCurrencyGBP() {
        getDriver().findElement(currencyIsGBP).click();
        return this;
    }

    public IphonePage clickToChooseCurrencyUSD() {
        getDriver().findElement(currencyIsUSD).click();
        return this;
    }
}
