package featureDefinitions;

import controllers.GameController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.GameBoard;
import models.Player;

public class GameControllerFeatureDefinition {
	
	GameBoard gameBoard;
	Player player;
	GameController gameController = new GameController();
	
	int rolledDiceResult; 
	
	@Given("^I have GameBoard object$")
	public void i_have_GameBoard_object() throws Throwable {
		gameBoard = new GameBoard();
		gameBoard.addSquare("GO");
		gameBoard.addSquare("BALTIC");
		gameBoard.addSquare("INCOME TAX");
		gameBoard.addSquare("ORIENTAL AVENUE");
		gameBoard.addSquare("VERMONT AVENUE");
		gameBoard.addSquare("JAIL");
		gameBoard.addSquare("FREE PARKING");
		gameBoard.addSquare("KENTUCKY");
		gameBoard.addSquare("BOARDWALK");
		gameController.setGameBoard(gameBoard);
	}

	@Given("^I have a player named \"([^\"]*)\" at position (\\d+)$")
	public void i_have_a_player_named_at_position(String token, int index) throws Throwable {
		player = new Player(1500,token,index);
		gameController.addPlayer(player);
	}

	@When("^\"([^\"]*)\" rolls dice and dice result is (\\d+)$")
	public void rolls_dice_and_dice_result_is(String token, int diceResult) throws Throwable {
		rolledDiceResult = diceResult;
		
	}

	@Then("^\"([^\"]*)\" is at position (\\d+)$")
	public void is_at_position(String arg1, int arg2) throws Throwable {
		
	}

}
