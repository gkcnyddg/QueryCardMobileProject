package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ShoppingCardPage {
	public ShoppingCardPage() {
		PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
	}

	@AndroidFindBy()
	public WebElement element;

	@AndroidFindBy()
	public WebElement element1;
}
