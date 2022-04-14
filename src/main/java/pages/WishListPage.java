package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WishListPage extends MainPage {
    private final By wishListTable = By.tagName("tbody");
    private final By wishListTableRow = By.tagName("tr");



    public boolean checkIfTwoItemsPresentInWishList(int numberOfItems ) {

        WebElement wishListTableBody = getDriver().findElement(wishListTable);
        return wishListTableBody.findElements(wishListTableRow).size() == numberOfItems; //шукаємо в середині wishListTableBody усі елементи з тегом "tr" і викликаємо ф-ю Size для визначення їх кількості і порівнюємо з заданим числом

    }
}
