package com.autoc0de.locators;

import com.core.utility.PropertyFileReader;

public class HomeLocators {
    public static final String BASE_URL = PropertyFileReader.getProperty("url");
    public static final String CATEGORIAS_BUTTON_ID = "ID:cat";

    public static final String LAPTOPS_CATEGORIA_BUTTON_XPATH = "XPATH://*[@id=\"itemc\" and contains(text(),'Laptops')]";

    public static final String PRODUCT_X_BY_LIST_XPATH = "//*[@id=\"tbodyid\"]/div[:number]/div/a";
}
