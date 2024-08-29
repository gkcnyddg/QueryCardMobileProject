package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.AppiumServerManager;
import utilities.Driver;

import java.io.File;
import java.io.IOException;

public class Hooks {
    @After
    public void teardown(Scenario scenario) throws IOException {
        TakesScreenshot ts = ((TakesScreenshot) Driver.getDriver() );
        if (scenario.isFailed()) {

            File source = ts.getScreenshotAs(OutputType.FILE);
            String target = System.getProperty("user.dir") + "/test-output/screenshots/" + scenario.getId().substring(0, 4) + ".png";
            File finalDestination = new File(target);
            FileUtils.copyFile(source, finalDestination);
        }
        Driver.quitDriver();
    }
}
