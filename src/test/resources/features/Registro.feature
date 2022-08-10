 Feature: Registro de usuario demoblaze

   Background:
     Given El usuario esta en la pantalla home
     And La navbar se muestra correctamente

  @registroOk @smoke
  Scenario: Registro de usuario demoblaze - Exitoso
    When El usuario presiona el boton de registro
    And Se visualiza el modal de registro
    And El usuario ingresa username "test09082023" y password "test09082023"
    Then El usuario presiona 'Sign up' para completar el registro
    Then Se visualiza una alerta de registro exitoso