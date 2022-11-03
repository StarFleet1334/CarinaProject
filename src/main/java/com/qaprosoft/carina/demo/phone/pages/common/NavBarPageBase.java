package com.qaprosoft.carina.demo.phone.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class NavBarPageBase extends AbstractPage {
    public NavBarPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract ChartPageBase viewCharts();

    public abstract MapPageBase viewMap();

    public abstract UIElementPageBase viewUiElements();
}
