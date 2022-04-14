package pages;

import org.openqa.selenium.By;

public class MyAccountPage extends MainPage {
    private final By textMyAccountPresent = By.xpath("//h2[contains(text(), \"My Account\")]");



    public boolean checkThatMyAccountTitleAppears() {
        return getDriver().findElement(textMyAccountPresent).isDisplayed();
    }

}
