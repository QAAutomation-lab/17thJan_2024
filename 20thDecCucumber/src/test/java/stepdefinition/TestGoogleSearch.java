package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class TestGoogleSearch extends SeleniumUtility{

	@Given("user is already in google search page")
	public void user_is_already_in_google_search_page() {
	    setUp("chrome", "https://www.google.com");
	}
	@Then("user should be able to see google search page with title having {string}")
	public void user_should_be_able_to_see_google_search_page_with_title_having(String string) {
	  String expectedTitle=getCurrentTitleOfApplication();
	  Assert.assertTrue(expectedTitle.contains(string));
	}
	@When("user types {string} in the search input field and press enter button")
	public void user_types_in_the_search_input_field_and_press_enter_button(String string) {
	   typeInput(driver.findElement(By.name("q")), string);
	   getActiveElementFromUI().sendKeys(Keys.ENTER);
	}
	
	@And("user close the browser")
	public void closeBrowser() {
		driver.close();
	}
}
