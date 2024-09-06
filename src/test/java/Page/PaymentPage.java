package Page;

import com.github.javafaker.Faker;
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
    Faker faker=new Faker();
    public PaymentPage(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);

    }

    @AndroidFindBy(accessibility = "Profile")
    public WebElement profileLink;
    @AndroidFindBy(accessibility = "Sign In")
    public WebElement signInButton;
    @AndroidFindBy(accessibility = "Sign Up")
    public WebElement signUpButton;
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

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Alex\n+12011234567890\nalex@alex.com\nManhattan,New York,UnitedStates,12345\nTime Square\"]")
    public WebElement address1Box;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Alex\n" +
            "+12011234567890\n" +
            "alex@alex.com\n" +
            "Manhattan,NewYork,UnitedStates,12345\n" +
            "Time Square\"]") public WebElement address2Box;

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
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Confirm Order\"]")
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
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement signUpNameBox;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement signUpEmailBox;
    @AndroidFindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public WebElement signUpPasswordBox;
    @AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Sign Up\"])[2]")
    public WebElement signUp2Box;









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
        ReusableMethods.wait(2);
        mediumSizeLink.click();
        ReusableMethods.ekranKaydirmaMethodu(815,1524,5,815,1203);
        addToCartButton.click();
        Assert.assertTrue(addToCartSuccessText.isDisplayed());
        ReusableMethods.wait(2);
        cartIcon.click();
        ReusableMethods.wait(2);
        proceedToCheckoutButton.click();
        ReusableMethods.wait(2);
        addressBox.click();
        ReusableMethods.wait(2);
        ReusableMethods.ekranKaydirmaMethodu(889,1763,5,889,1375);
        ReusableMethods.wait(2);
        saveAndPayButton.click();
        ReusableMethods.wait(2);



    }


        public void stripePaymentPerform(){
        ReusableMethods.wait(5);
        cardNo.click();
        cardNo.sendKeys(ConfigReader.getProperty("cardNo"));
            ReusableMethods.wait(2);
        dateCart.click();
        dateCart.sendKeys(ConfigReader.getProperty("expiryDate"));
            ReusableMethods.wait(2);
        cvcCart.click();
        cvcCart.sendKeys(ConfigReader.getProperty("CVC"));
            ReusableMethods.wait(2);
        zipCart.click();
        zipCart.sendKeys(ConfigReader.getProperty("zip"));
            ReusableMethods.wait(2);
        confirmButton.click();
            ReusableMethods.wait(2);


    }
    public void stripePaymentPerformNegative(String cartNo, String expiryDate, String cvv, String zip) {


        cardNo.click();
        cardNo.sendKeys(cartNo);
        ReusableMethods.wait(1);
        dateCart.click();
        dateCart.sendKeys(expiryDate);
        ReusableMethods.wait(1);
        cvcCart.click();
        cvcCart.sendKeys(cvv);
        ReusableMethods.wait(1);
        zipCart.click();
        zipCart.sendKeys(zip);
        ReusableMethods.wait(1);
        confirmButton.click();

    }
    public  void registerAndLogin () {
        profileLink.click();
        signUpButton.click();
        signUpNameBox.click();
        String nameSurname = faker.name().fullName();
        String email = faker.internet().emailAddress();
        String password = "123456Gk*";

        signUpNameBox.sendKeys(nameSurname);
        useMailInsteadLink.click();
        signUpEmailBox.click();
        signUpEmailBox.sendKeys(email);
        ReusableMethods.wait(2);
        signUpPasswordBox.click();
        signUpPasswordBox.sendKeys(password);
        ReusableMethods.wait(2);
        signUp2Box.click();
        ReusableMethods.wait(2);
        emailBox.click();
        emailBox.sendKeys(email);
        passwordBox.click();
        passwordBox.sendKeys(password);
        ReusableMethods.wait(1);
        signInButton2.click();


    }


}
