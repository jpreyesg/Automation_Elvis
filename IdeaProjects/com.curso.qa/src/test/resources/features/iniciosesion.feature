Feature: Inicio de Sesion
  Yo como usuario registrado
  Necesito iniciar sesion
  Para poder gestionar mi portal web

  Scenario: Automatizar el inicio de sesion

    Given El se encuentra el la zona de inicio de sesion

    When El completa el registro con la informacion requerida por el formulario
      |username|email|password|
      |rocci|roccoci@gmail.com|Rocco124@|
    Then El deberia poder ver la pagina principal de login logeado