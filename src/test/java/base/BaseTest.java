package base;



import core.constants.DriverType;
import core.factory.DriverManagerFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setupDriver(){
        this.driver = DriverManagerFactory.getDriver(DriverType.CHROME).webDriver();
    }

    @AfterTest
    public void tearDown(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}
