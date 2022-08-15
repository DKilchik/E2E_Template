package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;

public class DashBoardPage extends BasePage {

    public DashBoardPage(WebDriver driver) {
        super(driver);
        this.url = "";
    }

    @Override
    public BasePage waitIsLoaded() {
        return null;
    }

    @Override
    public BasePage open() {
        this.driver.get(this.url);
        return null;
    }
}
