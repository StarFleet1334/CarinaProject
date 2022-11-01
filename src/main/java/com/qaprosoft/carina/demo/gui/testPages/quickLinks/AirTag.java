package com.qaprosoft.carina.demo.gui.testPages.quickLinks;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AirTag extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"ac-localnav\"]/div")
    private ExtendedWebElement airTagNavBar;
    public AirTag(WebDriver driver) {
        super(driver);
    }

    public boolean isAirTagNavBarLoaded() {
        return airTagNavBar.isElementPresent();
    }
}
