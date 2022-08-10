Feature: Login de usuario demoblaze

  Background:
    Given El usuario esta en la pantalla home
    And La navbar se muestra correctamente

  @loginlogoutOK @Smoke
  Scenario: Login y logout exitoso
    When El usuario presiona el boton login
    And Se visualiza el modal de login
    And El usuario completa con username "test" y password "test"
    And Presiona el boton para completar el 'login'
    Then El login se realiza correctamente
    And El usuario presiona 'logout'
    Then El usuario no esta logeado
