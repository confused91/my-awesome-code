package selenium.page_object_model;

import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import selenium.pages.FacebookHomePage;
import selenium.pages.FacebookLoginPage;

import static org.testng.Assert.assertEquals;

public class FacebookLoginTest extends TestBase {

    FacebookLoginPage facebookLoginPage;
    FacebookHomePage homePage;

    @Test(description = "login using the email and password")
    @Parameters({"email", "password"})
    public void testLogin(@Optional("sharada.doddi09@gmail.com") String email, @Optional("Facebook123$") String password) {
        facebookLoginPage = new FacebookLoginPage(driver);
        facebookLoginPage.typeEmail(email);
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
