package stepdefinitions;

import Page.PaymentPage;
import Page.ShoppingCardPage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

public class US024_PaymentStepDefinitions {
     PaymentPage paymentPage=new PaymentPage();
    ShoppingCardPage shoppingCardPage = new ShoppingCardPage();


    @Given("Log in as a registered user.")
    public void log_in_as_a_registered_user() {
        paymentPage.login();
    }
    @Given("Navigate to the Payment Information page.")
    public void navigate_to_the_payment_ınformation_page() {
        ReusableMethods.wait(5);
    paymentPage.addTocart();
        Assert.assertTrue(paymentPage.paymentInfoText.isDisplayed());
        ReusableMethods.wait(5);
    }
    @Given("Verify the Select Payment Method menu item is visible.")
    public void locate_the_menu_item() {
        ReusableMethods.wait(3);
        Assert.assertTrue(paymentPage.paymentSelectionMenu.isDisplayed());

    }
    @Given("On the Payment Information page,confirm that payment types are available.")
    public void on_the_payment_ınformation_page_confirm_that_payment_types_are_available() {
    Assert.assertTrue(paymentPage.confirmOrderButton.isDisplayed());
    Assert.assertTrue(paymentPage.stripeButton.isDisplayed());
    Assert.assertTrue(paymentPage.stripeButton.isEnabled());
    Assert.assertTrue(paymentPage.cashOnDeliveryButton.isDisplayed());
    Assert.assertTrue(paymentPage.cashOnDeliveryButton.isEnabled());
    Assert.assertTrue(paymentPage.creditButton.isDisplayed());
    Assert.assertTrue(paymentPage.creditButton.isEnabled());
    }
    @Given("Select Stripe as the payment method.")
    public void select_as_the_payment_method() throws InterruptedException {

        paymentPage.stripeButton.click();
        ReusableMethods.koordinatTiklamaMethodu(600,1920);
        //paymentPage.confirmOrderButton.click();



    }
    @Given("Verify that the card information form is displayed.")
    public void verify_that_the_card_information_form_is_displayed() {
        ReusableMethods.wait(3);
    Assert.assertTrue(paymentPage.backToPaymentLink.isDisplayed());
    Assert.assertTrue(paymentPage.confirmButton.isDisplayed());
    }
    @Given("Fill in the card information form with valid details.")
    public void fill_in_the_card_information_form_with_valid_details() {
        ReusableMethods.wait(3);
    paymentPage.stripePaymentPerform();
        ReusableMethods.wait(3);
    }
    @Given("The payment should be processed successfully, and a confirmation message should be displayed.")
    public void the_payment_should_be_processed_successfully_and_a_confirmation_message_should_be_displayed() {
    ReusableMethods.wait(5);
    Assert.assertTrue(paymentPage.gotoOrderDetailsButton.isDisplayed());
    }
    @Given("Fill in the card information form {string},{string},{string},{string}with invalid details.")
    public void fill_in_the_card_information_form_with_invalid_details(String cardNo, String expiryDate, String cvv, String zip) {
        ReusableMethods.wait(2);
        paymentPage.stripePaymentPerformNegative(cardNo,expiryDate,cvv,zip);
    ReusableMethods.wait(5);
    Assert.assertTrue(paymentPage.cardErrorText.isDisplayed());

    }
    @Given("After completing the payment, verify if there's an option to resume shopping.")
    public void after_completing_the_payment_verify_if_there_s_an_option_to_resume_shopping() {
        ReusableMethods.wait(3);
        Assert.assertTrue(paymentPage.gotoShoppingButton.isDisplayed());
        Assert.assertTrue(paymentPage.gotoShoppingButton.isEnabled());
    }
    @Given("Click on the option to resume shopping.")
    public void click_on_the_option_to_resume_shopping() {
        ReusableMethods.wait(3);
        paymentPage.gotoShoppingButton.click();
        Assert.assertTrue(paymentPage.homePageSymbol.isDisplayed());
        Assert.assertTrue(paymentPage.floralTshirtLink.isDisplayed());
    }
    @Given("After order completion, navigate to the order summary or invoice section.")
    public void after_order_completion_navigate_to_the_order_summary_or_invoice_section() {
        ReusableMethods.wait(3);
        paymentPage.gotoOrderDetailsButton.click();
        Assert.assertTrue(paymentPage.orderHistoryText.isDisplayed());
    }
    @Given("Verify that order details and invoice are viewable.")
    public void verify_that_order_details_and_invoice_are_viewable() {
        ReusableMethods.wait(3);
        Assert.assertTrue(paymentPage.invoiceFirstItem.isDisplayed());
        paymentPage.invoiceFirstItem.click();
        Assert.assertTrue(paymentPage.orderStatusText.isDisplayed());

    }
    @Given("Select Cash on Delivery as the payment method.")
    public void select_cash_on_delivery_as_the_payment_method() {
        paymentPage.cashOnDeliveryButton.click();
        paymentPage.confirmOrderButton.click();
    }
    @Given("User clicks on go to shopping page")
    public void user_clicks_on_go_to_shopping_page() {
        ReusableMethods.wait(3);
       shoppingCardPage.goToShoppingButton.click();
    }
    @Given("User waits for {int} sec")
    public void user_waits_for_sec(Integer time) {
        ReusableMethods.wait(time);
    }
    @Given("The user navigates to the homepage")
    public void the_user_navigates_to_the_homepage() {

    paymentPage.homePageSymbol.click();
    ReusableMethods.wait(5);
    }
    @Given("User navigates to the back")
    public void user_navigates_to_the_back() {
       Driver.getDriver().navigate().back();
    }
    @Given("User clicks the Logout button")
    public void user_clicks_the_logout_button() {
        paymentPage.logoutButton.click();
    }
    @Given("Verifies sign in is visible and logout performed succesfully")
    public void verifies_sign_in_is_visible_and_logout_performed_succesfully() {
        Assert.assertTrue(paymentPage.signInButton.isDisplayed());
    }
    @Given("User registers to the app")
    public void user_registers_to_the_app() {
    paymentPage.registerAndLogin();


    }
    @Given("Navigate to the Payment Information pagee.")
    public void navigate_to_the_payment_ınformation_pagee() {
        ReusableMethods.wait(5);
        paymentPage.floralTshirtLink.click();
        ReusableMethods.wait(2);
        paymentPage.mediumSizeLink.click();
        ReusableMethods.ekranKaydirmaMethodu(815,1524,5,815,1203);
        paymentPage.addToCartButton.click();
        Assert.assertTrue(paymentPage.addToCartSuccessText.isDisplayed());
        ReusableMethods.wait(2);
        paymentPage.cartIcon.click();
        ReusableMethods.wait(2);
        paymentPage.proceedToCheckoutButton.click();
        ReusableMethods.wait(2);


        paymentPage.address2Box.click();
        ReusableMethods.wait(2);
        ReusableMethods.ekranKaydirmaMethodu(889,1763,5,889,1375);
        ReusableMethods.wait(2);
        paymentPage. saveAndPayButton.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(paymentPage.paymentInfoText.isDisplayed());
        ReusableMethods.wait(5);
    }

}




