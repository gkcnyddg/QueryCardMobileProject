package stepdefinitions;

import Page.AddProductToCart;
import Page.QueryCardPage;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

public class US03_AddProductToCart {
    Actions actions = new Actions(Driver.getDriver());
    QueryCardPage Qcard = new QueryCardPage();
    AddProductToCart addProductToCart = new AddProductToCart();

    @Given("Open the application.")
    public void openTheApplication() {

        Driver.getDriver();

    }

    @Then("Verify that the product listing section is visible on the homepage.")
    public void verify_that_the_product_listing_section_is_visible_on_the_homepage() {
       addProductToCart = new AddProductToCart();
       addProductToCart.homeButon.click();
       ReusableMethods.wait(2);
       Assert.assertTrue(addProductToCart.urunListesi.isDisplayed());
    }

    @Then("Click on a product to navigate to the product detail page.")
    public void click_on_a_product_to_navigate_to_the_product_detail_page() {
        addProductToCart = new AddProductToCart();
        addProductToCart.secilenUrun.click();
    }

    @Then("Verify that the product details \\(name, price, description, image) are displayed correctly.")
    public void verify_that_the_product_details_name_price_description_image_are_displayed_correctly() throws InvalidMidiDataException {
        addProductToCart = new AddProductToCart();
        Assert.assertTrue(addProductToCart.urunBedeni.isDisplayed());
        Assert.assertTrue(addProductToCart.aded.isDisplayed());
        Assert.assertTrue(addProductToCart.addToCart.isDisplayed());
    }

    @Then("The user adds the product to the cart")
    public void theUserAddsTheProductToTheCart() throws InvalidMidiDataException {
        addProductToCart = new AddProductToCart();
        addProductToCart.urunBedeni.click();
        addProductToCart.aded.click();
        for (int i = 0; i < 3 ; i++) {
            ReusableMethods.wait(2);
            OptionsMet.swipe(442,590,545,615);
        }
        addProductToCart.addToCart.click();
    }

    @And("The product is successfully added to the cart")
    public void theProductIsSuccessfullyAddedToTheCart() {
        addProductToCart = new AddProductToCart();
        addProductToCart.sepet.click();
        Assert.assertTrue(addProductToCart.sepetGoruntuleme.isDisplayed());
    }
}
