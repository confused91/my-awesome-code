package selenium.page_object_model;

import com.epam.reportportal.testng.ReportPortalTestNGListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import selenium.pages.CreateAccountPage;
import selenium.pages.FacebookLoginPage;
import selenium.pages.VerificationPage;

import static org.testng.Assert.assertTrue;

@Listeners({ReportPortalTestNGListener.class})
public class CreateAccountTest  extends TestBase{

    FacebookLoginPage facebookLoginPage;
    CreateAccountPage createAccountPage;
    VerificationPage verificationPage;

    @Test
    public void createAccount() {
        facebookLoginPage = new FacebookLoginPage(driver);
        createAccountPage = facebookLoginPage.clickCreateAccount();
        verificationPage=createAccountPage.createAccountValid();
        assertTrue(verificationPage.verifyConfirmationText(),"the confirmation text is incorrect!");
    }
}
