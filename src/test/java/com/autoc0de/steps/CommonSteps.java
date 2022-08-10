package com.autoc0de.steps;

import com.autoc0de.pages.NavbarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CommonSteps {
    @And("La navbar se muestra correctamente")
    public void CheckNavbarVisibility(){
        NavbarPage navbarPage = new NavbarPage();
        navbarPage.verifyNavbarButtons();
    }

}
