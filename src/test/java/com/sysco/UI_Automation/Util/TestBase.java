package com.sysco.UI_Automation.Util;

import com.sysco.UI_Automation.Common.Constants;
import com.sysco.UI_Automation.Function.AthletesHome;
import com.sysco.UI_Automation.Function.Login;
import com.sysco.UI_Automation.Page.AthletesHomePage;
import com.syscolab.qe.core.reporting.SyscoLabListener;
import com.syscolab.qe.core.reporting.SyscoLabQCenter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
@Listeners(SyscoLabListener.class)
public class TestBase {

        private SyscoLabListener testListeners;
        private SyscoLabQCenter syscoLabQCenter;
        protected SoftAssert softAssert = new SoftAssert();

        @BeforeClass
        public void init() throws IOException{
            testListeners = new SyscoLabListener();
            syscoLabQCenter = new SyscoLabQCenter();

            AthletesHome.loadHomePage();

        }

}
