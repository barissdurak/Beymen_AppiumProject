package org.example.Pages;

import org.example.Base.BaseMethods;
import org.example.Base.BaseTest;

public class StartPage extends BaseTest {

    BaseMethods baseMethods = new BaseMethods();

    public void clickCookies() {
        baseMethods.waitToElementId(Constants.COOKIES_BUTTON);
        baseMethods.clickById(Constants.COOKIES_BUTTON);
    }

    public void clickToSearch() {
        baseMethods.waitToXpath(Constants.SEARCH_BUTTON);
        baseMethods.clickByXpath(Constants.SEARCH_BUTTON);
    }
}