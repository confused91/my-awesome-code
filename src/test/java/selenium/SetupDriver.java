package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SetupDriver {
    protected WebDriver driver;
    protected WebDriverWait wait;
    @BeforeClass(groups = "chrome")
    public void setupChrome()
    {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        wait= new WebDriverWait(driver,30);
    }
    @BeforeClass(groups = "firefox", enabled = false)
    public void setupFirefox()
    {
        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/src/main/resources/drivers/geckodriver.exe");
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
        wait= new WebDriverWait(driver,30);
    }
    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

}
