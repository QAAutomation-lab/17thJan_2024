package stepdefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class TestOrangeHrmLogin extends SeleniumUtility{

	@Given("user is already in OrnageHRM login page")
	public void user_is_already_in_OrnageHRM_login_page() {
		setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@When("^user enters username as (.+)$")
	public void user_enters_username(String username) {
		typeInput(driver.findElement(By.name("username")), username);
	}
	
	@And("^user enters password as (.+)$")
	public void user_enters_password(String password) {
		typeInput(driver.findElement(By.name("password")), password);
	}
	
	@And("^user clicks on login button$")
	public void clickOnLoginButton() {
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
	}
	
	@Then("^user should reach to required page having url as (.+)$")
	public void validatePage(String target) {
		Assert.assertTrue(getCurrentUrlOfApplication().contains(target));
	}
}
