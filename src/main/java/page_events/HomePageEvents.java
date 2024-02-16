package page_events;

import page_object.HomePageElements;
import utils.FetchElement;

public class HomePageEvents {
    FetchElement ele = new FetchElement();
    public void sigInButton(){
        ele.getWebElement("XPATH", HomePageElements.signInButtonText).click();
    }
}
