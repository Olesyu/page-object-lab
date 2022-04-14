package pages;

import org.openqa.selenium.By;

public class MonitorPage extends MainPage{
    private final By addToWishListButtonApple = By.xpath("//button[@onclick=\"wishlist.add('42');\"]");
    private final By addToWishListButtonSamsung= By.xpath("//button[@onclick=\"wishlist.add('33');\"]");



    public MonitorPage addToWishListApple(){
        getDriver().findElement(addToWishListButtonApple).click();
        return this;
    }

    public MonitorPage addToWishListSamsung() {
        getDriver().findElement(addToWishListButtonSamsung).click();
        return this;
    }

}
