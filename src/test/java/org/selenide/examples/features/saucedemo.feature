Feature: Yo como usuario,
  quiero realizar un a compra

  Background: Ingresamos URL
    Given Ingresamos a Saucedemo

  @selenide
  Scenario Outline: Iniciamos sesion y realizamos una compra
    When Iniciamos sesion
      | <username> | <password> |
    When Realizar compra
      | <FirstName> | <LastName> | <PostalCode> |

    And Esperamos cingo segundos


    Examples:
      | username       | password    | FirstName | LastName | PostalCode |
      | standard_user  | secret_sauce| Pepe      | Ble      | 04400      |