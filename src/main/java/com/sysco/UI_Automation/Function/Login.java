package com.sysco.UI_Automation.Function;

import com.sysco.UI_Automation.Page.LoginPage;
import com.sysco.UI_Automation.Page.PageBase;
import org.eclipse.jetty.util.preventers.LoginConfigurationLeakPreventer;

import java.io.IOException;

public class Login extends PageBase {
public static LoginPage theLogin = new LoginPage();

    public static void verifyEmailAndPasswordFieldAvailable() throws IOException {

        theLogin.isEmailTextboxAvailable();

        theLogin.isPasswordTextboxAvailable();

    }

    public static void verifyInvalidEmailLogin() {

        theLogin.verifyInvalidEmailError();

    }

    public static void verifyValidEmailLogin() {

        theLogin.verifyLoginByValidEmail();

    }





}
