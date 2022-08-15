package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AuthPage;

import static org.testng.Assert.assertTrue;

public class TestAuthPage extends BaseTest {

    @Test
    public void testLogin(){
        new AuthPage(driver).
                open().
                waitIsLoaded().
                enterUsername("Admin").
                enterPassword("admin123").
                clickLoginButton();

        assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }


}
