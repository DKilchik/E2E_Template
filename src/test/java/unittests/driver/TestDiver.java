package unittests.driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDiver {

    @Test
    public void testStartDriver(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }


}
