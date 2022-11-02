package com.qaprosoft.carina.demo.phone.pages.ios;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.phone.pages.common.CarinaPageBase;
import com.qaprosoft.carina.demo.phone.pages.common.Gender;
import com.qaprosoft.carina.demo.phone.pages.common.LoginPageBase;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE,parentClass = LoginPageBase.class )
public class LoginPage extends LoginPageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeName(String name) {

    }

    @Override
    public void typePassword(String password) {

    }

    @Override
    public void selectGender(Gender gender) {

    }

    @Override
    public void checkPrivacyBox() {

    }

    @Override
    public CarinaPageBase clickLoginButton() {
        return null;
    }


}
