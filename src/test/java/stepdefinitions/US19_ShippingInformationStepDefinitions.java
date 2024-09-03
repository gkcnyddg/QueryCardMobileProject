package stepdefinitions;

import Page.ShippingInformationPage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;
import utilities.ReusableMethods;

public class US19_ShippingInformationStepDefinitions {


    ShippingInformationPage ShipInfPage = new ShippingInformationPage();
    Actions actions = new Actions(Driver.getDriver());



    // TC 1

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





    // TC 2

    @Given("Kullanıcı Add butonuna tıklar.")
    public void kullanıcı_add_butonuna_tıklar() {
        ShipInfPage.ShipInfAddMEA.click();
    }

    @Given("Kullanıcı ilgili Textboxları doldurur ve seçimleri yapar.")
    public void kullanıcı_ilgili_textboxları_doldurur_ve_seçimleri_yapar() throws InterruptedException {
        ShipInfPage.NewAdressFullNameMEA.click();
        ShipInfPage.NewAdressFullNameMEA.sendKeys("Muhammed Emin AYDOGAN");
        ShipInfPage.NewAdressEmailMEA.click();
        ShipInfPage.NewAdressEmailMEA.sendKeys("fakemail@gmail.com");
        ShipInfPage.NewAdressPhoneMEA.click();
        ShipInfPage.NewAdressPhoneMEA.sendKeys("7776655");
        ShipInfPage.NewAdressCountryMEA.click();
        ShipInfPage.NewAdressAramaTextBoxMEA.click();
        ShipInfPage.NewAdressAramaTextBoxMEA.sendKeys("Turkey");
        ShipInfPage.NewAdressCSCilkMEA.click();
        ShipInfPage.NewAdressStateMEA.click();
        ShipInfPage.NewAdressAramaTextBoxMEA.click();
        ShipInfPage.NewAdressAramaTextBoxMEA.sendKeys("Eskişehir Province");
        ShipInfPage.NewAdressCSCilkMEA.click();
        ShipInfPage.NewAdressCityMEA.click();
        ShipInfPage.NewAdressAramaTextBoxMEA.click();
        ShipInfPage.NewAdressAramaTextBoxMEA.sendKeys("Odunpazarı");
        ShipInfPage.NewAdressCSCilkMEA.click();
        ShipInfPage.NewAdressZipCodeMEA.click();
        ShipInfPage.NewAdressZipCodeMEA.sendKeys("26000");
        ReusableMethods.ekranKaydirmaMethodu(501,1299,1,493,519);
        ShipInfPage.NewAdressStreetAdressMEA.click();
        ShipInfPage.NewAdressStreetAdressMEA.sendKeys("999");
    }

    @Given("Kullanıcı Add Address Butonuna tıklar.")
    public void kullanıcı_add_address_butonuna_tıklar() {
        ShipInfPage.NewAdressAddAdressButtonMEA.click();
    }

    @Given("Kullanıcı Shipping Information sayfasında oluşturduğu Address’i görüntüler.")
    public void kullanıcı_shipping_ınformation_sayfasında_oluşturduğu_address_i_görüntüler() {
        ShipInfPage.NewAdressIlkAdresKartiMEA.isDisplayed();
    }


}
