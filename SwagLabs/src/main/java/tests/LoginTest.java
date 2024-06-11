package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;

public class LoginTest extends TestCase {
    By txtUserName = By.id("#user-nam");
    By txtPassword = By.id("#password");
    String userNameInput = "standard_user";
    String passwordInput = "secret_sauce";
    /*Test Step:
        1. open web
        2. Input all valid data
        4. Click button submit
        5. Register successfully*/

    @Test
    public void loginSuccessfully() {
        LoginPage loginPage = new LoginPage(testBase.driver);
        testBase.inputText(txtUserName, userNameInput, 0);
        testBase.inputText(txtPassword, passwordInput, 0);
        loginPage.clickSubmit();

        assertEquals("https://www.saucedemo.com/inventory.html", testBase.driver.getCurrentUrl());
    }

    /*Test Step:
        1. open web
        2. Input valid data in UserName
        4. Click button submit
        5. Check response*/
    @Test
    public void loginValidation() {
        LoginPage loginPage = new LoginPage(testBase.driver);
        testBase.inputText(txtUserName, "", 0);
        testBase.inputText(txtPassword, passwordInput, 0);
        loginPage.clickSubmit();
    }
}
