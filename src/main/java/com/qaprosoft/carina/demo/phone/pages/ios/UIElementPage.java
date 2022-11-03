package com.qaprosoft.carina.demo.phone.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.phone.pages.common.UIElementPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = UIElementPageBase.class)
public class UIElementPage extends UIElementPageBase {
    public UIElementPage(WebDriver driver) {
        super(driver);
    }
}
