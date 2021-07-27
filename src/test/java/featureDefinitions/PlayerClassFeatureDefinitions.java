package featureDefinitions;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import models.Player;

public class PlayerClassFeatureDefinitions {
	
	String token;
	int cash;
	int position;

	@Given("^the player token is \"([^\"]*)\"$")
	public void the_player_token_is(String token) throws Throwable {
		this.token = token;
	}

	@Given("^the player has cash (\\d+)$")
	public void the_player_has_cash(int cash) throws Throwable {
		this.cash = cash;
	}

	@Given("^the player position is (\\d+)$")
	public void the_player_position_is(int position) throws Throwable {
		this.position = position;
	}

	@Then("^create object and verify object initialization$")
	public void create_object_and_verify_object_initialization() throws Throwable {
	    Player player = new Player(cash, token, position);
	    assertEquals(cash, player.getCash());
	}
	
}
