package com.qaprosoft.carina.demo.phone.tests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.phone.pages.common.CarinaPageBase;
import com.qaprosoft.carina.demo.phone.pages.common.Gender;
import com.qaprosoft.carina.demo.phone.pages.common.HomePageBase;
import com.qaprosoft.carina.demo.phone.pages.common.LoginPageBase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class MobileTest extends AbstractTest {

    @Test
    public void testLogin() {
        HomePageBase homePageBase = initPage(getDriver(),HomePageBase.class);
        assertTrue(homePageBase.isPageOpened(),"Carina Logo is not Present.");
        LoginPageBase loginPageBase = homePageBase.clickNextButton();
        assertTrue(loginPageBase.isPageOpened(),"Login Page Content Forum is not Present.");
        loginPageBase.typeName("Ilia");
        loginPageBase.typePassword("Abcdefgh123");
        loginPageBase.selectGender(Gender.MALE);
        loginPageBase.checkPrivacyBox();
        CarinaPageBase carinaPageBase = loginPageBase.clickLoginButton();
        assertTrue(carinaPageBase.isPageOpened(),"Caring Page Content is not Present.");
    }
}
