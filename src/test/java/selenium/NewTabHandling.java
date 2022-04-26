package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class NewTabHandling {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharada_Doddi\\Documents\\RD_Batch_Training\\Automation testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void openNewTabWithoutWaits() throws AWTException {
        driver.navigate().to("https://www.google.com");
        String currentHandle = driver.getWindowHandle();
        Robot rob = new Robot();
        rob.keyPress(KeyEvent.VK_CONTROL);
        rob.keyPress(KeyEvent.VK_T);
        rob.keyRelease(KeyEvent.VK_CONTROL);
        rob.keyRelease(KeyEvent.VK_T);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> handles = driver.getWindowHandles();
        System.out.println("The window handles are " + handles);
        for (String handle : handles) {
            if (!handle.equals(currentHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        driver.get("https://www.facebook.com");
        driver.close();
        driver.switchTo().window(currentHandle);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
