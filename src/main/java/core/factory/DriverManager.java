package core.factory;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    protected WebDriver driver;
    protected abstract void initDriver();


    public WebDriver webDriver(){
        if (driver != null){
            initDriver();
        }
        return driver;
    }

    public void closeDriver(){
        // Close current window. Web driver session  continue
        if (driver != null){
            driver.close();
        }
    }

    public void quitDriver(){
        // Close all opened windows
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}
