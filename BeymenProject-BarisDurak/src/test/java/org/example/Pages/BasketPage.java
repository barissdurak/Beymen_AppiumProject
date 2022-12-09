package org.example.Pages;

import org.example.Base.BaseMethods;
import org.example.Base.BaseTest;

public class BasketPage extends BaseTest {

    BaseMethods baseMethods = new BaseMethods();
    public void checkToBasket(){
        baseMethods.waitToElementId(Constants.CHECK_BASKET);
        baseMethods.doCheckBasket();
    }

    public void AddFavorites(){
        baseMethods.waitToElementId(Constants.FAVORITES_BUTTON);
        baseMethods.clickById(Constants.FAVORITES_BUTTON);
    }
    public void LoginPageCheck(){
        baseMethods.waitToElementId(Constants.LOGIN_PAGE_CHECK);
        baseMethods.doCheckLoginPage();
    }
}
