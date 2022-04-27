package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class FacebookLoginPage {
    WebDriver driver;

    public FacebookLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        if (!"Facebook – log in or sign up".equals(driver.getTitle())) {
            // Alternatively, we could navigate to the login page, perhaps logging out first
            throw new IllegalStateException("This is not the login page");
        }
    }

    By email = By.id("email");
    By password = By.id("pass");
    By login = By.name("login");
    @FindAll({@FindBy(id = "email"), @FindBy(name = "email")})//OR condition
    WebElement txtEmail;
    @FindBys({@FindBy(xpath = "//input[@type='text']"), @FindBy(id = "email")})//AND condition
    WebElement txtEmail1;

    public FacebookLoginPage typeEmail(String emailValue) {
        driver.findElement(email).sendKeys(emailValue);
// x
        return this;
    }

    public FacebookLoginPage typePassword(String passwordValue) {
        driver.findElement(password).sendKeys(passwordValue);
        return this;
    }

    public FacebookHomePage clickLogin() {
        driver.findElement(login).click();
        return new FacebookHomePage(driver);
    }
}
