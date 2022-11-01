package com.qaprosoft.carina.demo.gui.testPages.quickLinks;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AppleStoreFAQ extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]")
    private ExtendedWebElement topicBar;

    public AppleStoreFAQ(WebDriver driver) {
        super(driver);
    }

    public boolean isTopicBarLoaded() {
        return topicBar.isElementPresent();
    }
}
