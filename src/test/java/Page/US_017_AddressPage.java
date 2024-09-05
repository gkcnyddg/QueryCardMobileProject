package Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v116.autofill.model.Address;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class US_017_AddressPage {
    public US_017_AddressPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }


    @AndroidFindBy (accessibility ="Profile" )
    public WebElement profileButton;

    @AndroidFindBy (accessibility = "*Use Email Instead")
    public static WebElement useEmailInsteadText;

    @AndroidFindBy(accessibility = "Address")
    public static WebElement addressMenuItem;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add New Address\")")
    public static WebElement addNewAddressButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Mehmet\n" +
            "+12016505551212\n" +
            "mehmet.user@querycart.com\n" +
            "Üsküdar,  Istanbul Province,  Turkey,  34000\n" +
            "Kopru\")")
    public static WebElement registeredAddresses;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    public static WebElement editAddressButton;

    @AndroidFindBy (uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public static WebElement fullNameKutusu;

    @AndroidFindBy (uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    public static WebElement yaziKutusu;
    @AndroidFindBy (uiAutomator = "new UiSelector().description(\"Country\")")
    public static WebElement countryKutusu;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"United States\")")
    public static WebElement unitedStatesYazisi;

    @AndroidFindBy (uiAutomator = "new UiSelector().description(\"State\")")
    public static WebElement stateKutusu;

    @AndroidFindBy (uiAutomator = "new UiSelector().description(\"New York\")")
    public static WebElement newYorkYazisi;

    @AndroidFindBy (uiAutomator = "new UiSelector().description(\"City\")")
    public static WebElement cityKutusu;

    @AndroidFindBy (uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(4)")
    public static WebElement streetAddressKutusu;

    @AndroidFindBy (uiAutomator = "new UiSelector().description(\"Manhattan\")")
    public static WebElement manhattanYazisi;

    @AndroidFindBy (uiAutomator = "new UiSelector().description(\"Add Address\")")
    public static WebElement addAddressButonu;

    @AndroidFindBy (uiAutomator = "new UiSelector().description(\"Update Address\").instance(1)")
    public static WebElement updateAddressButonu;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Success\n" +
            "Address Updated Successfully!\"]")
    public static WebElement addressUpdatedSuccessfullyText;

    @AndroidFindBy (uiAutomator = "new UiSelector().description(\"Success\n" +
            "Address Added Successfully!\")")
    public static WebElement addressAddedSuccessfullyYazisi;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public static WebElement deleteAddressButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Delete\")")
    public static WebElement deleteAddressConfirmationButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Success\n" +
            "Address Deleted Successfully!\")")
    public static WebElement addressDeletedSuccessfullyYazisi;

}



