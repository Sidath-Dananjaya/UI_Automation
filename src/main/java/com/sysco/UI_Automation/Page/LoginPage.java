package com.sysco.UI_Automation.Page;

import com.sysco.UI_Automation.Common.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase{

    private static By loginBtn = By.xpath("..//*[@id='send2']");
    private static By email = By.xpath(".//*[@id='email']");
    private static By password = By.xpath(".//*[@id='pass']");
    public static WebElement emailError = syscoLabUI.findElement(By.xpath(".//*[@id='email-error']"));
    public static WebElement userName = syscoLabUI.findElement(By.xpath(".//span[@class='name']/span[.='william  jacob']"));

   public static String correctUserName = null;
    public static boolean isEmailTextboxAvailable(){
        return syscoLabUI.isDisplayed(email) ;
    }

    public static boolean isPasswordTextboxAvailable(){
        return syscoLabUI.isDisplayed(password) ;
    }

    public static boolean verifyInvalidEmailError(){

        syscoLabUI.sendKeys(email, Constants.invalidEmail);
        syscoLabUI.sendKeys(password, Constants.invalidPassword);
        syscoLabUI.click(loginBtn);

        return syscoLabUI.isDisplayed(By.id(emailError.getText()));
    }

    public static boolean verifyLoginByValidEmail(){

        syscoLabUI.clear(email);
        syscoLabUI.clear(password);

        syscoLabUI.sendKeys(email, Constants.correctEmail);
        syscoLabUI.sendKeys(password, Constants.correctPassword);
        syscoLabUI.click(loginBtn);

        correctUserName = userName.getText();
        return syscoLabUI.isDisplayed(userName);

    }




}
