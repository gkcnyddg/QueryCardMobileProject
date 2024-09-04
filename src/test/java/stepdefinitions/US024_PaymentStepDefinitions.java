package stepdefinitions;

import Page.PaymentPage;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US024_PaymentStepDefinitions {
     PaymentPage paymentPage=new PaymentPage();

    @Given("Log in as a registered user.")
    public void log_in_as_a_registered_user() {
        paymentPage.login();
    }
    @Given("Navigate to the Payment Information page.")
    public void navigate_to_the_payment_ınformation_page() {
    paymentPage.addTocart();
        Assert.assertTrue(paymentPage.paymentInfoText.isDisplayed());
        ReusableMethods.wait(3);
    }
    @Given("Verify the Select Payment Method menu item is visible.")
    public void locate_the_menu_item() {
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
    public void select_as_the_payment_method() {
        paymentPage.stripeButton.click();
        paymentPage.confirmOrderButton.click();

    }
    @Given("Verify that the card information form is displayed.")
    public void verify_that_the_card_information_form_is_displayed() {
    ReusableMethods.wait(2);
    Assert.assertTrue(paymentPage.backToPaymentLink.isDisplayed());
    Assert.assertTrue(paymentPage.confirmButton.isDisplayed());
    }
    @Given("Fill in the card information form with valid details.")
    public void fill_in_the_card_information_form_with_valid_details() {
    paymentPage.stripePaymentPerform();
    }
    @Given("The payment should be processed successfully, and a confirmation message should be displayed.")
    public void the_payment_should_be_processed_successfully_and_a_confirmation_message_should_be_displayed() {
    ReusableMethods.wait(5);
    Assert.assertTrue(paymentPage.gotoOrderDetailsButton.isDisplayed());
    }
    @Given("Fill in the card information form {string},{string},{string},{string}with invalid details.")
    public void fill_in_the_card_information_form_with_invalid_details(String cardNo, String expiryDate, String cvv, String zip) {

    paymentPage.stripePaymentPerformNegative(cardNo,expiryDate,cvv,zip);
    ReusableMethods.wait(5);
    Assert.assertTrue(paymentPage.cardErrorText.isDisplayed());

    }
    @Given("After completing the payment, verify if there's an option to resume shopping.")
    public void after_completing_the_payment_verify_if_there_s_an_option_to_resume_shopping() {
        Assert.assertTrue(paymentPage.gotoShoppingButton.isDisplayed());
        Assert.assertTrue(paymentPage.gotoShoppingButton.isEnabled());
    }
    @Given("Click on the option to resume shopping.")
    public void click_on_the_option_to_resume_shopping() {
        paymentPage.gotoShoppingButton.click();
        Assert.assertTrue(paymentPage.homePageSymbol.isDisplayed());
        Assert.assertTrue(paymentPage.floralTshirtLink.isDisplayed());
    }
    @Given("After order completion, navigate to the order summary or invoice section.")
    public void after_order_completion_navigate_to_the_order_summary_or_invoice_section() {
        paymentPage.gotoOrderDetailsButton.click();
        Assert.assertTrue(paymentPage.orderHistoryText.isDisplayed());
    }
    @Given("Verify that order details and invoice are viewable.")
    public void verify_that_order_details_and_invoice_are_viewable() {

        Assert.assertTrue(paymentPage.invoiceFirstItem.isDisplayed());
        paymentPage.invoiceFirstItem.click();
        Assert.assertTrue(paymentPage.orderStatusText.isDisplayed());

    }
    @Given("Select Cash on Delivery as the payment method.")
    public void select_cash_on_delivery_as_the_payment_method() {
        paymentPage.cashOnDeliveryButton.click();
        paymentPage.confirmOrderButton.click();
    }
    }




