package com.qaprosoft.carina.demo.gui.testPages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.testPages.products.AppleWatch;
import com.qaprosoft.carina.demo.gui.testPages.products.Ipad;
import com.qaprosoft.carina.demo.gui.testPages.products.Iphone;
import com.qaprosoft.carina.demo.gui.testPages.products.MacBook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class StorePage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"shelf-1_section\"]/div/div[1]/div/div/div[1]/div/div/div")
    private ExtendedWebElement macPage;

    @FindBy(xpath = "//*[@id=\"shelf-1_section\"]/div/div[1]/div/div/div[2]/div/div/div")
    private ExtendedWebElement iphonePage;

    @FindBy(xpath = "//*[@id=\"shelf-1_section\"]/div/div[1]/div/div/div[3]/div/div/div")
    private ExtendedWebElement iPadPage;

    @FindBy(xpath = "//*[@id=\"shelf-1_section\"]/div/div[1]/div/div/div[4]/div/div/div")
    private ExtendedWebElement appleWatchPage;

    public StorePage(WebDriver driver) {
        super(driver);
        setPageURL("https://www.apple.com/store");
    }

    public MacBook clickMacPage() {
        macPage.click();
        return new MacBook(getDriver());
    }


    public Iphone clickIphonePage() {
        iphonePage.click();
        return new Iphone(getDriver());
    }


    public Ipad clickIpadPage() {
        iPadPage.click();
        return new Ipad(getDriver());
    }


    public AppleWatch clickAppleWatchPage() {
        appleWatchPage.click();
        return new AppleWatch(getDriver());
    }


}
