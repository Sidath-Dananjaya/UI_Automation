package com.sysco.UI_Automation.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends PageBase{

    public static boolean isUserNameAvailable(){
        return syscoLabUI.isDisplayed(LoginPage.userName) ;
    }

    public static boolean isVerifyUserName(){

        return syscoLabUI.isDisplayed(By.id(LoginPage.userName.getText()));

    }

}





