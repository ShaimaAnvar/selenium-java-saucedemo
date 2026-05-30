package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

public class LogoutTest {

    @Test
    public void logoutTest() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.logout();

        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(currentUrl.contains("saucedemo.com"));

        driver.quit();
    }
}