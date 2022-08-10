Feature: Compra de producto

  Background:
    Given El usuario esta en la pantalla home
    And La navbar se muestra correctamente

  @addLaptopToCart @Smoke
  Scenario: Agregar y verificar productos en carrito
    When El usuario presiona la categoria 'Laptops'
    And El usuario presiona el resultado numero "1"
    And El usuario agrega el producto al carrito
    And Se visualiza una alerta de exito
    Then El usuario presiona el boton 'Cart' en la navbar
    Then El producto se agrego correctamente
