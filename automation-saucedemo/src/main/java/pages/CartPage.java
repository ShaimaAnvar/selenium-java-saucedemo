//cartPage verifies if products exist in cart
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    By backpackItem = By.xpath("//div[text()='Sauce Labs Backpack']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isBackpackDisplayed() {
        return driver.findElement(backpackItem).isDisplayed(); //find backpack item and return whether displayed or not.
    }
}
