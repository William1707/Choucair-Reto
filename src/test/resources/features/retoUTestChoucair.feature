@stories
Feature: Academy choucair
  As a user I want to be able to register on the UTest platform applying the knowledge learned in the Choucair Academy
  @scenario1
  Scenario Outline: UTest registration page
    Given than William wants to register on the UTest platform


    When you fill out the registration form

    |strFirstName  | strLastName   | strEmail    | strMonth   | strDay     | strYear   | strCity    | strPostalCode   |
    |<strFirstName>| <strLastName> | <strEmail>  | <strMonth> | <strDay>   | <strYear> | <strCity>  |<strPostalCode>  |

    Then the new user will be created on the platform

    Examples:
      |strFirstName  | strLastName   | strEmail              | strMonth   | strDay    | strYear   | strCity   | strPostalCode |
      |William       | Moreno        | prueba3@hotmail.com   | July       |  17       | 2000      | Mosquera  |   11001      |