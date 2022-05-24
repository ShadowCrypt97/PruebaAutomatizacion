#Autor: Sergio Andres Gomez Roa

  @HistoriaDeUsuario
  Feature: Verificar la creación de un nuevo PC en la tabla


  @CasoCreacionPcCorrecta
  Scenario:

    Given El usuario quiere agregar un nuevo computador
    When Seleccione la opción agregar nuevo computador
    And ingrese el nombre, fecha introduced, discontinued con el formato (AAAA,MM,DD) y compañía
    And de clic en el botón "Crear this computer"
    Then Sera direccionado al home y el nuevo PC quedara registrado