package core.factory;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager{

    @Override
    protected void initDriver() {
        driver = new FirefoxDriver();
    }
}
