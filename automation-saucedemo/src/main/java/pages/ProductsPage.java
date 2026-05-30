//This page will handle:Add to cart button, Cart icon click
//page class stores actions
//test class controls flow
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage {

    WebDriver driver;
    //stores 'Add to cart' locator for backpack
    By backpackAddButton = By.id("add-to-cart-sauce-labs-backpack");
    //stores 'cart' icon locator
    By cartIcon = By.className("shopping_cart_link");

    By menuButton = By.id("react-burger-menu-btn");
    By logoutLink = By.id("logout_sidebar_link");

    //constructor, recieves driver from test class
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addBackpackToCart() {
        driver.findElement(backpackAddButton).click();
    }

    public void openCart() {
        driver.findElement(cartIcon).click();
    }
    public void logout() {
        driver.findElement(menuButton).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(logoutLink)).click();
    }
}