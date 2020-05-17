package com.sysco.UI_Automation.Function;

import com.sysco.UI_Automation.Page.CartPage;
import com.sysco.UI_Automation.Page.PageBase;

public class Cart extends PageBase {

    public static CartPage theCart = new CartPage();

    public static void verifyRemoveItemButton(){

        theCart.isRemoveCartButtonAvailable();
    }

    public static void verifyRemoveItem(){

        theCart.clickRemoveItems();
    }

    public static void verifyShoeAvailable(){

        theCart.isShoeAvailable();
    }

    public static void verifyAddItemToCart(){

        theCart.clickRemoveItems();
    }

    public static void verifyProceedToCheckout(){

        theCart.proceedToCheckout();
    }
}
