package stepdefinitions;

import Page.ShippingInformationPage;
import io.cucumber.java.en.Given;

public class US02_SocialMediaIcons {

    ShippingInformationPage ShipInfPage = new ShippingInformationPage();


    @Given("Kullanıcı Home sayfasında Sosyal medya ikonlarını görüntüler.")
    public void kullanıcı_home_sayfasında_sosyal_medya_ikonlarını_görüntüler() {


    }
    @Given("Kullanıcı Facebook ikonuna tıklar doğru sayfaya ulaştığını doğrular ve home sayfasına geri döner.")
    public void kullanıcı_facebook_ikonuna_tıklar_doğru_sayfaya_ulaştığını_doğrular_ve_home_sayfasına_geri_döner() {


    }
    @Given("Kullanıcı Youtube ikonuna tıklar doğru sayfaya ulaştığını doğrular ve home sayfasına geri döner.")
    public void kullanıcı_youtube_ikonuna_tıklar_doğru_sayfaya_ulaştığını_doğrular_ve_home_sayfasına_geri_döner() {


    }
    @Given("Kullanıcı Instagram ikonuna tıklar doğru sayfaya ulaştığını doğrular ve home sayfasına geri döner.")
    public void kullanıcı_ınstagram_ikonuna_tıklar_doğru_sayfaya_ulaştığını_doğrular_ve_home_sayfasına_geri_döner() {


    }


    @Given("Kullanıcı Alt bardan category'e tıklar.")
    public void kullanıcı_alt_bardan_category_e_tıklar() {

        ShipInfPage.AltBarCategoryMEA.click();

    }
    @Given("Kullanıcı Category Sayfasında Sosyal medya ikonlarını görüntüler.")
    public void kullanıcı_category_sayfasında_sosyal_medya_ikonlarını_görüntüler() {


    }



}
