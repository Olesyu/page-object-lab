package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CamerasPage extends MainPage {

    private final By camerasContainer = By.xpath("//*[@id=\"content\"]/div[2]");
    private final By camera = By.xpath("//div[@class=\"product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12\"]");

    private final By oldPriceForCanonEOS5D = By.xpath("//span[@class=\"price-old\" ]");
    private final By newPriceForCanonEOS5D = By.xpath("//span[@class=\"price-new\" ]");
    private final By exTaxForNikonD300 = By.xpath("//div[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[1]/p[2]/span");

    //  public boolean numberOfCamerasOnPage(int numberOfItems ) {
    //  WebElement cameras= getDriver().findElement(camerasContainer);
    //  return cameras.findElements(camera).size() == numberOfItems;  } /Варіант з лишньою змінною

    public CamerasPage numberOfCamerasOnPage(int numberOfItems) {
        if (getDriver().findElement(camerasContainer).findElements(camera).size() == numberOfItems) {
            return this;
        }
        return null;
    }

    public CamerasPage compareOldPriceForCanonEOS5D(String oldPrice) {
        if (getDriver().findElement(oldPriceForCanonEOS5D).getText().equals(oldPrice)) {
            return this;
        }
        return null;
    }


    public CamerasPage compareExTaxForNikonD300(String exTax) {
        if (getDriver().findElement(exTaxForNikonD300).getText().equals("Ex Tax: " + exTax)) {
            return this;
        }
        return null;
    }

    public CamerasPage compareNewPriceForCanonEOS5D(String newPrice) {
        if (getDriver().findElement(newPriceForCanonEOS5D).getText().equals(newPrice)) {
            return this;
        }
        return null;
    }

}

