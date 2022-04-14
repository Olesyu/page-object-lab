package pages;

import org.openqa.selenium.By;

public class PassAccountRegisterPage extends MainPage {
    private final By passRegisterMessagePresent = By.xpath("//h1[contains(text(), \"Your Account Has Been Created!\" )  ]");

    public boolean isPassRegisterMessagePresent(){
        return getDriver().findElement(passRegisterMessagePresent).isDisplayed();
    }
}
