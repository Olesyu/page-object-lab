package pages;

import org.openqa.selenium.By;

public class LoginPage extends MainPage {

    private final By emailAddressField = By.xpath("//input[@name=\"email\"]");
    private final By passwordField = By.xpath("//input[@id=\"input-password\"]");
    private final By loginButton = By.xpath("//input[@class=\"btn btn-primary\"]");
    private final By textMyAccountPresent = By.xpath("//h2[contains(text(), \"My Account\")]");

    public LoginPage enterEmailAddressForLogin(String emailAddress) {
        getDriver().findElement(emailAddressField).sendKeys(emailAddress);
        return this;
    }

    public LoginPage enterPasswordFieldForLogin(String password) {
        getDriver().findElement(passwordField).sendKeys(password);
        return this;
    }

    public MyAccountPage clickLoginButton() {
        getDriver().findElement(loginButton).click();
        return new MyAccountPage();
    }

    public boolean CheckThatMyAccountTitleAppears() {
    return getDriver().findElement(textMyAccountPresent).isDisplayed();
   }
}

