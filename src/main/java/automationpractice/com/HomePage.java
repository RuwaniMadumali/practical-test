package automationpractice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.PropertyFileReader;
import util.TestApp;

import java.time.Duration;


public class HomePage {

    WebDriver driver= TestApp.getInstance().getDriver();
    PropertyFileReader property =new PropertyFileReader();
    String signinElement =property.getProperty("HomePage","user.signin.element");


    public SignUpPage signin(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath(signinElement), Duration.ofSeconds(10));
        driver.findElement(By.xpath(signinElement)).click();
        return new SignUpPage();
    }
}
