package com.qaprosoft.carina.demo.gui.testPages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"__aer_root__\"]/div/div[3]/div/div/div/div/div/div[2]/div/nav/ul/li[1]/div")
    private ExtendedWebElement homePageLoginBtn;

    public HomePage(WebDriver driver) {
        super(driver);
        setPageURL("https://aliexpress.ru/");
    }

    public boolean isLoginPresent() {
        return homePageLoginBtn.isElementPresent();
    }
}
