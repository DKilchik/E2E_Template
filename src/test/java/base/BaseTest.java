package base;



import core.constants.DriverType;
import core.factory.DriverManagerFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = DriverManagerFactory.getManager(DriverType.CHROME).getDriver();
    }

    @AfterTest
    public void tearDown(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }

}
