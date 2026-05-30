package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class InvalidLoginTest {

    @Test
    public void invalidLoginTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "wrong_password");

        String actualErrorMessage = loginPage.getErrorMessage();

        String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

        driver.quit();
    }
}