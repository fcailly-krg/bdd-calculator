Feature: Reset the result of a Calculator
  As someone who is bad at math
  In order to not learn math
  I want to be able to reset the result of a Calculator

  Background:
    Given I have a Calculator

  Scenario: Reset the calculator
    Given The current result is 145.14
    When I reset the calculator
    Then the result should be 0