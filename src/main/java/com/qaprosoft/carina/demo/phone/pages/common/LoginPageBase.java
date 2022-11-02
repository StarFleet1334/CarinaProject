package com.qaprosoft.carina.demo.phone.pages.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractPage {

    public LoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeName(String name);

    public abstract void typePassword(String password);

    public abstract void selectGender(Gender gender);

    public abstract void checkPrivacyBox();

    public abstract CarinaPageBase clickLoginButton();




}
