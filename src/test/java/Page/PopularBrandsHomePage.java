package Page;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class PopularBrandsHomePage {
    public PopularBrandsHomePage(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()),this);

    }
    @AndroidFindBy(accessibility = "Popular Brands")
    public WebElement popularBrandsText;

    @AndroidFindBy(xpath = "//*[@class='android.view.View']")
    public List<WebElement> slider ;

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
