package com.qaprosoft.carina.demo.tests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui.testPages.StorePage;
import com.qaprosoft.carina.demo.gui.testPages.products.AppleWatch;
import com.qaprosoft.carina.demo.gui.testPages.products.Ipad;
import com.qaprosoft.carina.demo.gui.testPages.products.Iphone;
import com.qaprosoft.carina.demo.gui.testPages.products.MacBook;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class StorePageTest extends AbstractTest {


    // Works
    @Test
    public void checkMacPage() {
        StorePage storePage = new StorePage(getDriver());
        storePage.open();
        MacBook macBook = storePage.clickMacPage();
        assertTrue(macBook.isMacBookTagPresent(),"MacBook Tag is no Present.");
    }

    // Works
    @Test
    public void checkIphonePage() {
        StorePage storePage = new StorePage(getDriver());
        storePage.open();
        Iphone iphone = storePage.clickIphonePage();
        assertTrue(iphone.isIphoneTagPresent(),"Iphone Tag is no Present.");
    }

    // Works
    @Test
    public void checkAppleWatchPage() {
        StorePage storePage = new StorePage(getDriver());
        storePage.open();
        AppleWatch appleWatch = storePage.clickAppleWatchPage();
        assertTrue(appleWatch.isAppleWatchTagPresent(),"AppleWatch Tag is no Present.");
    }

    // Works
    @Test
    public void checkIpadPage() {
        StorePage storePage = new StorePage(getDriver());
        storePage.open();
        Ipad ipad = storePage.clickIpadPage();
        assertTrue(ipad.isIpadTagPresent(),"Ipad Tag is no Present.");
    }
}
