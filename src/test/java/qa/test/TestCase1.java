package qa.test;
import base.BaseTest;
import org.testng.annotations.*;
import page_events.HomePageEvents;
import page_events.LoginPageEvents;
import utils.FetchElement;

public class TestCase1 extends BaseTest {
    FetchElement ele = new FetchElement();
    HomePageEvents homePage = new HomePageEvents();
    LoginPageEvents loginPage = new LoginPageEvents();
    @Test
    public void sampleMthodToEnteringCredential(){
        homePage.sigInButton();
        loginPage.verifyIfLoginPageIsLoaded();
        loginPage.enterCredentials();

    }
}
