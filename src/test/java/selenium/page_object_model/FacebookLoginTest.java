package selenium.page_object_model;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import selenium.pages.FacebookHomePage;
import selenium.pages.FacebookLoginPage;

import static org.testng.Assert.assertEquals;

public class FacebookLoginTest extends TestBase {

    FacebookLoginPage facebookLoginPage;
    FacebookHomePage homePage;
    Logger logger = LogManager.getLogger(FacebookLoginTest.class);

    @Test(description = "login using the email and password")
    @Parameters({"email", "password"})
    public void testLogin(@Optional("sharada.doddi09@gmail.com") String email, @Optional("Facebook123$") String password) {
        facebookLoginPage = new FacebookLoginPage(driver);
        logger.info("Facebook page has been opened");
        facebookLoginPage.typeEmail(email);
        logger.info("Typing email "+email);
        facebookLoginPage.typePassword(password);
        facebookLoginPage.clickLogin();
    }

    @Test(description = "verify home page is opened and check profile name",priority = 1)
    @Parameters("name")
    public void verifyHomePage(@Optional("Mohanchand Bhaskar") String profileName) {
        homePage = new FacebookHomePage(driver);
        assertEquals(homePage.fetchProfileName(), profileName);
    }
}
