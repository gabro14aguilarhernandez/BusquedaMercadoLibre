#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Búsqueda en mercado libre
  Se agrega como criterio de búsqueda el play station 5 y se obtienen los resultados

  @tag1Mercado
  Scenario: Iniciar sesion en Mercado Libre
    Given Ingresas al navegador Chrome 
    And Entras a la pagina de Mercado libre
    When Selecciona el país de compra
    And Ingresa y captura el usuario
    And captura la contraseña y inicia sesion
    Then Ingresa el criterio de búsqueda
    And Se inicia la busqueda
    And Se quita el popup de ingrese codigo postal
    When Selecciona el producto a comprar del resultado de busqueda
    And Dar clic en cantidad
    Then Selecciona la cantidad de cuatro productos
    And  Agregar al carrito de compra
    And Cierras el navegador
  
  @tag2MercadoTrescarrito
  Scenario: Iniciar sesion en Mercado Libre
    Given Ingresas al navegador Chrome 
    And Entras a la pagina de Mercado libre
    When Selecciona el país de compra
    And Ingresa y captura el usuario
    And captura la contraseña y inicia sesion
    Then Ingresa el criterio de búsqueda
    And Se inicia la busqueda
    And Se quita el popup de ingrese codigo postal
    When Selecciona el producto a comprar del resultado de busqueda
    And Dar clic en cantidad
    Then Selecciona la cantidad de tres productos
    And  Agregar al carrito de compra
    And Cierras el navegador
    
    
 @tagOutline
  Scenario Outline:  Iniciar sesion en Mercado Libre
    Given Ingresas al navegador Chrome 
    And Entras a la pagina de Mercado libre
    When Selecciona el país de compra
    And Ingresa y captura el usuario
    And captura la contraseña y inicia sesion
    Then Ingresa el criterio de búsqueda
    And Se inicia la busqueda
    And Se quita el popup de ingrese codigo postal
    When Selecciona el producto a comprar del resultado de busqueda
    And Dar clic en cantidad
    Then Selecciona la cantidad de productos "<cantidad>"
    And  Agregar al carrito de compra
    And Cierras el navegador

     Examples: 
      | cantidad  | 
      | 2 |
      | 1 | 
    
    
   