package unittests.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBeforeAfter {
    private WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
    }

    @Test
    public void testSetupAndTearDown() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(500);

    }

    @AfterTest
    public void tearDown(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
}
