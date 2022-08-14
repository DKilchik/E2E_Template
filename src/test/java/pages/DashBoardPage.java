package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;

public class DashBoardPage extends BasePage {

    public DashBoardPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BasePage waitIsLoaded() {
        return null;
    }
}
