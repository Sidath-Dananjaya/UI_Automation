package com.sysco.UI_Automation.Function;

import com.sysco.UI_Automation.Page.MyAccountPage;

import java.io.IOException;

public class MyAccount {

   public static MyAccountPage theAccount = new MyAccountPage();

    public static void verifyUserNameAvailable() throws IOException {

        theAccount.isUserNameAvailable();
    }

    public static void verifyUserNames() throws IOException{

        theAccount.isVerifyUserName();
    }

}
