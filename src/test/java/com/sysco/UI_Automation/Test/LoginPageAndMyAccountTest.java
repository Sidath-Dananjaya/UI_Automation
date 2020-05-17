package com.sysco.UI_Automation.Test;

import com.sysco.UI_Automation.Common.Constants;
import com.sysco.UI_Automation.Function.Login;
import com.sysco.UI_Automation.Function.MyAccount;
import com.sysco.UI_Automation.Util.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.sysco.UI_Automation.Page.LoginPage;
import java.io.IOException;

import static com.sysco.UI_Automation.Function.Login.*;
import static com.sysco.UI_Automation.Function.MyAccount.theAccount;
import static com.sysco.UI_Automation.Page.LoginPage.*;
import static com.sysco.UI_Automation.Page.MyAccountPage.isUserNameAvailable;
import static com.sysco.UI_Automation.Page.PageBase.syscoLabUI;

public class LoginPageAndMyAccountTest extends TestBase {
@Test
    public void testLoginPage() throws IOException {

        SoftAssert softAssert = new SoftAssert();
        verifyEmailAndPasswordFieldAvailable();

        softAssert.assertTrue(isEmailTextboxAvailable(),"Email text box is displayed");
        softAssert.assertTrue(isPasswordTextboxAvailable(),"Password text box is displayed");

        verifyInvalidEmailLogin();
        softAssert.assertTrue(theLogin.verifyInvalidEmailError(),"PLEASE ENTER A VALID EMAIL ADDRESS (EX: JOHNDOE@DOMAIN.COM).");

        verifyValidEmailLogin();
        softAssert.assertTrue(theLogin.verifyLoginByValidEmail(),"User Logged In Successfully");

        softAssert.assertAll();

    }
    @Test
    public void testMyAccount() throws IOException {

        SoftAssert softAssert = new SoftAssert();
        MyAccount.verifyUserNameAvailable();
        softAssert.assertTrue(theAccount.isUserNameAvailable(),"User Name is displayed");

        MyAccount.verifyUserNames();
        softAssert.assertEquals(theLogin.correctUserName,"WILLIAM JACOB");
        softAssert.assertAll();

    }
}
