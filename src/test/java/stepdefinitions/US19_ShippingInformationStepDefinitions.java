package stepdefinitions;

import Page.ShippingInformationPage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;
import utilities.ReusableMethods;

public class US19_ShippingInformationStepDefinitions {


    ShippingInformationPage ShipInfPage = new ShippingInformationPage();
    Actions actions = new Actions(Driver.getDriver());



    // >>> TC 1

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





    // >>> TC 2

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




    // >>> TC 3
    @Given("Kullanıcı Edit Butonuna Tıklar ve Address Sayfasına ulaşır.")
    public void kullanıcı_edit_butonuna_tıklar_ve_address_sayfasına_ulaşır() {
        ShipInfPage.ShipInfEditMEA.click();
        ShipInfPage.ShipInfEditAdresBaslikMEA.isDisplayed();
    }

    @Given("Kullanıcı Adres Kartının üzerindeki yeşil yuvarlak butona tıklar.")
    public void kullanıcı_adres_kartının_üzerindeki_yeşil_yuvarlak_butona_tıklar() {
        ShipInfPage.ShipInfEditYesilYuvarlakMEA.click();
    }

    @Given("Kullanıcı Güncellemek istediği bilgileri değiştirir ve Update Address Butonuna Tıklar.")
    public void kullanıcı_güncellemek_istediği_bilgileri_değiştirir_ve_update_address_butonuna_tıklar() {
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
    }




    // >>> TC 4

    @Given("Kullanıcı Adres Kartının üzerindeki kırmızı yuvarlak butona tıklar.")
    public void kullanıcı_adres_kartının_üzerindeki_kırmızı_yuvarlak_butona_tıklar() {
        ShipInfPage.ShipInfEditKirmiziYuvarlakMEA.click();
    }
    @Given("Kullanıcı Are you sure you want to delete? yazısını görüntüler ve delete butonuna tıklar.")
    public void kullanıcı_are_you_sure_you_want_to_delete_yazısını_görüntüler_ve_delete_butonuna_tıklar() {
        ShipInfPage.ShipInfEditDeleteSureYaziMEA.isDisplayed();
        ShipInfPage.ShipInfEditKirmiziYuvarlakDeleteButtonMEA.click();
    }



    // >>> TC 5

    @Given("Kullanıcı Order Summary’i ve altındaki Subtotal, Tax, Shipping Charge, Discount, Total’i görüntüler.")
    public void kullanıcı_order_summary_i_ve_altındaki_subtotal_tax_shipping_charge_discount_total_i_görüntüler() {
        ReusableMethods.ekranKaydirmaMethodu(484,1521,1,474,514);
        ShipInfPage.ShipInfOrderSummaryMEA.isDisplayed();
        ShipInfPage.ShipInfSubtotalMEA.isDisplayed();
        ShipInfPage.ShipInfTaxMEA.isDisplayed();
        ShipInfPage.ShipInfShippingChargeMEA.isDisplayed();
        ShipInfPage.ShipInfDiscountMEA.isDisplayed();
        ShipInfPage.ShipInfTotalMEA.isDisplayed();
    }


    // >>> TC 6
    @Given("Kullanıcı Shipping Address’ini seçer.")
    public void kullanıcı_shipping_address_ini_seçer() {
        ShipInfPage.ShipInfIlkAdresKartiMEA.click();
        ReusableMethods.ekranKaydirmaMethodu(484,1521,1,474,514);
    }
    @Given("Kullanıcı Save & Pay Butonunu Görüntüler ve Tıklar.")
    public void kullanıcı_save_pay_butonunu_görüntüler_ve_tıklar() {
        ShipInfPage.ShipInfSaveAndPayMEA.isDisplayed();
        ShipInfPage.ShipInfSaveAndPayMEA.click();
    }
}
