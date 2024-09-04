package stepdefinitions;

import Page.ReturnRequestPage;
import Page.ShippingInformationPage;
import io.cucumber.java.en.Given;

public class US25_ReturnRequest {
    ShippingInformationPage ShipInfPage = new ShippingInformationPage();
    ReturnRequestPage returnRequestpage = new ReturnRequestPage();

    @Given("Kullanıcı girişi yapilir.")
    public void kullanıcı_girişi_yapilir() {
        ShipInfPage.AltBarProfileMEA.click();
        ShipInfPage.ProfilePageSignInMEA.click();
        ShipInfPage.SignUseEmailInsteadMEA.click();
        ShipInfPage.SignEmailTextBoxMEA.click();
        ShipInfPage.SignEmailTextBoxMEA.sendKeys("serife.user@querycart.com");
        ShipInfPage.SignPasswordTextBoxMEA.click();
        ShipInfPage.SignPasswordTextBoxMEA.sendKeys("Query.2006");
        ShipInfPage.SignPageSignInButtonMEA.click();
    }
    @Given("Kullanici Alt bardan profile tiklar.")
    public void kullanici_alt_bardan_profile_tiklar() {
        ShipInfPage.AltBarProfileMEA.click();
    }
    @Given("Kullanici order historye tiklar.")
    public void kullanici_order_historye_tiklar() {

    returnRequestpage.ProfilOrderHistory.click();
    returnRequestpage.ProfilOrderHistory.isDisplayed();
    }
    @Given("Kullanici Delivered olan siparise tiklar.")
    public void kullanici_delivered_olan_siparise_tiklar() {

    returnRequestpage.OrderHistoryIlkSiparis.click();

    }
    @Given("Kullanici ReturnRequest butonunu goruntuler ve tiklar.")
    public void kullanici_return_request_butonunu_goruntuler_ve_tiklar() {

    }
    @Given("Kullanici iade nedeni,not ve attachmenti göruntuler.")
    public void kullanici_iade_nedeni_not_ve_attachmenti_göruntuler() {

    }
    @Given("Kullanici RequestReturn butonunu görüntüler ve tiklar.")
    public void kullanici_request_return_butonunu_görüntüler_ve_tiklar() {

    }
    @Given("Kullanici Return orders butonuna tiklar.")
    public void kullanici_return_orders_butonuna_tiklar() {

    returnRequestpage.ProfilReturnOrders.click();
    }
    @Given("Kullanici iade islemi baslatilan urunu görüntüler.")
    public void kullanici_iade_islemi_baslatilan_urunu_görüntüler() {


    }
}
