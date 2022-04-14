package pages;

import org.openqa.selenium.By;

public class RegisterAccountPage extends BasePage {

    private final By firstNameField = By.xpath("//input[@id=\"input-firstname\"]");
    private final By lastNameField = By.xpath("//input[@id=\"input-lastname\"]");
    private final By emailField = By.xpath("//input[@id=\"input-email\"]");
    private final By telephoneField = By.xpath("//input[@id=\"input-telephone\"]");
    private final By passwordField = By.xpath("//input[@id=\"input-password\"]");
    private final By passwordConfirmField = By.xpath("//input[@id=\"input-confirm\"]");
    private final By subscribeCheckbox = By.xpath("//input[@type=\"radio\" and @value=\"1\" and @name=\"newsletter\" ]");
    private final By checkboxAgree = By.xpath("//input[@name=\"agree\" ] ");
    private final By continueButton = By.xpath("//input[@value=\"Continue\"]");
    private final By textDangerFirstNamePresent = By.xpath("//div[@class=\"text-danger\"]");


    public RegisterAccountPage enterFirstName(String firstName) {
        getDriver().findElement(firstNameField).sendKeys(firstName);
        return this;
    }

    public RegisterAccountPage enterLastNameField(String lastName) {
        getDriver().findElement(lastNameField).sendKeys(lastName);
        return this;
    }

    public RegisterAccountPage enterEmailField(String email) {
        getDriver().findElement(emailField).sendKeys(email);
        return this;
    }

    public RegisterAccountPage enterTelephone(String phone) {
        getDriver().findElement(telephoneField).sendKeys(phone);
        return this;
    }

    public RegisterAccountPage enterPassword(String password) {
        getDriver().findElement(passwordField).sendKeys(password);
        return this;
    }

    public RegisterAccountPage enterPasswordConfirm(String passwordConfirm) {
        getDriver().findElement(passwordConfirmField).sendKeys(passwordConfirm);
        return this;
    }

    public RegisterAccountPage checkSubscribe() {
        getDriver().findElement(subscribeCheckbox).click();
        return this;
    }

    public RegisterAccountPage checkAgree() {
        getDriver().findElement(checkboxAgree).click();
        return this;
    }

    public PassAccountRegisterPage clickContinueButton() {
        getDriver().findElement(continueButton).click();
        return new PassAccountRegisterPage();
    }

    public RegisterAccountPage clickContinueButtonWithError() {
        getDriver().findElement(continueButton).click();
        return this;
    }

    public boolean isTextDangerFirstNamePresent() {
        return getDriver().findElement(textDangerFirstNamePresent).isDisplayed();
    }
}
