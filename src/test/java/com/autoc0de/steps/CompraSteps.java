package com.autoc0de.steps;

import com.autoc0de.pages.CartPage;
import com.autoc0de.pages.HomePage;
import com.autoc0de.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompraSteps {
    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();
    @When("El usuario presiona la categoria 'Laptops'")
    public void clickLaptopsCat(){
        homePage.clickLaptopCategorie();
    }

    @And("^El usuario presiona el resultado numero \"(.*)\"$")
    public void clickXFromList(int number) {
        homePage.clickProductXFromList(number);
    }

    @And("El usuario agrega el producto al carrito")
    public void elUsuarioAgregaElProductoAlCarrito() {
        productPage.addToCart();
    }

    @And("Se visualiza una alerta de exito")
    public void checkSuccessAlert() throws InterruptedException {
        productPage.checkSuccessAlert();
    }

    @Then("El usuario presiona el boton 'Cart' en la navbar")
    public void pressCart() {
        cartPage.clickCartNavbarButton();
    }
    @Then("El producto se agrego correctamente")
    public void checkCartListNotEmpty(){
        cartPage.checkListNotEmpty();
    }
}
