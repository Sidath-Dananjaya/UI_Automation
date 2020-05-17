package com.sysco.UI_Automation.Page;

import com.sysco.UI_Automation.Common.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CartPage extends PageBase {

    private static By itemRemoveButton = By.xpath(".//a[@class='action delete']");
    private static By confirmRemoveButton = By.xpath(".//button[@class='action-primary action-accept button -secondary']");
    private static By mainCategory = By.xpath(".//*[@id='mi-1-2']");
    private static By subCategory = By.xpath(".//*[@id='mi-3-2-2-1']");
    private static By item = By.xpath("//a[text()='ADIDAS ULTRABOOST 20 MENS FTWR WHITE GREY THREE F17 CORE BLACK']");
    private static By itemSize = By.xpath(".//*[@id='swatch-row-227']");
    private static By addToCart = By.xpath(".//*[@id='product-addtocart-button']");
    private static By openCart = By.xpath(".//*[@id='svg-icon-shopping-cart']");
    private static By secureCheckout = By.xpath(".//button[contains(.,'Proceed To Checkout')]");
    private static WebElement prize = syscoLabUI.findElement(By.xpath(".//*[@id='product-price-333453']"));
    private static WebElement cartTotal = syscoLabUI.findElement(By.xpath(".//div[@class='amount price-container']//span[@class='price']"));


    public static boolean isRemoveCartButtonAvailable() {
        return syscoLabUI.isDisplayed(itemRemoveButton);
    }

    public static void clickRemoveItems() {

        syscoLabUI.click(itemRemoveButton);
    }

    public static boolean isShoeAvailable() {

        syscoLabUI.click(mainCategory);
        syscoLabUI.click(subCategory);

        syscoLabUI.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        return syscoLabUI.isDisplayed(item);
    }

    public static void addItemsToCart() {

        syscoLabUI.click(item);
        syscoLabUI.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        syscoLabUI.click(itemSize);
        syscoLabUI.click(addToCart);

    }

    public static boolean proceedToCheckout() {

        syscoLabUI.click(openCart);

        if (Constants.shoePrice == cartTotal.getText() && Constants.shoePrice == prize.getText()) {

            syscoLabUI.click(secureCheckout);

        } else {
            System.out.println("Invalid Prices found");
        }

        return syscoLabUI.isSelected(secureCheckout);
    }

}
