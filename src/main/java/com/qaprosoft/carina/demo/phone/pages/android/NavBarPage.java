package com.qaprosoft.carina.demo.phone.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.phone.pages.common.ChartPageBase;
import com.qaprosoft.carina.demo.phone.pages.common.MapPageBase;
import com.qaprosoft.carina.demo.phone.pages.common.NavBarPageBase;
import com.qaprosoft.carina.demo.phone.pages.common.UIElementPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = NavBarPageBase.class)
public class NavBarPage extends NavBarPageBase {

    @FindBy(id = "design_menu_item_text")
    private List<ExtendedWebElement> navBarElements ;

    public NavBarPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ChartPageBase viewCharts() {
        navBarElements.get(1).click();
        return initPage(getDriver(), ChartPageBase.class);
    }

    @Override
    public MapPageBase viewMap() {
        navBarElements.get(2).click();
        return initPage(getDriver(),MapPageBase.class);
    }

    @Override
    public UIElementPageBase viewUiElements() {
        navBarElements.get(3).click();
        return initPage(getDriver(),UIElementPageBase.class);
    }
}
