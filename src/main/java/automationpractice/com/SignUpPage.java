package automationpractice.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.PropertyFileReader;
import util.TestApp;

import java.time.Duration;

public class SignUpPage {
    WebDriver driver= TestApp.getInstance().getDriver();
    PropertyFileReader property =new PropertyFileReader();
    String userEmailElement =property.getProperty("SignUpPage","user.email.element");
    String creatAccountButtonElement =property.getProperty("SignUpPage","create.account.button.element");

    public SignUpPage setEmailAddress(String userEmail){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(userEmailElement), Duration.ofSeconds(10));
        driver.findElement(By.id(userEmailElement)).sendKeys(userEmail);
        return this;
    }
    public CreateAnAccountPage createAccount(){
        TestApp.getInstance().waitUntilNextElementAppears(By.id(creatAccountButtonElement), Duration.ofSeconds(10));
        driver.findElement(By.id(creatAccountButtonElement)).click();
        return new CreateAnAccountPage();
    }
}
