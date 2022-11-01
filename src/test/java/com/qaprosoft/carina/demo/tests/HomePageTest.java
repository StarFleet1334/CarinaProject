package com.qaprosoft.carina.demo.tests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui.testPages.HomePage;
import com.qaprosoft.carina.demo.gui.testPages.SearchInsight;
import com.qaprosoft.carina.demo.gui.testPages.products.AppleProducts;
import com.qaprosoft.carina.demo.gui.testPages.quickLinks.*;
import org.testng.annotations.Test;



import static org.testng.Assert.assertTrue;

public class HomePageTest extends AbstractTest {

    // Works
    @Test
    public void checkSearchButton() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        assertTrue(homePage.checkSearchButton(),"Search Button is not presented.");
    }



    public SearchInsight clickSearchButton() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        SearchInsight searchInsight = homePage.PopUpSearch();
        return searchInsight;
    }

    // Works
    @Test
    public void typeSearchTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        SearchInsight searchInsight = homePage.PopUpSearch();
        searchInsight.typeInSearchArea(AppleProducts.IPAD);
    }


    // Works
    @Test
    public void openQuickLinkToAppleStoreFAQ() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        SearchInsight searchInsight = homePage.PopUpSearch();
        AppleStoreFAQ appleStoreFAQ = searchInsight.openLinkToAppleStoreFAQ();
        assertTrue(appleStoreFAQ.isTopicBarLoaded(),"AppleStoreFAQ Bar Not Present.");
    }

    // Works
    @Test
    public void openQuickLinkToGiftCards() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        SearchInsight searchInsight = homePage.PopUpSearch();
        GiftCards giftCards = searchInsight.openLinkToGiftCards();
        assertTrue(giftCards.isNavBarLoaded(),"GiftCards Nav bar is not Present.");
    }


    // Works
    @Test
    public void openQuickLinkToAppleCare() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        SearchInsight searchInsight = homePage.PopUpSearch();
        AppleCare appleCare = searchInsight.openLinkToAppleCare();
        assertTrue(appleCare.isAppleCareNavBarLoaded(),"AppleCare Nav bar is not Present.");
    }

    // Works
    @Test
    public void openQuickLinkToAirTag() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        SearchInsight searchInsight = homePage.PopUpSearch();
        AirTag airTag = searchInsight.openLinkToAirTag();
        assertTrue(airTag.isAirTagNavBarLoaded(),"AirTag Nav bar is not Present.");
    }

    @Test
    public void openQuickLinkToAirPods() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        SearchInsight searchInsight = homePage.PopUpSearch();
        AirPods airPods = searchInsight.openLinkToAirPods();
        assertTrue(airPods.isAirPodsNavBarLoaded(),"AirPods Nav bar is not Present.");
    }





}
