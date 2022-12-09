package org.example.Pages;

import org.example.Base.BaseMethods;
import org.example.Base.BaseTest;

public class SearchPage extends BaseTest {

    BaseMethods baseMethods = new BaseMethods();


    public void clickToSearchBar() {
        baseMethods.waitToElementId(Constants.SEARCH_BAR_BUTTON);
        baseMethods.clickById(Constants.SEARCH_BAR_BUTTON);
        baseMethods.sendKeyById(Constants.SEARCH_BAR_BUTTON, Constants.SEARCH_BAR_BUTTON_STRING);
        baseMethods.sendEnterKey();
        baseMethods.clickByXpath(Constants.SECOND_OPTION);
    }

    public void clickToFilter() {
        baseMethods.waitToElementId(Constants.FILTER_BUTTON);
        baseMethods.clickById(Constants.FILTER_BUTTON);

    }

    public void PickJean(){
        baseMethods.waitToXpath(Constants.URUN_CESIDI);
        baseMethods.clickByXpath(Constants.URUN_CESIDI);

        baseMethods.waitToElementId(Constants.SEARCH_JEAN_PANT);
        baseMethods.clickById(Constants.SEARCH_JEAN_PANT);
        baseMethods.sendKeyById(Constants.SEARCH_JEAN_PANT, Constants.JEAN_PANT_STRING);

        baseMethods.waitToXpath(Constants.JEAN_PANT);
        baseMethods.clickByXpath(Constants.JEAN_PANT);

        baseMethods.waitToElementId(Constants.URUNLERI_LISTELE);
        baseMethods.clickById(Constants.URUNLERI_LISTELE);

        baseMethods.waitToXpath(Constants.FIRST_PANT);
        baseMethods.clickByXpath(Constants.FIRST_PANT);

    }

}