package com.qaprosoft.carina.demo.phone.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.phone.pages.common.NavBarBase;
import org.openqa.selenium.WebDriver;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = NavBarBase.class)
public class Navbar extends NavBarBase {
    public Navbar(WebDriver driver) {
        super(driver);
    }
}
