package tests; // This class belongs to the 'tests' package

import org.openqa.selenium.WebDriver; // Interface used to control browser
import org.openqa.selenium.chrome.ChromeDriver; // Used to launch Chrome browser
import org.testng.Assert; // Used for validations/assertions
import org.testng.annotations.Test; // Used to mark test methods

// Importing page classes
import pages.CartPage;
import pages.LoginPage;
import pages.ProductsPage;

public class AddToCartTest { // Test class

    @Test // Marks this method as a TestNG test
    public void addBackpackToCartTest() {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open SauceDemo website
        driver.get("https://www.saucedemo.com");

        // Create LoginPage object and pass driver
        LoginPage loginPage = new LoginPage(driver);

        // Login using username and password
        loginPage.login("standard_user", "secret_sauce");

        // Create ProductsPage object
        ProductsPage productsPage = new ProductsPage(driver);

        // Click Add to Cart button for backpack
        productsPage.addBackpackToCart();

        // Click cart icon to open cart page
        productsPage.openCart();

        // Create CartPage object
        CartPage cartPage = new CartPage(driver);

        // Verify backpack item is displayed in cart
        Assert.assertTrue(cartPage.isBackpackDisplayed());

        // Close browser
        driver.quit();
    }
}