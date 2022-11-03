package com.qaprosoft.carina.demo.phone.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.phone.pages.common.ChartPageBase;
import com.qaprosoft.carina.demo.phone.pages.common.MapPageBase;
import com.qaprosoft.carina.demo.phone.pages.common.NavBarPageBase;
import com.qaprosoft.carina.demo.phone.pages.common.UIElementPageBase;
import org.openqa.selenium.WebDriver;


@DeviceType(pageType = DeviceType.Type.IOS_PHONE,parentClass = NavBarPageBase.class)
public class NavBarPage extends NavBarPageBase {
    public NavBarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ChartPageBase viewCharts() {
        return null;
    }

    @Override
    public MapPageBase viewMap() {
        return null;
    }

    @Override
    public UIElementPageBase viewUiElements() {
        return null;
    }
}
