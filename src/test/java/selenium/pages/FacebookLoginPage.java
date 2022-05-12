package selenium.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;


public class FacebookLoginPage {
    WebDriver driver;
    Logger logger = LogManager.getLogger(FacebookLoginPage.class);

    public FacebookLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        logger.info("navigated to the Login page");
        if (!"Facebook – log in or sign up".equals(driver.getTitle())) {
            // Alternatively, we could navigate to the login page, perhaps logging out first
            throw new IllegalStateException("This is not the login page");
        }
    }


    By password = By.id("pass");
    By login = By.name("login");
    @FindBys({@FindBy(id = "email"), @FindBy(xpath = "//input[@type='text']")})//AND condition
    WebElement txtEmail1;
    @FindBy(css = "[data-testid='open-registration-form-button']")
    WebElement createAccountBtn;

    public FacebookLoginPage typeEmail(String emailValue) {
        txtEmail1.sendKeys(emailValue);
        logger.info("typing email "+emailValue);
        return this;
    }

    public FacebookLoginPage typePassword(String passwordValue) {
        driver.findElement(password).sendKeys(passwordValue);
        logger.info("typing password "+passwordValue);
        return this;
    }

    public FacebookHomePage clickLogin() {
        driver.findElement(login).click();
        logger.info("navigating to the home page");
        return new FacebookHomePage(driver);
    }

    public CreateAccountPage clickCreateAccount() {
        createAccountBtn.click();
        logger.info("clicked on create account button");
        return new CreateAccountPage(driver);
    }

}
