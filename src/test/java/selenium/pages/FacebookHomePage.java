package selenium.pages;

import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class FacebookHomePage {
    WebDriver driver;
    WebDriverWait wait;

    public FacebookHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 20);
        if (!driver.getPageSource().contains("Welcome")) {
            throw new IllegalStateException("we've not logged in to home page!");
        }
    }

    @FindBy(how = How.CSS, using = "a[href*='profile'] span>span")
    WebElement profileName;

    public String fetchProfileName() {
        return profileName.getText();
    }
}
