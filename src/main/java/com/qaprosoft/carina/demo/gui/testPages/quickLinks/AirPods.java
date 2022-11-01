package com.qaprosoft.carina.demo.gui.testPages.quickLinks;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AirPods extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"chapternav\"]")
    private ExtendedWebElement airPodsNavBar;
    public AirPods(WebDriver driver) {
        super(driver);
    }

    public boolean isAirPodsNavBarLoaded() {
        return airPodsNavBar.isElementPresent();
    }
}
