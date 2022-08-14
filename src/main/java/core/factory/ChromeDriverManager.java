package core.factory;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager{

    @Override
    protected void initDriver() {
        driver = new ChromeDriver();
    }
}
