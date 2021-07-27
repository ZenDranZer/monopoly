package featureDefinitions;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.GameBoard;

public class GameBoardClassDefinition {

	
	private GameBoard gameBoard;
	
	@Given("^I have a gameboard object$")
	public void i_have_a_gameboard_object() throws Throwable {
		gameBoard = new GameBoard();
	}

	@When("^I add Square \"([^\"]*)\" object$")
	public void i_add_Square_object(String name) throws Throwable {
		gameBoard.addSquare(name);
	}

	@Then("^at (\\d+) position of gameboard I should get \"([^\"]*)\"$")
	public void at_position_of_gameboard_I_should_get(int index, String expected) throws Throwable {
		assertEquals(expected, gameBoard.getSquareAtIndex(index-1).getName());
	}

}
