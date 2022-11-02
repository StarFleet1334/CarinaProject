package com.qaprosoft.carina.demo.phone.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.phone.pages.common.CarinaPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE,parentClass = CarinaPageBase.class)
public class CarinaPage extends CarinaPageBase {

    public CarinaPage(WebDriver driver) {
        super(driver);
    }
}
