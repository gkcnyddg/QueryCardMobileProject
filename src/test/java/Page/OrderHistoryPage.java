package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v115.input.model.DragData;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class OrderHistoryPage {
	public OrderHistoryPage() {
		PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
	}

	// Locators for sign in
	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Profile\")")
	public WebElement profileIcon; //anasayfadaki sol alttaki profile ikonu

	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sign In\")")
	public WebElement profileSignInButton; //sign in butonu

	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"*Use Email Instead\")")
	public WebElement useEmailText; //sağ üstteki use mail text alanı

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
	public WebElement mailTextBox; //mail text alanı

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
	public WebElement passwordBox; //pasword alanı

	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sign In\").instance(1)")
	public WebElement logInSignInButton; //sign in sayfasındaki sign in butonu

	@AndroidFindBy(accessibility = "Profile")
	public WebElement userProfileIcon; //kayıt olunduktan sonra sağ alttaki profile ikonu

	@AndroidFindBy(accessibility = "Order History")
	public WebElement orderHistoryLink; //dashboard order history linki

	@AndroidFindBy(className = "android.widget.ImageView")
	public List<WebElement> orderLinksList; // order history sayfasındaki geri dönüş tuşu ve orderlerin listesi

	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Download Receipt\")")
	public WebElement downlandReceiptButton; //fatura indir butonu

	@AndroidFindBy(xpath = "//*[@index='4']")
	public WebElement orderIdText; //faturadaki order id

	@AndroidFindBy(xpath = "//*[@index='5']")
	public WebElement orderDateDayText; //faturadaki order tarihi

	@AndroidFindBy(xpath = "//*[@index='6']")
	public WebElement orderDateHourText; //faturadaki order tarihi

	@AndroidFindBy(xpath = "//*[@index='30']")
	public WebElement paymentTypeText; //faturadaki ödeme tipi

	@AndroidFindBy(xpath = "//*[@index='23']")
	public WebElement totalText; //faturadaki toplam tutar

	@AndroidFindBy(xpath = "//*[@index='23']")
	public WebElement cancelOrderButton; //sipariş iptal et butonu

	public void performLogIn(String email, String password) {
		profileIcon.click();
		profileSignInButton.click();
		useEmailText.click();
		mailTextBox.click();
		mailTextBox.sendKeys(email);
		passwordBox.click();
		passwordBox.sendKeys(password);
		logInSignInButton.click();
	}
}
