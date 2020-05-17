package com.sysco.UI_Automation.Page;

import com.sysco.UI_Automation.Common.Constants;
import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.Capabilities;

public class PageBase {
    public static SyscoLabUI syscoLabUI;

    public PageBase() {
    }

    public static SyscoLabUI getSyscoLabUI(Capabilities capabilities) {
        syscoLabUI = new SyscoLabWUI(capabilities);

        return syscoLabUI;
    }
}
