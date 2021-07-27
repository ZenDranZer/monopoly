
Feature: To test GameBoard class

Scenario: To add one value to the game board
Given I have a gameboard object
When I add Square "JAIL" object
And I add Square "GO" object
And I add Square "FREE PARKING" object
Then at 2 position of gameboard I should get "GO"
