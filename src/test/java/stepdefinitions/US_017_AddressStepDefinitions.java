package stepdefinitions;
import Page.QueryCardPage;
import Page.US_017_AddressPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;
import utilities.OptionsMet;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import Page.QueryCardPage;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import static utilities.OptionsMet.*;

public class US_017_AddressStepDefinitions {
    US_017_AddressPage addressPage = new US_017_AddressPage();
    QueryCardPage card = new QueryCardPage();
    Actions actions = new Actions(Driver.getDriver());

    WebDriver driver;  // Assuming WebDriver instance is properly initialized elsewhere

    @Given("User makes driver adjustmentss")
    public void user_makes_driver_adjustmentss() {
        Driver.getDriver();
    }

    @Given("User clicks the button with descriptionnn {string}")
    public void user_clicks_the_button_with_descriptionnn(String description) {
        ReusableMethods.wait(3);
        clickButtonByDescription(description);
    }
    @Given("User clicks the buttonn {string}")
    public void user_clicks_the_button(String elementName) {
        card.signInLoginClick();
        ReusableMethods.wait(1);
        hideKeyboard();
        ReusableMethods.wait(1);

    }
    @Given("User clicks the button {string} and sendKeyss {string}")
    public void user_clicks_the_button_and_send_keys(String elementName, String text) {
        addressPage.useEmailInsteadText.click();
        card.phoneTextBoxClickAndSendKeys(text);
        // Telefon numarası alanından sonra Tab ile şifre alanına geç
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Query.2006").perform();
        ReusableMethods.wait(1);
        // Şifre alanından sonra Tab ile "remember me" checkbox'ına geç
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.SPACE).perform();
        actions.sendKeys(Keys.ENTER).perform();

    }
    @Given("User clicks the button with descriptionn {string}")
    public void user_clicks_the_button_with_descriptionn(String description) {
        ReusableMethods.wait(3);
        clickButtonByDescription(description);
    }

    @Given("The user is logged in")
    public void theUserIsLoggedIn() {
    }

    @Then("The Address menu item should be visible")
    public void the_address_menu_item_should_be_visible() {
        Assert.assertTrue(addressPage.addressMenuItem.isDisplayed());
    }

    @Then("The Address menu item should be active")
    public void the_address_menu_item_should_be_active() {
        Assert.assertTrue(addressPage.addressMenuItem.isEnabled());
    }

    @When("The user navigates to the Address page")
    public void the_user_navigates_to_the_address_page() {
        OptionsMet.clickAndVerify(addressPage.addressMenuItem);
    }

    @Then("The {string} button should be visible")
    public void theButtonShouldBeVisible(String buttonName) {
        Assert.assertTrue(addressPage.addNewAddressButton.isDisplayed());
    }

    @And("The {string} button should be active")
    public void theButtonShouldBeActive(String buttonName) {
        Assert.assertTrue(addressPage.addNewAddressButton.isDisplayed());
        OptionsMet.clickAndVerify(addressPage.addNewAddressButton);
    }

    @Then("The registered addresses should be displayed")
    public void the_registered_addresses_should_be_displayed() {
        Assert.assertTrue(addressPage.registeredAddresses.isDisplayed());

    }

    @When("The user selects an address to edit")
    public void the_user_selects_an_address_to_edit() {
        //OptionsMet.clickAndVerify(addressPage.editAddressButton);
        ReusableMethods.wait(2);
        addressPage.editAddressButton.click();
        ReusableMethods.wait(2);
    }

    @When("The user updates the address information")
    public void the_user_updates_the_address_information() {
        // Adres bilgilerini güncelleme kodları
        addressPage.streetAddressKutusu.click();
        ReusableMethods.wait(2);
        addressPage.streetAddressKutusu.sendKeys("Bebek");

        ReusableMethods.wait(2);
        hideKeyboard();
        addressPage.updateAddressButonu.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(addressPage.addressUpdatedSuccessfullyText.isDisplayed());
    }

    @Then("The updated address should be saved successfully")
    public void the_updated_address_should_be_saved_successfully() {
        // Güncellenmiş adresin başarılı şekilde kaydedildiğini doğrulama
    }

    @When("The user selects an address to delete")
    public void the_user_selects_an_address_to_delete() {
        //OptionsMet.clickAndVerify(addressPage.deleteAddressButton);
        ReusableMethods.wait(1);
        addressPage.deleteAddressButton.click();
        ReusableMethods.wait(1);
        touchDown(771,1369);
        ReusableMethods.wait(1);

    }

    @When("The user confirms the deletion")
    public void the_user_confirms_the_deletion() {
        // Silme işlemini onaylama kodları
        Assert.assertTrue(addressPage.addressDeletedSuccessfullyYazisi.isDisplayed());
    }

    @Then("The address should be deleted successfully")
    public void the_address_should_be_deleted_successfully() {
        // Adresin başarıyla silindiğini doğrulama
    }

    @When("The user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String buttonName) {
        OptionsMet.clickAndVerify(addressPage.addNewAddressButton);
        addressPage.addNewAddressButton.click();
        ReusableMethods.wait(3);
        addressPage.fullNameKutusu.click();
        ReusableMethods.wait(3);
        addressPage.fullNameKutusu.sendKeys("Alex");
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("alex@alex.com");
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.wait(1);
        actions.sendKeys("1234567890").perform();
        ReusableMethods.wait(1);
        addressPage.countryKutusu.click();
        ReusableMethods.wait(1);
        addressPage.yaziKutusu.click();
        ReusableMethods.wait(1);
        actions.sendKeys("United States").perform();
        ReusableMethods.wait(1);
        addressPage.unitedStatesYazisi.click();
        ReusableMethods.wait(1);
        addressPage.stateKutusu.click();
        ReusableMethods.wait(1);
        actions.sendKeys("New York").perform();
        ReusableMethods.wait(1);
        addressPage.newYorkYazisi.click();
        ReusableMethods.wait(1);
        addressPage.cityKutusu.click();
        ReusableMethods.wait(1);
        actions.sendKeys("Manhattan").perform();
        ReusableMethods.wait(1);
        addressPage.manhattanYazisi.click();
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.wait(1);
        actions.sendKeys("12345").perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.wait(1);
        actions.sendKeys("Time Square").perform();
        ReusableMethods.wait(1);
        addressPage.addAddressButonu.click();
        Assert.assertTrue(addressPage.addressAddedSuccessfullyYazisi.isDisplayed());

    }

    @When("The user enters the new address details")
    public void the_user_enters_the_new_address_details() {
        // Yeni adres detaylarını girme kodları

    }

    @When("The user saves the new address")
    public void the_user_saves_the_new_address() {
        // Yeni adresi kaydetme kodları
    }

    @Then("The new address should be added successfully")
    public void the_new_address_should_be_added_successfully() {
        // Yeni adresin başarıyla eklendiğini doğrulama
    }
}

