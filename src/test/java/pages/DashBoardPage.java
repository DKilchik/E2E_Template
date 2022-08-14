package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;

public class DashBoardPage extends BasePage {

    public DashBoardPage(WebDriver driver) {
        super(driver);
        url = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
    }

    @Override
    public DashBoardPage open() {
        this.driver.get(this.url);
        return this;
    }

    @Override
    public BasePage waitIsLoaded() {
        return null;
    }
}
