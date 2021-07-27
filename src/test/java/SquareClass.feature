Feature: Test Square class

  Scenario Outline: Title of your scenario
    Given I have a square object
    When I set square name <name>
    Then the name perperty should be <expectedName>

    Examples: 
      | name           | expectedName   |
      | "JAIL"         | "JAIL"         |
      | "GO"           | "GO"           |
      | "FREE PARKING" | "FREE PARKING" |
