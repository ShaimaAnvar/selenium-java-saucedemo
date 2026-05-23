//This page will handle:Add to cart button, Cart icon click
//page class stores actions
//test class controls flow
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    WebDriver driver;
    //stores 'Add to cart' locator for backpack
    By backpackAddButton = By.id("add-to-cart-sauce-labs-backpack");
    //stores 'cart' icon locator
    By cartIcon = By.className("shopping_cart_link");
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
}