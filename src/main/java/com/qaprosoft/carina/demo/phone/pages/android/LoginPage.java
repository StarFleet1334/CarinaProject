package com.qaprosoft.carina.demo.phone.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.phone.pages.common.CarinaPageBase;
import com.qaprosoft.carina.demo.phone.pages.common.Gender;
import com.qaprosoft.carina.demo.phone.pages.common.LoginPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase implements IMobileUtils {

    @FindBy(id = "action_bar_root")
    private ExtendedWebElement content;

    @FindBy(id = "name")
    private ExtendedWebElement name_field;

    @FindBy(id = "password")
    private ExtendedWebElement password_field;

    @FindBy(id = "radio_male")
    private ExtendedWebElement maleRadioGroup;

    @FindBy(id = "radio_female")
    private ExtendedWebElement femaleRadioGroup;

    @FindBy(id = "checkbox")
    private ExtendedWebElement checkbox;

    @FindBy(id = "login_button")
    private ExtendedWebElement login_button;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeName(String name) {
        name_field.type(name);
    }

    @Override
    public void typePassword(String password) {
        password_field.type(password);
        hideKeyboard();
    }

    @Override
    public CarinaPageBase clickLoginButton() {
        login_button.click();
        return initPage(getDriver(),CarinaPageBase.class);
    }

    @Override
    public void selectGender(Gender gender) {
        switch (gender) {
            case MALE: maleRadioGroup.click(); break;
            case FEMALE: femaleRadioGroup.click(); break;
        }
    }



    @Override
    public void checkPrivacyBox() {
        checkbox.click();
    }


    @Override
    public boolean isPageOpened() {
        return content.isElementPresent();
    }
}
