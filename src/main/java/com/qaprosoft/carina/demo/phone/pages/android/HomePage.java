package com.qaprosoft.carina.demo.phone.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.phone.pages.common.HomePageBase;
import com.qaprosoft.carina.demo.phone.pages.common.LoginPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(id = "carina_logo")
    private ExtendedWebElement carina_logo;

    @FindBy(id = "next_button")
    private ExtendedWebElement next_button;
    
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPageBase clickNextButton() {
        next_button.click();
        return initPage(getDriver(),LoginPageBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return carina_logo.isElementPresent();
    }

}
