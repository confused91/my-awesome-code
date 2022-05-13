package com.rd.training.selenium.advanced.browserstack;

import com.epam.reportportal.testng.ReportPortalTestNGListener;
import com.rd.training.selenium.page_object_model.pages.FacebookLoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.rd.training.selenium.page_object_model.pages.CreateAccountPage;
import com.rd.training.selenium.page_object_model.pages.VerificationPage;

import static org.testng.Assert.assertTrue;

@Listeners({ReportPortalTestNGListener.class})
public class CreateAccountTest  extends BrowserStackTestBase {

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
