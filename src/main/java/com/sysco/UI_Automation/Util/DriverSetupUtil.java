package com.sysco.UI_Automation.Util;

import com.sysco.UI_Automation.Common.Constants;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class DriverSetupUtil {

    public static void setToRunLocally() {

        System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH +System.getProperty("os.arch")+"/chromedriver");
        DesiredCapabilities capabilities = org.openqa.selenium.remote.DesiredCapabilities.chrome();

    }

}
