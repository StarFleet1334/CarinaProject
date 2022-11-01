package com.qaprosoft.carina.demo.gui.testPages.products;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Ipad extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"page\"]/div[4]/div[2]/div/div[1]/h1")
    private ExtendedWebElement ipadTag;

    public Ipad(WebDriver driver) {
        super(driver);
    }

    public boolean isIpadTagPresent() {
        return ipadTag.isElementPresent();
    }
}
