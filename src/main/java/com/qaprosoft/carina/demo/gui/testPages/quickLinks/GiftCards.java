package com.qaprosoft.carina.demo.gui.testPages.quickLinks;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class GiftCards extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"as-standardnav\"]/div/div[1]")
    private ExtendedWebElement giftCardNavBar;
    public GiftCards(WebDriver driver) {
        super(driver);
    }


    public boolean isNavBarLoaded() {
        return giftCardNavBar.isElementPresent();
    }

}
