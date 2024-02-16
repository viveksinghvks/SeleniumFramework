package page_events;

import org.testng.Assert;
import page_object.LoginPageElements;
import utils.FetchElement;

public class LoginPageEvents {
    FetchElement ele = new FetchElement();

    public void verifyIfLoginPageIsLoaded(){
        Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.loginButton).size()>0, "Element not found");

    }
    public void enterCredentials(){
        ele.getWebElement("XPATH",LoginPageElements.emailAddressField).sendKeys("vivek@gmail.com");
        ele.getWebElement("XPATH", LoginPageElements.passwordField).sendKeys("12345");
    }
}
