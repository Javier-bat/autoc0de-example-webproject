package com.autoc0de.pages;
import com.core.utility.MasterPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.autoc0de.locators.CartLocators.*;
import static com.autoc0de.locators.NavbarLocators.*;


public class CartPage extends MasterPage {
    public void clickCartNavbarButton(){
        auto_setClickElement(CART_BUTTON_XPATH);
    }
    public void checkListNotEmpty(){
        List<WebElement> listaCart = auto_getWebElements(PRODUCT_LIST_XPATH);
        Assert.assertEquals(listaCart.size(),1);
    }
}
