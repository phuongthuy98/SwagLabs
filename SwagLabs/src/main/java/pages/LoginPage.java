package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page{

    public By btnSubmit = By.cssSelector(".btn_action");
    public void clickSubmit() {
        testBase.scrollToEndPage();
        driverWeb.findElement(btnSubmit).click();
    }

    public LoginPage(WebDriver dr) {
        super(dr);
    }


}
