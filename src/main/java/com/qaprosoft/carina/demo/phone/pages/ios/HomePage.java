package com.qaprosoft.carina.demo.phone.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.demo.phone.pages.common.HomePageBase;
import com.qaprosoft.carina.demo.phone.pages.common.LoginPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE,parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPageBase clickNextButton() {
        return null;
    }


}
