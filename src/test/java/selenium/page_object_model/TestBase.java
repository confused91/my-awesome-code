package selenium.page_object_model;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;

public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeSuite
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 20);
        driver.navigate().to("https://www.facebook.com");
    }
   @AfterMethod
    public void takeScreenshot() throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFileToDirectory(screenshot, new File(System.getProperty("user.dir") + "/test-output/screenshots"));
        Reporter.log("<a href='" + screenshot.getAbsolutePath() + "'> <img src= '" + screenshot.getAbsolutePath() + "' height='200' width='200'/></a>");

    }
    @AfterSuite
    public void cleanup() {
        driver.quit();
    }
}
