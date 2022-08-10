package com.autoc0de.pages;

import com.core.utility.MasterPage;
import org.testng.Assert;
import static com.autoc0de.locators.NavbarLocators.*;

public class NavbarPage extends MasterPage {
    public void verifyNavbarButtons(){
        Assert.assertTrue(auto_isElementVisible(LOGO_NAVBAR_ID));
        Assert.assertTrue(auto_isElementVisible(HOME_BUTTON_XPATH));
        Assert.assertTrue(auto_isElementVisible(LOGIN_BUTTON_XPATH));
        Assert.assertTrue(auto_isElementVisible(SIGNUP_BUTTON_XPATH));
        Assert.assertTrue(auto_isElementVisible(CART_BUTTON_XPATH));
    }
    public void clickSignUp(){
        auto_setClickElement(SIGNUP_BUTTON_XPATH);
    }
    public void clicklogin(){
        auto_setClickElement(LOGIN_BUTTON_XPATH);
    }
    public void clickLogout(){
        auto_setClickElement(LOGOUT_BUTTON_ID);
    }
}
