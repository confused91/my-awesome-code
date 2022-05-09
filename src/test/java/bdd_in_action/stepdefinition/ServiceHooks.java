package bdd_in_action.stepdefinition;

import bdd_in_action.base.BaseTest;
import com.fasterxml.jackson.databind.ser.Serializers;
import io.cucumber.core.gherkin.Step;
import io.cucumber.java.*;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static bdd_in_action.base.BaseTest.driver;

public class ServiceHooks {
    BaseTest baseTest;
    Logger logger;

    @Before
    public void initializeBrowser() {
        baseTest = new BaseTest();
        baseTest.openBrowser("chrome");
    }

    @AfterStep
    public void captureScreenshot() throws IOException {
        File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFileToDirectory(screenshot,new File(System.getProperty("user.dir")+"src/main/resources/screenshots"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
