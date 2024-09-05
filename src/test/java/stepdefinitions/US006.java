package stepdefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


class US_006 {

    private AppiumDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "Android Emulator");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
    }

    @Test
    public void testForgotPasswordLinkVisibility() {
        MobileElement forgotPasswordLink = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Forgot Password?']"));
        Assert.assertTrue(forgotPasswordLink.isDisplayed(), "Forgot Password link is not visible.");
        Assert.assertTrue(forgotPasswordLink.isEnabled(), "Forgot Password link is not enabled.");
    }

    @Test
    public void testPasswordResetWithValidCredentials() {
        driver.findElement(By.xpath("//android.widget.TextView[@text='Forgot Password?']")).click();
        MobileElement emailField = (MobileElement) driver.findElement(By.id("com.wise.querycart:id/emailField"));
        emailField.sendKeys("valid@example.com");
        MobileElement submitButton = (MobileElement) driver.findElement(By.id("com.wise.querycart:id/submitButton"));
        submitButton.click();
        MobileElement successMessage = (MobileElement) driver.findElement(By.id("com.wise.querycart:id/successMessage"));
        Assert.assertTrue(successMessage.isDisplayed(), "Success message is not displayed.");
    }

    @Test
    public void testOtpButtonVisibility() {
        MobileElement otpButton = (MobileElement) driver.findElement(By.id("com.wise.querycart:id/otpButton"));
        Assert.assertTrue(otpButton.isDisplayed(), "OTP button is not visible.");
        Assert.assertTrue(otpButton.isEnabled(), "OTP button is not enabled.");
    }

    @Test
    public void testBackToSignInLinkVisibility() {
        MobileElement backToSignInLink = (MobileElement) driver.findElement(By.id("com.wise.querycart:id/backToSignInLink"));
        Assert.assertTrue(backToSignInLink.isDisplayed(), "Back to Sign In link is not visible.");
        Assert.assertTrue(backToSignInLink.isEnabled(), "Back to Sign In link is not enabled.");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }





}