package com.qaprosoft.carina.demo.phone.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.phone.pages.common.UIElementPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = UIElementPageBase.class)
public class UIElementPage extends UIElementPageBase {

    @FindBy(id = "imageView")
    private ExtendedWebElement uiElementImage;

    public UIElementPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return uiElementImage.isElementPresent();
    }
}
