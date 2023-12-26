Feature: Carolina Herrera - Funcionalidad de Login

  Scenario: Login incorrecto - Campos vacios
    Given Accedemos a la web de CH
    When Aceptamos todas las cookies
    And Hacemos click en iniciar sesion
    And Hacemos click en iniciar sesion pop up
    Then Se debe mostrar un error de campos obligatorios


  Scenario: Login incorrecto -  Campo email incorrecto contraseña incorrecta
    Given Accedemos a la web de CH
    When Aceptamos todas las cookies
    And Hacemos click en iniciar sesion
    And Escribimos el correo incorrectamente
    And Escribimos contraseña incorrecta
    And Hacemos click en iniciar sesion pop up
    Then Se debe mostrar un error de inicio de sesion erroneo

  Scenario: Login incorrecto -  Campo email corecto contraseña incorrecta
    Given Accedemos a la web de CH
    When Aceptamos todas las cookies
    And Hacemos click en iniciar sesion
    And Escribimos el correo correctamente
    And Escribimos contraseña incorrecta
    And Hacemos click en iniciar sesion pop up
    Then Se debe mostrar un error de inicio de sesion erroneo

  Scenario: Login correcto - Campo email correcto, contraseña correcta
    Given Accedemos a la web de CH
    When Aceptamos todas las cookies
    And Hacemos click en iniciar sesion
    And Escribimos el correo correctamente
    And Escribimos contraseña correctamente
    And Hacemos click en iniciar sesion pop up
    Then Somos redirigidos a la home y estamos con la sesion iniciada

  Scenario: Restablecer Contraseña - Correctamente
    Given Accedemos a la web de CH
    When Aceptamos todas las cookies
    And Hacemos click en iniciar sesion
    And Hacemos click ha olvidado su contraseña
    And Cubrimos el correo
    And Hacemos click en restaurar contraseña
    Then Nos salta una alerta para restablecer la contraseña


  Scenario: Restablecer Contraseña - Incorrectamente
    Given Accedemos a la web de CH
    When Aceptamos todas las cookies
    And Hacemos click en iniciar sesion
    And Hacemos click ha olvidado su contraseña
    And Hacemos click en volver
    And Hacemos click ha olvidado su contraseña
    And Cubrimos el correo incorrectamente
    And Hacemos click en restaurar contraseña
    Then Error de que el correo no existe
