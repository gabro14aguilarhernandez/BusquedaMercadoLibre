@tag
Feature: Búsqueda en mercado libre
  Se agrega como criterio de búsqueda el play station 5 y se obtienen los resultados
 
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
    
    
   