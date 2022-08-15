package base;

import org.openqa.selenium.WebDriver;
import pages.AuthPage;

public abstract class BasePage {

    protected WebDriver driver;
    protected String url;
    public abstract BasePage waitIsLoaded();

    public abstract BasePage open();

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

}
