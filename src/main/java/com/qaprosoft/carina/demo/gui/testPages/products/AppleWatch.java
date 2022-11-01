package com.qaprosoft.carina.demo.gui.testPages.products;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AppleWatch extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"page\"]/div[4]/div[3]/div/div[1]/h1")
    private ExtendedWebElement appleWatchTag;

    public AppleWatch(WebDriver driver) {
        super(driver);
    }

    public boolean isAppleWatchTagPresent() {
        return appleWatchTag.isElementPresent();
    }
}
