package com.qaprosoft.carina.demo.gui.testPages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"ac-gn-link-search\"]")
    private ExtendedWebElement searchButton;


    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("https://www.apple.com/");
    }


    public boolean checkSearchButton() {
        return searchButton.isElementPresent();
    }


    public SearchInsight PopUpSearch() {
        searchButton.click();
        return new SearchInsight(getDriver());
    }




}
