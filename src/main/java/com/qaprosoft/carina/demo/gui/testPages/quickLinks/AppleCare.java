package com.qaprosoft.carina.demo.gui.testPages.quickLinks;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AppleCare extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"ac-localnav\"]/div/div[1]")
    private ExtendedWebElement appleCareNavBar;
    public AppleCare(WebDriver driver) {
        super(driver);
    }

    public boolean isAppleCareNavBarLoaded() {
        return appleCareNavBar.isElementPresent();
    }
}
