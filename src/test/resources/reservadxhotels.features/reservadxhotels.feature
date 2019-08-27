#Author: hamtont@gmail.com

@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: reserva economica hotel en london
    Given que el usuario se encuentre en el portal de reserva dxhotels
    When el usuario ingresa sus datos para reserva
      | location | fechacheckIn | fechacheckOut |
      | Paris    | 9/5/2019     | 9/15/2019     |
    And selecciono precio mas economico
    Then el debera visualizar el valor total pagado correcto


