Feature: Carolina Herrera - Funcionalidad de la Home

  Scenario: CH Footer - Instagram
    Given Accedemos a la web de CH
    When Aceptamos todas las cookies
    And Hacemos click en el enlace de Instagram en el footer
    Then Somos redirigidos a Instagram

  Scenario: CH Footer - Facebook
    Given Accedemos a la web de CH
    When Aceptamos todas las cookies
    And Hacemos click en el enlace de Facebook en el footer
    Then Somos redirigidos a Facebook

  #Actualmente no aparece Twitter en el footer
  #Scenario: CH Footer - X
    #Given Accedemos a la web de CH
    #When Aceptamos todas las cookies
    #And Hacemos click en el enlace de X en el footer
    #Then somos redirigidos a X


  Scenario: CH Footer - Youtube
    Given Accedemos a la web de CH
    When Aceptamos todas las cookies
    And Hacemos click en el enlace de Youtube en el footer
    Then somos redirigidos a Youtube

  Scenario: CH Footer - Atencion al cliente
    Given Accedemos a la web de CH
    When Aceptamos todas las cookies
    And Hacemos click en atencion al cliente y no cubrimos todos los datos
    Then Se muestran mensajes de error de informacion obligatoria


  Scenario: CH Footer - Politica de privacidad
    Given Accedemos a la web de CH
    When Aceptamos todas las cookies
    And Hacemos click en politica de privacidad
    Then Se abre el pop up de la politica de privacidad

  Scenario: CH Footer - Terminos y condiciones de venta
    Given Accedemos a la web de CH
    When Aceptamos todas las cookies
    And Hacemos click en terminos y condiciones de venta
    Then Se abre el pop up de terminos y condiciones de venta

  Scenario: CH Footer - Terminos y condiciones de uso
    Given Accedemos a la web de CH
    When Aceptamos todas las cookies
    And Hacemos click en terminos y condiciones de uso
    Then Se abre el pop up de terminos y condiciones de uso