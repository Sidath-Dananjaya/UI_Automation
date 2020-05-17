package com.sysco.UI_Automation.Test;

import com.sysco.UI_Automation.Common.Constants;
import com.sysco.UI_Automation.Function.PaymentCheckout;
import com.sysco.UI_Automation.Util.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static com.sysco.UI_Automation.Function.PaymentCheckout.paymentCheckoutManage;

public class PaymentCheckoutPageTest extends TestBase {
@Test
    public void testValidationErrors() throws IOException {
        SoftAssert softAssert = new SoftAssert();
        PaymentCheckout.verifyValidationErrors();
        String[] errorMessages = paymentCheckoutManage.isValidationErrorsAvailable();

        softAssert.assertEquals(paymentCheckoutManage.errorEmptyFirstName.isDisplayed(),true);
        softAssert.assertEquals(paymentCheckoutManage.errorEmptyLastName.isDisplayed(),true);
        softAssert.assertEquals(paymentCheckoutManage.errorEmptyAddress.isDisplayed(),true);
        softAssert.assertEquals(paymentCheckoutManage.errorEmptySuburb.isDisplayed(),true);
        softAssert.assertEquals(paymentCheckoutManage.errorEmptyStateProvince.isDisplayed(),true);
        softAssert.assertEquals(paymentCheckoutManage.errorEmptyPostCode.isDisplayed(),true);
        softAssert.assertEquals(paymentCheckoutManage.errorEmptyPhoneNumber.isDisplayed(),true);

        softAssert.assertEquals(errorMessages[0], Constants.ERROR_MESSAGE_FIRSTNAME_IS_REQUIRED ,"First name error message validated");
        softAssert.assertEquals(errorMessages[1], Constants.ERROR_MESSAGE_LASTNAME_IS_REQUIRED, "Last name error message validated");
        softAssert.assertEquals(errorMessages[2], Constants.ERROR_MESSAGE_ADDRESS_IS_REQUIRED, "Address error message validated");
        softAssert.assertEquals(errorMessages[3], Constants.ERROR_MESSAGE_SUBURB_IS_REQUIRED, "Suburb error message validated");
        softAssert.assertEquals(errorMessages[4], Constants.ERROR_MESSAGE_STATE_PROVINCE_IS_REQUIRED, "State province error message validated");
        softAssert.assertEquals(errorMessages[5], Constants.ERROR_MESSAGE_POSTAL_CODE_IS_REQUIRED, "Postal code error message validated");
        softAssert.assertEquals(errorMessages[6], Constants.ERROR_MESSAGE_PHONE_NUMBER_IS_REQUIRED, "Phone number error message validated");
        softAssert.assertAll();

    }

    @Test
    public void testProceedToPaymentCheckout(){

        PaymentCheckout.verifyProceedToPaymentCheckout();

    }

}







