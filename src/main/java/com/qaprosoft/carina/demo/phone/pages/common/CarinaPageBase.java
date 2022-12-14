package com.qaprosoft.carina.demo.phone.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CarinaPageBase extends AbstractPage {
    public CarinaPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract NavBarPageBase navBarView();
}
