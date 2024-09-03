package stepdefinitions;

import Page.QueryCardPage;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.devtools.v85.page.Page;
import utilities.ReusableMethods;


public class US09 {

    QueryCardPage Qcard = new QueryCardPage();





    @Given("Kullanici navibarda category ikonunu görüntüler")
    public void kullanici_navibarda_category_ikonunu_görüntüler() {

        Qcard.categoryikon.isDisplayed();

    }
    @Given("Kullanici category ikonu altında Men, Women, junior basliklarini görüntüler ve aktif olduklarini kontrol eder")
    public void kullanici_category_ikonu_altında_basliklarini_görüntüler_ve_aktif_olduklarini_kontrol_eder() {
        Qcard.categoryikon.click();
        Qcard.categoryMen.isDisplayed();
        Qcard.categoryMen.isEnabled();
        Qcard.categorWomen.isDisplayed();
        Qcard.categorWomen.isEnabled();
        Qcard.categoryJuniors.isDisplayed();
        Qcard.categoryJuniors.isEnabled();



    }
}
