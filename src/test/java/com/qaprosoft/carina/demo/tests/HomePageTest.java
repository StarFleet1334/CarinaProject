package com.qaprosoft.carina.demo.tests;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui.testPages.HomePage;
import com.qaprosoft.carina.demo.gui.testPages.SearchInsight;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTest extends AbstractTest {


    @Test
    public void checkSearchButton() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        assertTrue(homePage.checkSearchButton(),"Search Button is not presented.");
    }


    @Test
    public SearchInsight clickSearchButton() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        SearchInsight searchInsight = homePage.PopUpSearch();
        return searchInsight;
    }

    @Test
    public void typeSearchTest() {
        SearchInsight searchInsight = clickSearchButton();
        searchInsight.typeInSearchArea("Iphone");

    }

    @Test
    public void openQuickLinkToAppleStoreFAQ() {
        SearchInsight searchInsight = clickSearchButton();
        searchInsight.openLinkToAppleStoreFAQ();
    }

    @Test
    public void openQuickLinkToGiftCards() {
        SearchInsight searchInsight = clickSearchButton();
        searchInsight.openLinkToGiftCards();
    }

    @Test
    public void openQuickLinkToAppleCare() {
        SearchInsight searchInsight = clickSearchButton();
        searchInsight.openLinkToAppleCare();
    }

    @Test
    public void openQuickLinkToAirTag() {
        SearchInsight searchInsight = clickSearchButton();
        searchInsight.openLinkToAirTag();
    }

    @Test
    public void openQuickLinkToAirPods() {
        SearchInsight searchInsight = clickSearchButton();
        searchInsight.openLinkToAirPods();
    }


}
