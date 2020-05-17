package com.sysco.UI_Automation.Test;

import com.sysco.UI_Automation.Function.Cart;
import com.sysco.UI_Automation.Util.TestBase;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static com.sysco.UI_Automation.Function.Cart.theCart;

public class CartTest extends TestBase {


    public void testShoppingCart() throws IOException {
        SoftAssert softAssert = new SoftAssert();

        Cart.verifyRemoveItemButton();
        softAssert.assertTrue(theCart.isRemoveCartButtonAvailable(),"Item Remove button is available");

        Cart.verifyRemoveItem();
        Cart.verifyAddItemToCart();
        Cart.verifyShoeAvailable();
        softAssert.assertTrue(theCart.isRemoveCartButtonAvailable(),"Item is available");

        Cart.verifyAddItemToCart();

        Cart.verifyProceedToCheckout();
        softAssert.assertAll();
    }









}
