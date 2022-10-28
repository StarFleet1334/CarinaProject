package com.qaprosoft.carina.demo.tests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui.testPages.StorePage;
import org.testng.annotations.Test;

public class StorePageTest extends AbstractTest {


    // Works
    @Test
    public void checkMacPage() {
        StorePage storePage = new StorePage(getDriver());
        storePage.open();
        storePage.clickMacPage();
    }

    // Works
    @Test
    public void checkIphonePage() {
        StorePage storePage = new StorePage(getDriver());
        storePage.open();
        storePage.clickIphonePage();
    }

    // Works
    @Test
    public void checkAppleWatchPage() {
        StorePage storePage = new StorePage(getDriver());
        storePage.open();
        storePage.clickAppleWatchPage();
    }

    // Works
    @Test
    public void checkIpadPage() {
        StorePage storePage = new StorePage(getDriver());
        storePage.open();
        storePage.clickIpadPage();
    }
}
