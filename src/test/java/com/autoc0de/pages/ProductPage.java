package com.autoc0de.pages;

import com.core.utility.MasterPage;
import org.testng.Assert;

import static com.autoc0de.locators.PorductLocators.*;


public class ProductPage extends MasterPage {

    public void addToCart(){
        auto_setClickElement(ADD_TO_CART_BUTTON_XPATH);
    }
    public void checkSuccessAlert() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(getDriver().switchTo().alert().getText(),SUCCESS_ALERT_TEXT);
        getDriver().switchTo().alert().accept();
    }


}
