package com.sysco.UI_Automation.Function;

import com.sysco.UI_Automation.Common.Constants;
import com.sysco.UI_Automation.Page.AthletesHomePage;
import com.sysco.UI_Automation.Page.PageBase;
import com.sysco.UI_Automation.Util.DriverSetupUtil;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;

public class AthletesHome extends PageBase {

    static AthletesHomePage theHomePage = new AthletesHomePage();

    public static void loadHomePage() throws IOException {

        DriverSetupUtil.setToRunLocally();
        DesiredCapabilities capabilities = null;
        theHomePage.isHomePageVisible();
    }

    public static void clickLoginButton(){
        theHomePage.clickLoginLink();
    }

}

