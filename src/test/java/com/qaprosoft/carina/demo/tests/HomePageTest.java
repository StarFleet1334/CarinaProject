package com.qaprosoft.carina.demo.tests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui.testPages.HomePage;
import com.qaprosoft.carina.demo.gui.testPages.SearchInsight;
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
        searchInsight.typeInSearchArea("Iphone");
    }


    // Works
    @Test
    public void openQuickLinkToAppleStoreFAQ() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        SearchInsight searchInsight = homePage.PopUpSearch();
        searchInsight.openLinkToAppleStoreFAQ();
    }

    // Works
    @Test
    public void openQuickLinkToGiftCards() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        SearchInsight searchInsight = homePage.PopUpSearch();
        searchInsight.openLinkToGiftCards();
    }


    // Works
    @Test
    public void openQuickLinkToAppleCare() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        SearchInsight searchInsight = homePage.PopUpSearch();
        searchInsight.openLinkToAppleCare();
    }

    // Works
    @Test
    public void openQuickLinkToAirTag() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        SearchInsight searchInsight = homePage.PopUpSearch();
        searchInsight.openLinkToAirTag();
    }

    @Test
    public void openQuickLinkToAirPods() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        SearchInsight searchInsight = homePage.PopUpSearch();
        searchInsight.openLinkToAirPods();
    }




}
