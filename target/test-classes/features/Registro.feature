Feature: Carolina Herrera - Funcionalidad de registro

  Scenario: Registro fallido - Usuario registrado previamente
    Given Accedemos a la home de CH
    When Acepto todas las cookies
    And Hago click en iniciar sesion
    And Pulso el boton de registrarse
    And Cubro el campo correo con uno ya registrado previamente
    And Cubro el campo de contraseña
    And Cubro el campo de confirmacion de contraseña
    And Acepto los terminos y condiciones
    And Hago click en el boton de nuevo cliente
    Then Deberia de aparecer un mensaje de error

  Scenario: Registro fallido - Campos vacios validacion mensajes de error
    Given Accedemos a la home de CH
    When Acepto todas las cookies
    And Hago click en iniciar sesion
    And Pulso el boton de registrarse
    And Hago click en el boton de nuevo cliente
    Then Deberian de aparecer mensajes de error

  Scenario: Registro correcto - Todos los campos cubiertos correctamente
    Given Accedemos a la home de CH
    When Acepto todas las cookies
    And Hago click en iniciar sesion
    And Pulso el boton de registrarse
    And Cubro el campo correo
    And Cubro el campo de contraseña
    And Cubro el campo de confirmacion de contraseña
    And Acepto los terminos y condiciones
    And Hago click en el boton de nuevo cliente
    Then Deberia de ser redirigido a la home y poder ver mi cuenta