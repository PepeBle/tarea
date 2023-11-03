Feature: Yo como usuario,
  Quiero realizar una busqueda en Google

  Background: Ingresamos URL
    Given Abrir Google Chrome

  @selenide
  Scenario Outline: Realizamos una busqueda en Google
    When Realizar busqueda
      | <inputUsername> |

    Examples:
      | inputUsername  |
      | selenide     |