package automationpractice.com;

import org.openqa.selenium.WebDriver;
import util.PropertyFileReader;
import util.TestApp;

public class CreateAnAccountPage {

    WebDriver driver= TestApp.getInstance().getDriver();
    PropertyFileReader property =new PropertyFileReader();
    String userEmailElement =property.getProperty("CreateAnAccountPage","user.email.element");
}
