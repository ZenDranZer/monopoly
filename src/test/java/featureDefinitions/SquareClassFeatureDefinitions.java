package featureDefinitions;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Square;

public class SquareClassFeatureDefinitions {

	private Square square;
	
	@Given("^I have a square object$")
	public void i_have_a_square_class() throws Throwable {
		square = new Square();
	}

	@When("^I set square name \"([^\"]*)\"$")
	public void i_set_square_name(String squareName) throws Throwable {
		square.setName(squareName);
	}

	@Then("^the name perperty should be \"([^\"]*)\"$")
	public void the_name_perperty_should_be(String expected) throws Throwable {
		assertEquals(expected,square.getName());
	}

}
