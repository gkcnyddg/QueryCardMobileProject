package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProfilIconMyAccount {
    public ProfilIconMyAccount() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);

    }
    @AndroidFindBy(accessibility = "My Account")
    public WebElement MyAccount;

    @AndroidFindBy(accessibility = "Total Orders")
    public WebElement TotalOrders;

    @AndroidFindBy(accessibility = "Total Completed")
    public WebElement TotalCampleted;

    @AndroidFindBy(accessibility = "Total Returnd")
    public WebElement TotalReturnd;

    @AndroidFindBy(accessibility = "Wallet Balance")
    public WebElement WalletBalance;

    @AndroidFindBy(uiAutomator = " new UiSelector().className(android.widget.ImageView).instance(5)")
    public WebElement orderHistory;
    @AndroidFindBy(uiAutomator = " new UiSelector().className(android.view.View).instance(5)")
    public WebElement dasbhboardSyf;

    @AndroidFindBy(uiAutomator = " new UiSelector().className(android.widget.ScrollView).instance(0)")
    public WebElement orderDetails;








}
