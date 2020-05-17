package com.sysco.UI_Automation.Function;

import com.sysco.UI_Automation.Page.PageBase;
import com.sysco.UI_Automation.Page.PaymentCheckoutPage;

public class PaymentCheckout extends PageBase {


   public static PaymentCheckoutPage paymentCheckoutManage = new PaymentCheckoutPage();

    public static void verifyValidationErrors(){

        paymentCheckoutManage.isValidationErrorsAvailable();

    }

    public static void verifyProceedToPaymentCheckout(){
        paymentCheckoutManage.proceedPaymentCheckout();
    }

}
