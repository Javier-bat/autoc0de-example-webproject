package com.autoc0de.pages;

import static com.autoc0de.locators.HomeLocators.*;

import com.core.utility.MasterPage;
import org.testng.Assert;


public class HomePage extends MasterPage{
    public void navigateToMainURL(){
        auto_openURLInBrowser(BASE_URL);
    }

    public void verifyCategoriesButton(){
        Assert.assertTrue(auto_isElementVisible(CATEGORIAS_BUTTON_ID));
    }

    public void clickLaptopCategorie(){
        auto_setClickElement(LAPTOPS_CATEGORIA_BUTTON_XPATH);
    }

    public void clickProductXFromList(int productNumber){
        auto_setClickElement(PRODUCT_X_BY_LIST_XPATH.replace(":number",productNumber+""));
    }



}
