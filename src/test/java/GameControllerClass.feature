Feature: Game Controller tests

  Scenario: Checking player movemnet
    Given I have GameBoard object
    And I have a player named "DOG" at position 0
    When "DOG" rolls dice and dice result is 7
    Then "DOG" is at position 7
