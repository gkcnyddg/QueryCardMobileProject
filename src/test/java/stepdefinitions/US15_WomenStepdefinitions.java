package stepdefinitions;

import Page.OrderHistoryPage;
import Page.QueryCardPage;
import Page.WomenCatagory;
import io.cucumber.java.en.Given;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;
import utilities.UserReader;

import javax.sound.midi.InvalidMidiDataException;

public class US15_WomenStepdefinitions {

    OrderHistoryPage orderHistoryPage;
    Actions actions = new Actions(Driver.getDriver());
     WomenCatagory womenCatagory;


    @Given("The user goes to the URL pagee.")
    public void the_user_goes_to_the_url_pagee() {
        Driver.getDriver();
    }
    @Given("The user clicks on the profile icon on the sitee.")
    public void the_user_clicks_on_the_profile_icon_on_the_sitee() {

        orderHistoryPage = new OrderHistoryPage();
        orderHistoryPage.profileIcon.click();
    }


    @Given("The user logs in by clicking the SignIn button with the correct {string} and {string}..")
    public void the_user_logs_in_by_clicking_the_sign_ın_button_with_the_correct_and(String mail, String password) {
orderHistoryPage= new OrderHistoryPage();

        orderHistoryPage.performLogIn(UserReader.getUser(mail), UserReader.getUser(password));
    }
    @Given("Clicks on the category link")
    public void clicks_on_the_category_link() {
        womenCatagory = new WomenCatagory();
        womenCatagory.catagorybuton.click();
    }
    @Given("The Women category and its subcategories should be visible in the body section.")
    public void the_women_category_and_its_subcategories_should_be_visible_in_the_body_section() {

        womenCatagory = new WomenCatagory();
        WebElement womenCatagoryButton = womenCatagory.womencatagrybuton;
        Assert.assertTrue(womenCatagoryButton.isDisplayed());
        womenCatagory.womencatagryokişaretibuton.click();
        Assert.assertTrue(womenCatagory.womenCloting.isDisplayed());
        Assert.assertTrue(womenCatagory.womenShoes.isDisplayed());
        Assert.assertTrue(womenCatagory.womenAccessories.isDisplayed());

    }
    @Given("The user is on the Women category pagee")
    public void the_user_is_on_the_women_category_pagee() {
 womenCatagory = new WomenCatagory();
 womenCatagory.womencatagrybuton.click();

    }
    @Given("The user selects a product from the listtt")
    public void the_user_selects_a_product_from_the_listtt() {
womenCatagory= new WomenCatagory();
womenCatagory.dresUrun.isDisplayed();
    }
    @Given("The user adds the product to favorites")
    public void the_user_adds_the_product_to_favorites() {
womenCatagory= new WomenCatagory();
womenCatagory.favoributon.click();
ReusableMethods.wait(3);
        womenCatagory.womensyfgeritursu.click();


    }
    @Given("The user views the product in favoritess")
    public void the_user_views_the_product_in_favoritess() {
womenCatagory= new WomenCatagory();


womenCatagory.favoriListesi.click();
        ReusableMethods.wait(1);
Assert.assertTrue(womenCatagory.favoriSayfasigoruntuleme.isDisplayed());
    }
    @Given("I select a product")
    public void ı_select_a_product() {
        womenCatagory=new WomenCatagory();
        womenCatagory.womencatagrybuton.click();
        ReusableMethods.wait(2);
        womenCatagory.dresUrun.click();
    }
    @Given("I add the product to the cart")
    public void ı_add_the_product_to_the_cart() throws InvalidMidiDataException {
        womenCatagory= new WomenCatagory();

        for (int i = 0; i <3 ; i++) {
            ReusableMethods.wait(2);
            OptionsMet.swipe(450,1020,545,615);
        }
        womenCatagory.bedenbilgisiS.click();
        ReusableMethods.wait(2);
        womenCatagory.addtoCartbuton.click();



    }
    @Given("I view the product details to the cart")
    public void ı_view_the_product_details_to_the_cart() {
        womenCatagory= new WomenCatagory();
        ReusableMethods.wait(3);
        womenCatagory.alisverissepeti.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(womenCatagory.sepetListe.isDisplayed());

    }

    @Given("the filter icons should be active")
    public void the_filter_icons_should_be_active() throws InvalidMidiDataException {
        womenCatagory = new WomenCatagory();
        womenCatagory.filtremeikonu.click();
        womenCatagory.brandsikon.click();
        womenCatagory.nikeozellik.click();
        womenCatagory.sizebuton.click();
        womenCatagory.sizesecilenozellik.click();
        for (int i = 0; i <3 ; i++) {
            ReusableMethods.wait(2);
            OptionsMet.swipe(497,763,400,455);
        }
        womenCatagory.colorbuton.click();
        womenCatagory.colorozellikseme.click();
        for (int i = 0; i <3 ; i++) {
            ReusableMethods.wait(2);
            OptionsMet.swipe(400, 455, 497, 763);
        }
        womenCatagory.sortbyikon.click();
        womenCatagory.priceHighToLow.click();

    }


}
