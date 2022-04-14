package pageObjactLabTests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.MainPage;

public class RegisterAccountTest extends BaseTest {

    @Test //1
    public void registerAccountTest() {
        MainPage mainPage = new MainPage();
        boolean passRegisterMessagePresent = mainPage
                .clickOnMyAccountMenuButton()
                .clickForRegisterOnAccountPage()
                .enterFirstName("Olesia")
                .enterLastNameField("Stets")
                .enterEmailField("hd054247@gmail.com")
                .enterTelephone("0976655145")
                .enterPassword("13Ofg4")
                .enterPasswordConfirm("13Ofg4")
                .checkSubscribe()
                .checkAgree()
                .clickContinueButton()
                .isPassRegisterMessagePresent();


        Assertions.assertThat(passRegisterMessagePresent)
                .as("You register pass ")
                .isTrue();
    }

    @Test //2
    public void checkIsTextDangerFirstNamePresent() {
        MainPage mainPage = new MainPage();
        boolean textDangerFirstNamePresent = mainPage
                .clickOnMyAccountMenuButton()
                .clickForRegisterOnAccountPage()
                .enterLastNameField("Stets")
                .enterEmailField("hd57f7@gmail.com")
                .enterTelephone("0976655145")
                .enterPassword("13Ofg4")
                .enterPasswordConfirm("13Ofg4")
                .clickContinueButtonWithError()
                .isTextDangerFirstNamePresent();


        Assertions.assertThat(textDangerFirstNamePresent)
                .as("First Name must be between 1 and 32 characters!")
                .isTrue();
    }

    @Test //3
    public void сheckThatMyAccountTitleAppears() {
        MainPage mainPage = new MainPage();
        boolean textMyAccountPresent = mainPage
                .clickOnMyAccountMenuButton()
                .clickForLogin()
                .enterEmailAddressForLogin("s.olesyu@gmail.com")
                .enterPasswordFieldForLogin("13OlesyuSasha14")
                .clickLoginButton()
                .checkThatMyAccountTitleAppears();


        Assertions.assertThat(textMyAccountPresent)
                .as("Check that My Account title appears on the left menu")
                .isTrue();
    }

    @Test //4
    public void CheckThatTwoItemsExistInYourWishList() {
        MainPage mainPage = new MainPage();
        boolean checkTest = mainPage
                .clickOnMyAccountMenuButton()
                .clickForLogin()
                .enterEmailAddressForLogin("s.olesyu@gmail.com")
                .enterPasswordFieldForLogin("13OlesyuSasha14")
                .clickLoginButton()
                .hoverMouseOverComponents()
                .clickMonitorsButton()
                .addToWishListApple()
                .addToWishListSamsung()
                .clickForWishListButton()
                .checkIfTwoItemsPresentInWishList(2);

        Assertions.assertThat(checkTest)
                .as("check If Two Items Present In Wish List Table")
                .isTrue();


    }

    @Test //5
    public void CheckPriceForIphoneWithDifferentCurrency() {
        MainPage mainPage = new MainPage();
        mainPage.checkThatCurrency("$")
                .clickButtonForChooseIphone()
                .comparePriceForIphone("$123.20")
                .clickbuttonForChooseCurrency()
                .clickToChooseCurrencyEUR()
                .comparePriceForIphone("106.04€")
                .clickbuttonForChooseCurrency()
                .clickToChooseCurrencyGBP()
                .comparePriceForIphone("£92.93");

    }

    @Test //6
    public void CheckDifferentPriceForCameras() {
        MainPage mainPage = new MainPage();
        mainPage.clickButtonForChooseCameras()
                .numberOfCamerasOnPage(2)
                .compareOldPriceForCanonEOS5D("$122.00")
                .compareNewPriceForCanonEOS5D("$98.00")
                .compareExTaxForNikonD300("$80.00");
    }
}
