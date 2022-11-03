package com.qaprosoft.carina.demo.phone.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.phone.pages.common.ChartPageBase;
import org.openqa.selenium.WebDriver;


@DeviceType(pageType = DeviceType.Type.IOS_PHONE,parentClass = ChartPageBase.class)
public class ChartPage extends ChartPageBase {
    public ChartPage(WebDriver driver) {
        super(driver);
    }
}
