package com.qaprosoft.carina.demo.tests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui.testPages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTest extends AbstractTest {


    @Test
    public void checkHomePageLogin() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        assertTrue(homePage.isLoginPresent(),"Not Present");
    }
}
