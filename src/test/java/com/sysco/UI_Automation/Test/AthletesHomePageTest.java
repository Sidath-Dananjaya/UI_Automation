package com.sysco.UI_Automation.Test;

import com.sysco.UI_Automation.Function.AthletesHome;
import com.sysco.UI_Automation.Page.AthletesHomePage;
import com.sysco.UI_Automation.Util.TestBase;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class AthletesHomePageTest extends TestBase {

    @BeforeClass
    public void init(){}
@Test
    public void testNavigateLoginPage() throws IOException {
        SoftAssert softAssert = new SoftAssert();

        AthletesHome.clickLoginButton();
        softAssert.assertTrue(AthletesHomePage.isHomePageVisible(),"Home Page is displayed");
        softAssert.assertAll();
    }
}
