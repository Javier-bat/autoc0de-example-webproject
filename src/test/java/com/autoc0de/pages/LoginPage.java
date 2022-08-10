package com.autoc0de.pages;

import com.autoc0de.locators.LoginLocators;
import com.autoc0de.locators.NavbarLocators;
import com.core.utility.MasterPage;
import org.testng.Assert;

import static com.autoc0de.locators.LoginLocators.*;
import static com.autoc0de.locators.NavbarLocators.*;


public class LoginPage extends MasterPage {

    public void clickLogin(){
        auto_setClickElement(LoginLocators.LOGIN_BUTTON_XPATH);
    }
    public void completeUsername(String username){
        auto_setTextToInput(USERNAME_INPUT_ID, username);
    }
    public void completePassword(String password){
        auto_setTextToInput(PASSWORD_INPUT_ID, password);
    }
    public void checkVisibility(){
        Assert.assertTrue(auto_isElementVisible(TITLE_LABEL_ID));
    }
    public void checkLoggedin(){
        auto_waitForElementVisibility(LOGOUT_BUTTON_ID);
        Assert.assertTrue(auto_isElementVisible(LOGOUT_BUTTON_ID));
        Assert.assertTrue(auto_isElementVisible(WELCOME_MESSAGE_LABE_ID));

    }
    public void checkLoggedOut(){
        auto_waitForElementVisibility(NavbarLocators.LOGIN_BUTTON_XPATH);
        Assert.assertTrue(auto_isElementVisible(NavbarLocators.LOGIN_BUTTON_XPATH));
    }
}
