package com.sysco.UI_Automation.Page;

import com.sysco.UI_Automation.Common.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AthletesHomePage extends PageBase {
    private static By loginLink = By.xpath(".//a[@href='https://www.theathletesfoot.com.au/customer/account/login']");

    private static By divLogo = By.className("home-banner");
    public static boolean isHomePageVisible() throws IOException {
        syscoLabUI = PageBase.getSyscoLabUI(capabilities);
        syscoLabUI.navigateTo(Constants.APP_URL);
        syscoLabUI.getDriver().manage().window().maximize();
        syscoLabUI.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        return syscoLabUI.isDisplayed(divLogo);

    }

    public static void clickLoginLink(){

        syscoLabUI.click(loginLink);
    }
}
