package stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class OrangeHRMLoginTest extends SeleniumUtility{
	@Given("user already opened Web browser and having login page opened")
	public void user_already_opened_web_browser_and_having_login_page_opened() {	  
	   setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("user enters valid username as {string}")
	public void user_enters_valid_username_as(String username) {
	  typeInput(driver.findElement(By.name("username")), username);	   
	}

	@And("user enters valid password as {string}")
	public void user_enters_valid_password_as(String password) {
		typeInput(driver.findElement(By.name("password")), password); 	   
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
	  clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));	   
	}

	@Then("user should navigate to Orange HRM home page having {string} in URL")
	public void user_should_navigate_to_orange_hrm_home_page_having_in_url(String expected) {	  
	   String actualHomePageUrl=getCurrentUrlOfApplication();
	   Assert.assertTrue(actualHomePageUrl.contains(expected));
	}

	@And("user closed the browser")
	public void user_closed_the_browser() {
	  driver.close();	   
	}
}
