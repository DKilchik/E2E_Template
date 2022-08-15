package base;



import core.constants.DriverType;
import core.factory.DriverManager;
import core.factory.DriverManagerFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    // TODO Implement and Fix Factory pattern
    //protected ThreadLocal <DriverManager> driverManager = new ThreadLocal<>();
    //protected ThreadLocal <WebDriver> driver = new ThreadLocal<>();

   // private void setDriverManager(DriverManager driverManager) {
    //    this.driverManager.set(driverManager);
    //}

    //private void setDriver(WebDriver driver) {
    //    this.driver.set(driver);
    //}

    //protected DriverManager getDriverManager (){
    //    return this.driverManager.get();
    //}

    //protected WebDriver getDriver (){
    //    return this.driver.get();
    //}

    /*
    @BeforeMethod
    public void setupDriver(){
        setDriverManager(DriverManagerFactory.getManager(DriverType.CHROME));
        setDriver(getDriverManager().getDriver());

    }

    @AfterMethod
    public void tearDown(){
        if (getDriverManager().getDriver() != null){
        getDriverManager().getDriver().quit();
        }
    }
     */

    protected WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }

}
