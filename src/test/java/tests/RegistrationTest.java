package tests;

import config.ApplicationManager;
import org.testng.annotations.Test;
import pages.HomePage;

public class RegistrationTest extends ApplicationManager {

    @Test
    public void openHomePage() {
        HomePage homePage = new HomePage(getDriver());
//        homePage.clickSignUpLink()
//                .fillRegistrationPage()
//                .clicLoginLink()
//                .fillLogInPage()
//        ;

        homePage.clicLoginLink()
                .fillLogInPage()
        ;

    }

}
