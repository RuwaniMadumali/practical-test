package automationpractice.com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.PropertyFileReader;
import util.TestApp;

public class CreateAccountTest {
    PropertyFileReader property ;
    String userEmail;
    HomePage homePage;
    SignUpPage signUpPage;
    CreateAnAccountPage createAnAccountPage;


    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage=new HomePage();
        signUpPage=homePage.signin();
        property =new PropertyFileReader();

    }

    @Test
    public void testCreateAccount() {
        userEmail =property.getProperty("user","user.email");
        createAnAccountPage=signUpPage.setEmailAddress(userEmail)
                  .createAccount();


    }

    @AfterMethod
    public void tearDown() {

    }
}
