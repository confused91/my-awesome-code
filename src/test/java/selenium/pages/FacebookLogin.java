package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class FacebookLogin {

    WebDriver driver;

    public FacebookLogin(WebDriver driver) {
        this.driver = driver;
        if (!driver.getTitle().contains("login")) {
            throw new IllegalStateException("this is not login page!");
        }
    }

    private By txtEmail = By.id("email");
    private By txtPassword = By.name("pass");
    private By loginBtn = By.name("login");

    public void typeEmail(String email) {
        driver.findElement(txtEmail).sendKeys(email);
    }

    public void typePassword(String password) {
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public void validLogin(String email, String password) {
        typeEmail(email);
        typePassword(password);
        clickLogin();
    }
}
