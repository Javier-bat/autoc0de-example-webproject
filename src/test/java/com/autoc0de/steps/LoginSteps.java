package com.autoc0de.steps;

import com.autoc0de.pages.LoginPage;
import com.autoc0de.pages.NavbarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    NavbarPage navbar = new NavbarPage();

    @When("El usuario presiona el boton login")
    public void theUserClickLogin() {
        navbar.clicklogin();
    }

    @And("Se visualiza el modal de login")
    public void checkLoginModalVisibility() {
        loginPage.checkVisibility();
    }

    @And("^El usuario completa con username \"(.*)\" y password \"(.*)\"$")
    public void completeLoginModal(String username, String password) {
        loginPage.completeUsername(username);
        loginPage.completePassword(password);
    }

    @And("Presiona el boton para completar el 'login'")
    public void clickLoginToCompleteLogin() {
        loginPage.clickLogin();
    }

    @Then("El login se realiza correctamente")
    public void checkSuccessfulLogin() {
        loginPage.checkLoggedin();

    }

    @And("El usuario presiona 'logout'")
    public void clickLogoutButton() {
        navbar.clickLogout();
    }

    @Then("El usuario no esta logeado")
    public void checkLogout() {
        loginPage.checkLoggedOut();
    }
}
