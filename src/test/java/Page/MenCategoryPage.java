package Page;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class MenCategoryPage {

    public MenCategoryPage() {

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }


    @FindBy(xpath = "(//*[@class='android.view.View'])[10]")
    public WebElement useEmailText;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement emailTextBox;

    @AndroidFindBy(xpath = "(//*[@class='android.view.View'])[10]")
    public List<WebElement> categoriesList;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Categories\")")
    public WebElement categoriesText;


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Men\")")
    public WebElement menCategoriesText;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(3)")
    public WebElement begeniButonu;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public WebElement filtreIcon;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    public WebElement geriTusu; //< butonu


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Adidas 3-Stripes Cushioned Crew Socks\n" +
            "                                         0 (0  Reviews)\n" +
            "    $15.00\")\n")
    public WebElement adidasText;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Wishlist\")")
    public WebElement whisListButonu;



















    public static void VerifyElementTextXpath(String description) {
        //AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        AndroidDriver driver = (AndroidDriver) Driver.getDriver();
        String xpathExpression = "//android.view.View[@content-desc='" + description + "']";
        WebElement webElement = driver.findElement(MobileBy.xpath(xpathExpression));
        assertTrue(webElement.isDisplayed());
    }
    public static void ClickElementandVerify(String description) {
        //AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        AndroidDriver driver = (AndroidDriver) Driver.getDriver();
        String xpathExpression = "//android.view.View[@content-desc='" + description + "']";
        WebElement webElement = driver.findElement(MobileBy.xpath(xpathExpression));
        webElement.click();
        String headerXpathExpression="//android.view.View[@content-desc='" + description + "']";
        WebElement webElementHeader=driver.findElement(MobileBy.xpath(headerXpathExpression));
        Assert.assertTrue(webElementHeader.isDisplayed());
    }


}



