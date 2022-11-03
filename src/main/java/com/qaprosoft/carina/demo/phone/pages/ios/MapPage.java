package com.qaprosoft.carina.demo.phone.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.phone.pages.common.MapPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE,parentClass = MapPageBase.class)
public class MapPage extends MapPageBase {
    public MapPage(WebDriver driver) {
        super(driver);
    }
}
