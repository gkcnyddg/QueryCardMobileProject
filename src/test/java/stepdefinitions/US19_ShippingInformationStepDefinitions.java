package stepdefinitions;

import Page.ShippingInformationPage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;
import utilities.ReusableMethods;

public class US19_ShippingInformationStepDefinitions {


    ShippingInformationPage ShipInfPage = new ShippingInformationPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("Ziyaretçi kullanıcı girişi yapar.")
    public void ziyaretçi_kullanıcı_girişi_yapar() throws InterruptedException {
        ShipInfPage.AltBarProfileMEA.click();
        ShipInfPage.ProfilePageSignInMEA.click();
        ShipInfPage.SignUseEmailInsteadMEA.click();
        ShipInfPage.SignEmailTextBoxMEA.click();
        ShipInfPage.SignEmailTextBoxMEA.sendKeys("muhammedemin.user@querycart.com");
        ShipInfPage.SignPasswordTextBoxMEA.click();
        ShipInfPage.SignPasswordTextBoxMEA.sendKeys("Query.2006");
        ShipInfPage.SignPageSignInButtonMEA.click();
    }

    @Given("Kullanıcı istediği ürünleri sepetine ekler ve Shipping Information sayfasına ulaşır.")
    public void kullanıcı_istediği_ürünleri_sepetine_ekler_ve_shipping_ınformation_sayfasına_ulaşır() throws InterruptedException {
        ShipInfPage.AltBarCategoryMEA.click();
        ShipInfPage.CategoryJuniorsMEA.click();
        ShipInfPage.JuniorsMickyMouseMEA.click();
        Thread.sleep(20000);
        ShipInfPage.UrunColourBlueMEA.click();
        ReusableMethods.ekranKaydirmaMethodu(549,1713,1,541,745);
        ShipInfPage.UrunPageAddToCartMEA.click();
        ReusableMethods.koordinatTiklamaMethodu(959,2018);
        ShipInfPage.ProceedToCheckoutMEA.click();
    }

    @Given("Kullanıcı Pick Up Butonunun görüntüler ve tıklar.")
    public void kullanıcı_pick_up_butonunun_görüntüler_ve_tıklar() {

        ShipInfPage.ShipInfPickUpMEA.isDisplayed();
        ShipInfPage.ShipInfPickUpMEA.click();

    }

    @Given("Kullanıcı Delivery Butonunu görüntüler ve tıklar.")
    public void kullanıcı_delivery_butonunu_görüntüler_ve_tıklar() {
        ShipInfPage.ShipInfDeliveryMEA.isDisplayed();
        ShipInfPage.ShipInfDeliveryMEA.click();

    }




}
