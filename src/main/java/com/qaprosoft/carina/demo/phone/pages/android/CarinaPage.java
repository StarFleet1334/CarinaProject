package com.qaprosoft.carina.demo.phone.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.phone.pages.common.CarinaPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = CarinaPageBase.class)
public class CarinaPage extends CarinaPageBase {

    @FindBy(id = "content_frame")
    private ExtendedWebElement webViewContent;

    public CarinaPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return webViewContent.isElementPresent();
    }
}
