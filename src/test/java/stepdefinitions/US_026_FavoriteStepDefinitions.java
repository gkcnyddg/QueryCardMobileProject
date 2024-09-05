package stepdefinitions;
import Page.QueryCardPage;
import Page.US_017_AddressPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import Page.US_026_FavoritePage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;
import static utilities.OptionsMet.*;

public class US_026_FavoriteStepDefinitions {
   US_026_FavoritePage favoritePage=new US_026_FavoritePage();
    US_017_AddressPage addressPage = new US_017_AddressPage();
    QueryCardPage card = new QueryCardPage();
    Actions actions = new Actions(Driver.getDriver());

    WebDriver driver;  // Assuming WebDriver instance is properly initialized elsewhere

     @Given("Userr makes driver adjustmentss")
     public void user_makes_driver_adjustmentss() {
         Driver.getDriver();
     }

    //@Given("User clicks the button with descriptionnn {string}")
    //public void user_clicks_the_button_with_descriptionnn(String description) {
    //    ReusableMethods.wait(3);
    //    clickButtonByDescription(description);
    //}
    //@Given("User clicks the buttonn {string}")
    //public void user_clicks_the_button(String elementName) {
    //    card.signInLoginClick();
    //    ReusableMethods.wait(1);
    //    hideKeyboard();
    //    ReusableMethods.wait(2);
//
    //}
    //@Given("User clicks the button {string} and sendKeyss {string}")
    //public void user_clicks_the_button_and_send_keys(String elementName, String text) {
    //    US_017_AddressPage.useEmailInsteadText.click();
    //    card.phoneTextBoxClickAndSendKeys(text);
    //    // Telefon numarası alanından sonra Tab ile şifre alanına geç
    //    actions.sendKeys(Keys.TAB).perform();
    //    actions.sendKeys("Query.2006").perform();
    //    ReusableMethods.wait(1);
    //    // Şifre alanından sonra Tab ile "remember me" checkbox'ına geç
    //    actions.sendKeys(Keys.TAB).perform();
    //    actions.sendKeys(Keys.SPACE).perform();
    //    actions.sendKeys(Keys.ENTER).perform();
//
    //}
    //@Given("User clicks the button with descriptionn {string}")
    //public void user_clicks_the_button_with_descriptionn(String description) {
    //    ReusableMethods.wait(3);
    //    clickButtonByDescription(description);
    //}

    @Given("The user sees the favorite icon on a product")
    public void theUserSeesTheFavoriteIconOnAProduct() {
        // Favorite icon'un görünür ve aktif olduğunu doğrulayan kod
         assert(US_026_FavoritePage.favoriteIcon.isDisplayed());

    }

    @When("The user clicks the favorite icon")
    public void theUserClicksTheFavoriteIcon() {
        // Ürünü favorilere eklemek için ikona tıklama
       // ReusableMethods.wait(3);
        hideKeyboard();
        touchDown(452,1356);
       // ReusableMethods.wait(3);

       // US_026_FavoritePage.favoriteIcon.click();

    }
    @Then("The product should be added to the favorite list")
    public void theProductShouldBeAddedToTheFavoriteList() {
        // Favoriler listesine eklenen ürünü doğrulama
        //US_026_FavoritePage.wishlistIcon.click();
        ReusableMethods.wait(2);
        touchDown(758,2058);
        ReusableMethods.wait(5);
        //Assert.assertTrue(US_026_FavoritePage.wishListText.isDisplayed());
        assert(US_026_FavoritePage.wishListText.isDisplayed());
        //Assert.assertTrue(US_026_FavoritePage.productFoundText.isDisplayed());
       // US_026_FavoritePage.flowerTshirt.isDisplayed();

    }

    @And("The favorite icon should be active")
    public void theFavoriteIconShouldBeActive() {
        // Favori ikonu aktif olduğunu doğrulama
        Assert.assertTrue(favoritePage.favoriteIcon.isDisplayed());


    }


    @Then("The Wishlist icon should be visible and active")
    public void theWishlistIconShouldBeVisibleAndActive() {
        // Wishlist ikonunun aktif olduğunu doğrulama
     // Assert.assertTrue(US_026_FavoritePage.wishlistIcon.isDisplayed());
      //OptionsMet.clickAndVerify(US_026_FavoritePage.wishlistIcon);
        ReusableMethods.wait(3);
        Assert.assertTrue(favoritePage.wishlistIcon.isDisplayed());


     }

    @Given("The user navigates to the Wishlist page")
    public void theUserNavigatesToTheWishlistPage() {
        // Wishlist sayfasına gitme
        US_026_FavoritePage.goToWishlist();

    }

    @Then("The products added to the Wishlist should be displayed")
    public void theProductsAddedToTheWishlistShouldBeDisplayed() {
        // Wishlist'te ürünlerin görüntülenmesini doğrulama
        favoritePage.wishlistIcon.click();
        assertTrue(favoritePage.productFoundText.isDisplayed());
    }

    @When("The user clicks the remove icon on a product")
    public void theUserClicksTheRemoveIconOnAProduct() {
        // Ürünü favorilerden kaldırma

       favoritePage.removeIcon.click();

        //touchDown(452,461);

    }

    @Then("The product should be removed from the Wishlist")
    public void theProductShouldBeRemovedFromTheWishlist() {
        // Ürünün favorilerden kaldırıldığını doğrulama
        Assert.assertTrue(favoritePage.removedFromWishlistText.isDisplayed());
    }

    @And("The product should no longer be displayed on the Wishlist page")
    public void theProductShouldNoLongerBeDisplayedOnTheWishlistPage() {
        // Ürünün artık wishlist'te olmadığını doğrulama
        Assert.assertTrue(favoritePage.wishListEmptyIconu.isDisplayed());
    }
}
