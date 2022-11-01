package com.qaprosoft.carina.demo.gui.testPages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedFindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.testPages.products.AppleProducts;
import com.qaprosoft.carina.demo.gui.testPages.quickLinks.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchInsight extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"defaultlinks\"]/li[1]/a")
    private ExtendedWebElement appleStoreFaq;

    @FindBy(xpath = "//*[@id=\"defaultlinks\"]/li[2]/a")
    private ExtendedWebElement airPods;

    @FindBy(xpath = "//*[@id=\"defaultlinks\"]/li[3]/a")
    private ExtendedWebElement airTag;

    @FindBy(xpath = "//*[@id=\"defaultlinks\"]/li[4]/a")
    private ExtendedWebElement appleCar;

    @FindBy(xpath = "//*[@id=\"defaultlinks\"]/li[5]/a")
    private ExtendedWebElement giftCards;

    @FindBy(xpath = "//*[@id=\"ac-gn-searchform-input\"]")
    private ExtendedWebElement searchArea;

    @FindBy(xpath = "//*[@id=\"ac-gn-searchform-submit\"]")
    private ExtendedWebElement searchButton;

    public SearchInsight(WebDriver driver) {
        super(driver);
    }


    public void typeInSearchArea(AppleProducts product) {
        searchArea.type(product.getName());
        searchButton.click();
    }

    public AppleStoreFAQ openLinkToAppleStoreFAQ() {
        appleStoreFaq.click();
        return new AppleStoreFAQ(getDriver());
    }


    public AirPods openLinkToAirPods() {
        airPods.click();
        return new AirPods(getDriver());
    }

    public AirTag openLinkToAirTag() {
        airTag.click();
        return new AirTag(getDriver());
    }

    public AppleCare openLinkToAppleCare() {
        appleCar.click();
        return new AppleCare(getDriver());
    }

    public GiftCards openLinkToGiftCards() {
        giftCards.click();
        return new GiftCards(getDriver());
    }

}
