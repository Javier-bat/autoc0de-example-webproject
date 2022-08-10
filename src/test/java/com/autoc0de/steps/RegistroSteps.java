package com.autoc0de.steps;

import com.autoc0de.pages.HomePage;
import com.autoc0de.pages.NavbarPage;
import com.autoc0de.pages.RegistroPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegistroSteps {

    HomePage homePage = new HomePage();
    NavbarPage navbar = new NavbarPage();
    RegistroPage registroPage = new RegistroPage();

    @Given("El usuario esta en la pantalla home")
    public void theUserIsOnTheHomeScreen() {
        homePage.navigateToMainURL();
        homePage.verifyCategoriesButton();
    }

    @Then("El usuario presiona el boton de registro")
    public void theUserClickSignUpButton() {
        navbar.clickSignUp();
    }

    @And("Se visualiza el modal de registro")
    public void checkRegisterModalVisibility(){
        registroPage.checkVisibility();
    }

    @And("^El usuario ingresa username \"(.*)\" y password \"(.*)\"$")
    public void completeUsernameAndPassword(String username, String password) {
        registroPage.setUsername(username);
        registroPage.setPassword(password);
    }

    @Then("El usuario presiona 'Sign up' para completar el registro")
    public void theUserCompleteTheForm() {
        registroPage.clickSignUp();
    }

    @Then("Se visualiza una alerta de registro exitoso")
    public void checkSuccessfulPopup() throws InterruptedException {
        registroPage.checkSuccessfulPopup();
    }
}
