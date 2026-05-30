package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;

public class CheckoutTest {
    @Test
    public void checkoutBackpackTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addBackpackToCart();
        productsPage.openCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.enterCheckoutInfo("A", "B", "23");
        checkoutPage.clickFinish();
        Assert.assertTrue(checkoutPage.isOrderSuccessMessageDisplayed());
    }
}
