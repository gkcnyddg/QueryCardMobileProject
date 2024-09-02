package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class PaymentPage {

    public PaymentPage(){
        //PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()),this);
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);


    }
    Actions actions=new Actions(Driver.getDriver());
    @AndroidFindBy(accessibility = "Profile")
    public WebElement profileLink;
    @AndroidFindBy(accessibility = "Sign In")
    public WebElement signInButton;
    @AndroidFindBy(accessibility = "*Use Email Instead")
    public WebElement useMailInsteadLink;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement emailBox;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement passwordBox;
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Sign In\"])[2]")
    public WebElement signInButton2;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Flower Print Foil T-shirt\n0 (0  Reviews)\n$65.00\"]")
    public WebElement floralTshirtLink;
    @AndroidFindBy(accessibility = "M")
    public WebElement mediumSizeLink;
    @AndroidFindBy(accessibility = "Add To Cart")
    public WebElement addToCartButton;
    @AndroidFindBy(accessibility = "Success\nProduct added to cart")
    public WebElement addToCartSuccessText;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[13]")
    public WebElement cartIcon;
    @AndroidFindBy(accessibility = "Proceed to Checkout")
    public WebElement proceedToCheckoutButton;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"gokcen yedidag\n+12016505551212\ngokcen.user@querycart.com\nBatikent,AnkaraProvince,Turkey,06540\nabc mah\"]")
    public WebElement addressBox;
    @AndroidFindBy(accessibility = "Save & Pay")
    public WebElement saveAndPayButton;
    @AndroidFindBy(accessibility = "Payment Information")
    public WebElement paymentInfoText;
    @AndroidFindBy(accessibility = "Select Payment Method")
    public WebElement paymentSelectionMenu;
    @AndroidFindBy(accessibility = "Stripe")
    public WebElement stripeButton;
    @AndroidFindBy(accessibility = "Cash On Delivery")
    public WebElement cashOnDeliveryButton;
    @AndroidFindBy(accessibility = "Credit")
    public WebElement creditButton;
    @AndroidFindBy(accessibility = "Confirm Order")
    public WebElement confirmOrderButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Back to Payment\"]")
    public WebElement backToPaymentLink;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement cardNo;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement dateCart;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public WebElement cvcCart;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public WebElement zipCart;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"confirmBtn\"]")
    public WebElement confirmButton;
    @AndroidFindBy(accessibility = "Go to shopping")
    public WebElement gotoShoppingButton;
    @AndroidFindBy(accessibility = "Go to order details")
    public WebElement gotoOrderDetailsButton;
    @AndroidFindBy(accessibility = "Success\nYour payment has been confirmed")
    public WebElement paymentConfirmedText;
    @AndroidFindBy(accessibility = "Logout")
    public WebElement logoutButton;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Thank you for your order!\n" +
            "Your order is confirmed.\"]")
    public WebElement thankYouLink;

    @AndroidFindBy(xpath = "//android.view.View[@resource-id=\"card-errors\"]")
    public WebElement cardErrorText;
    @AndroidFindBy(accessibility = "Order History")
    public WebElement orderHistoryText;

    @AndroidFindBy(xpath = "(//*[@class='android.widget.ImageView'])[2]")
    public WebElement invoiceFirstItem;
    @AndroidFindBy(accessibility = "Your Order status is as follows")
    public WebElement orderStatusText;

    /*
    Your card number is incomplete.
    Your card's expiration year is in the past.
    Your card's security code is incomplete.
    Your postal code is incomplete.
     */
    @AndroidFindBy(accessibility = "Home")public WebElement homePageSymbol;







    public  void login (){

        profileLink.click();
        signInButton.click();
        useMailInsteadLink.click();
        emailTextBoxClickAndSendKeys(ConfigReader.getProperty("email"));
        passwordBoxClickandSendKeys(ConfigReader.getProperty("password2"));
        ReusableMethods.wait(1);
        signInButton2.click();
    }
    public void emailTextBoxClickAndSendKeys(String email){

        emailBox.click();
        assertTrue(emailBox.isDisplayed());
        emailBox.sendKeys(email);
    }
    public void passwordBoxClickandSendKeys(String password){

        passwordBox.click();
        assertTrue(passwordBox.isDisplayed());
        passwordBox.sendKeys(password);
    }
    public void addTocart(){
        floralTshirtLink.click();
        mediumSizeLink.click();
        ReusableMethods.ekranKaydirmaMethodu(815,1524,5,815,1203);
        addToCartButton.click();
        Assert.assertTrue(addToCartSuccessText.isDisplayed());
        ReusableMethods.wait(2);
        cartIcon.click();
        proceedToCheckoutButton.click();
        addressBox.click();
        ReusableMethods.ekranKaydirmaMethodu(889,1763,5,889,1375);
        saveAndPayButton.click();



    }


    public void stripePaymentPerform(){

        cardNo.click();
        cardNo.sendKeys(ConfigReader.getProperty("cardNo"));
        dateCart.click();
        dateCart.sendKeys(ConfigReader.getProperty("expiryDate"));
        cvcCart.click();
        cvcCart.sendKeys(ConfigReader.getProperty("CVC"));
        zipCart.click();
        zipCart.sendKeys(ConfigReader.getProperty("zip"));
        confirmButton.click();


    }
    public void stripePaymentPerformNegative(String cartNo, String expiryDate, String cvv, String zip) {


        cardNo.click();
        cardNo.sendKeys(cartNo);
        dateCart.click();
        dateCart.sendKeys(expiryDate);
        cvcCart.click();
        cvcCart.sendKeys(cvv);
        zipCart.click();
        zipCart.sendKeys(zip);
        confirmButton.click();

    }









}
