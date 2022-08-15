package pages;

import base.BasePage;
import core.webdriver.wrappers.DriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthPage extends BasePage {

    private final By usernameFld = By.id("txtUsername");
    private final By passwordFld = By.id("txtPassword");
    private final By loginBtn = By.id("btnLogin");


    public AuthPage(WebDriver driver) {
        super(driver);
        this.url = "https://opensource-demo.orangehrmlive.com/";
    }

    @Override
    public AuthPage waitIsLoaded() {
        new DriverWait(this.driver).elementIsPresent(usernameFld);
        return this;
    }

    @Override
    public AuthPage open() {
        driver.get(this.url);
        return this;
    }

    public AuthPage enterUsername(String username){
        WebElement usernameField = this.driver.findElement(usernameFld);
        usernameField.sendKeys(username);
        return this;
    }

    public AuthPage enterPassword(String username){
        WebElement passwordField = this.driver.findElement(passwordFld);
        passwordField.sendKeys(username);
        return this;
    }

    public DashBoardPage clickLoginButton(){
        WebElement loginButton = this.driver.findElement(loginBtn);
        loginButton.click();
        return new DashBoardPage(this.driver);
    }


}
