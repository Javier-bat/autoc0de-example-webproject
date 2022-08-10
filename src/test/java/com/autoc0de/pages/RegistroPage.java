package com.autoc0de.pages;

import com.core.utility.MasterPage;
import org.testng.Assert;

import static com.autoc0de.locators.RegistroLocators.*;

public class RegistroPage extends MasterPage {

    public void checkVisibility(){
        Assert.assertTrue(auto_isElementVisible(TITLE_LABEL_ID));
        Assert.assertTrue(auto_isElementVisible(USERNAME_INPUT_ID));
        Assert.assertTrue(auto_isElementVisible(PASSWORD_INPUT_ID));
    }

    public void clickSignUp(){
        auto_setClickElement(SIGNUP_BUTTON_XPATH);
    }

    public void checkSuccessfulPopup() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(getDriver().switchTo().alert().getText(),SUCCESSFUL_TEXT);
    }

    public void setUsername(String username){
        auto_setTextToInput(USERNAME_INPUT_ID ,username);
    }
    public void setPassword(String password){
        auto_setTextToInput(PASSWORD_INPUT_ID ,password);
    }

}
