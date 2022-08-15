package unittests.driver;


import core.constants.DriverType;
import core.factory.DriverManagerFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestDriverFactory {

    private WebDriver driver;

    @BeforeMethod
    public void startDriver(){
        this.driver = DriverManagerFactory.getManager(DriverType.CHROME).getDriver();
    }

    @Test
    public void TestDriver(){
        this.driver.get("https://www.google.com/");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterMethod
    public void quitDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}
