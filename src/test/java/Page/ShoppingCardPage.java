package Page;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import javax.sound.midi.InvalidMidiDataException;

public class ShoppingCardPage {
	public ShoppingCardPage() {
		PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
	}

	//HomePage
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(18)")
	public WebElement cardIcon; //Anasayfa card ikonu

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(9)")
	public WebElement increaseQuantityButton; // + butonu

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(8)")
	public WebElement decreaseQuantityButton; // - butonu

	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add To Cart\")")
	public WebElement addToChartButton;

	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Flower Print Foil T-shirt\n0 (0  Reviews)\n$65.00\")")
	public WebElement firstProduct;

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(10)")
	public WebElement cardIconOnProductPage;

	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Success\nProduct added to cart\")")
	public WebElement toasterMessageTextOnSucces;

	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Flower Print Foil T-shirt\\nS\\n$65.00\\n1\")")
	public WebElement firstProductOnCard;

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
	public WebElement productBackButton;

	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Remove\")")
	public WebElement removeProductOnTheCardButton;

	@AndroidFindBy(xpath = "(//*[@index='3'])[1]")
	public WebElement subTotalText;

	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Proceed to Checkout\")")
	public WebElement proceedToCheckoutButton;

	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Go to Shopping\")")
	public WebElement goToShoppingButton;


	public void addToCard(String size, int quantity) {
		Driver.getDriver().findElement(AppiumBy.accessibilityId(size)).click();

		for (int i = 0; i < quantity; i++) {
			increaseQuantityButton.click();
		}

		try {
			OptionsMet.swipe(527, 1824, 581, 960);
			ReusableMethods.wait(1);
		} catch (InvalidMidiDataException e) {
			throw new RuntimeException(e);
		}
		addToChartButton.click();
		ReusableMethods.wait(4);
		productBackButton.click();
	}
}
