package core.webdriver.wrappers;


import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.configuration.Configuration;

import java.time.Duration;

public class DriverWait {

    protected WebDriver driver;

    public DriverWait(WebDriver driver){
        this.driver = driver;
    }

    public void elementIsPresent(By locator, int timeout){
        try{
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (TimeoutException e){
          System.out.println(e.getMessage());
          throw new TimeoutException(
                  String.format("Element %s hasn't appeared during %d", locator.toString(), timeout));
        }
    }

    public void elementIsPresent(By locator){
        try{
            WebDriverWait wait = new WebDriverWait(driver, Configuration.defaultTimeout);
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (TimeoutException e){
            System.out.println(e.getMessage());
            throw new TimeoutException(
                    String.format("Element %s hasn't appeared during %s", locator.toString(), Configuration.defaultTimeout ));
        }
    }
}
