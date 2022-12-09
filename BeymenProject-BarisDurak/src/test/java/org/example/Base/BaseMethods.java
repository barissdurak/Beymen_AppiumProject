package org.example.Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class BaseMethods extends BaseTest {

    protected static Wait wait;

    public void clickById(String key) {
        appiumDriver.findElement(By.id(key)).click();
    }

    public void clickByXpath(String key) {
        appiumDriver.findElement(By.xpath(key)).click();
    }

    public void sendKeyById(String key, String text) {
        appiumDriver.findElement(By.id(key)).sendKeys(text);
    }

    public void sendEnterKey() {
        ((AndroidDriver) appiumDriver).pressKey(new KeyEvent(AndroidKey.SEARCH));
    }

    public void waitToElementId(String key) {
        wait = new FluentWait(appiumDriver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMillis(1050))
                .ignoring(NoSuchElementException.class)
                .ignoring(TimeoutException.class);
        wait.until(ExpectedConditions.elementToBeClickable
                (By.id(key)));
    }

    public void waitToXpath(String key) {
        wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath(key)));
    }

    public void doCheckBasket() {
        String check = appiumDriver.findElement(By.id("com.mobisoft.beymen:id/addToCartButton")).getText();
        assertTrue("Sepete ekle kontrol ediliyor!! ", check.contains("SEPETE EKLE"));
        Logger logger = LogManager.getLogger(BaseMethods.class);
        logger.info("'SEPETE EKLE' yazisi kontrol edildi");
    }


    public void doCheckLoginPage() {
        String check = appiumDriver.findElement(By.id("com.mobisoft.beymen:id/loginButton")).getText();
        assertTrue("'GİRİŞ YAPIN' yazisi kontrol ediliyor!! ", check.contains("GİRİŞ YAPIN"));
        Logger logger = LogManager.getLogger(BaseMethods.class);
        logger.info("'GİRİŞ YAPIN' yazisi kontrol edildi.");
    }
}

