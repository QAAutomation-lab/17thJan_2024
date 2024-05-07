package stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class SouceDemoLoginTest extends SeleniumUtility{

	@And("^user clicks on login button of SouceDemo$")
	public void clickOnLoginButton() {
		clickOnElement(driver.findElement(By.id("login-button")));
	}
	
	@Then("^user should navigate to SouceDemo home page having URL as (.+)$")
	public void validateLogin(String expectedUrl) {
		String actualUrl=getCurrentUrlOfApplication();
		Assert.assertTrue(actualUrl.contains(expectedUrl));
	}
	
	@Given("^user is already in login page of SouceDemo$")
	public void user_is_already_in_login_page_of_SouceDemo() {
		setUp("chrome", "https://www.saucedemo.com/");
	}
	
	@When("^user enters a username as (.+) in SouceDemo$")
	public void enterUserName(String username) {
		typeInput(driver.findElement(By.id("user-name")), username);
	}
	@And("^user enters a password as (.+) in SouceDemo$")
	public void enterPassword(String password) {
		typeInput(driver.findElement(By.id("password")), password);
	}
	
}
