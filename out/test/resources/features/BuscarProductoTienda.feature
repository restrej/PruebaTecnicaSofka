@TestCompleto
Feature: Ingreso a la tienda de ropa y realizar una busqueda de productos

  Background:
    Given que un usuario ingreso a la página de inicio de tienda ropa

  @TestLogueo
  Scenario: Ingreso a la cuenta
    When lleno los datos requeridos para el cliente
      |Email|Passw|
      |restrej@gmail.com|restrej37|
    Then el cliente ingresa exitosamente a la cuenta

  @TestBuscar
  Scenario: Buscar el producto de Printed Dress
    When él busca la palabra de Printed Dress
    Then validar la cantidad de resultados sea menor o igual a cinco productos