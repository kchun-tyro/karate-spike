Feature: Hello World

  Background:
    Given url baseUrl
    Given path '/get'

  Scenario: Hello world

    When method GET
    Then status 200
