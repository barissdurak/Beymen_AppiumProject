package org.example;

import com.thoughtworks.gauge.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.example.Pages.BasketPage;
import org.example.Pages.SearchPage;
import org.example.Pages.StartPage;

public class StepImplementation {
    Logger logger;

    public StepImplementation() {
        logger = LogManager.getLogger(StepImplementation.class);
    }

    StartPage startPage = new StartPage();
    SearchPage searchPage = new SearchPage();
    BasketPage basketPage = new BasketPage();


    // Start Page
    @Step("Pop-uplar kabul edilir")
    public void clickCookies() {
        startPage.clickCookies();
        logger.info("Pop-up kabul edildi");
    }

    @Step("Search butonuna Tiklanir")
    public void clickToSearch() {
        startPage.clickToSearch();
        logger.info("Search butonuna basıldı");
    }

    // Search Page
    @Step("Search Bara tıkla ve 'Pantolon' aratilir")
    public void clickToSearchBar() {
        searchPage.clickToSearchBar();
        logger.info("Pantalon aratildi");
    }

    @Step("Filtre secilir")
    public void clickToFilter() {
        searchPage.clickToFilter();
        logger.info("filtre secildi");
    }

    @Step("Jean Pantalon aratilir ve birinci secenek secilir")
    public void PickJean() {
        searchPage.PickJean();
        logger.info("filtre secildi");
    }


    @Step("'Sepete Ekle' Butonu kontrol edilir")
    public void check() {
        basketPage.checkToBasket();
        logger.info("kontrol başarılı");
    }

    //Basket Page
    @Step("Favorilere eklendi")
    public void AddFavorites() {
        basketPage.AddFavorites();
        logger.info("Favorilere eklendi");
    }

    @Step("Login sayfasinin geldigi kontrol edilir")
    public void LoginPageCheck() {
        basketPage.LoginPageCheck();
        logger.info("Login sayfasi kontrol başarılı");
    }

}
