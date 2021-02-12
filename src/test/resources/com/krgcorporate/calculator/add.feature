Feature: Add numbers with a Calculator
  As someone who is bad at math
  In order to not learn math
  I want to be able to add numbers using a Calculator

  Background:
    Given I have a Calculator

  Scenario Outline: Add a number two times in a row
    When I write <x>
    And I add <y>
    And I add <z>
    Then the result should be <sum>
    Examples:
      | x | y | z   | sum |
      | 1 | 1 | 1   | 3   |
      | 1 | 5 | 1   | 7   |
      | 1 | 2 | -1  | 2   |