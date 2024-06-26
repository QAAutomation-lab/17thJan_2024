package api.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.UserEndPoints;
import api.endpoints.UserEndPointsWithPropertyFile;
import api.payload.User;
import io.restassured.response.Response;

public class UserTests2 {

	Faker faker;
	User userPayload;

	@BeforeClass
	public void setup() {
		faker = new Faker();
		userPayload = new User();
		userPayload.setId(faker.idNumber().hashCode());
		userPayload.setUsername(faker.name().username());
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());
		userPayload.setPassword(faker.internet().password(5, 10));
		userPayload.setPhone(faker.phoneNumber().cellPhone());
	}

	@Test(priority = 1)
	public void testPostUser() {
		Response response = UserEndPointsWithPropertyFile.createUser(userPayload);
		Assert.assertEquals(response.getStatusCode(), 200);
	}

	@Test(priority = 2)
	public void testGetUserByName() {
		Response response = UserEndPointsWithPropertyFile.readUser(this.userPayload.getUsername());
		Assert.assertEquals(response.getStatusCode(), 200);

	}

	@Test(priority = 3)
	public void testUpdateUserByName() {
		// update data using payload
		userPayload.setFirstName(faker.name().firstName());
		userPayload.setLastName(faker.name().lastName());
		userPayload.setEmail(faker.internet().safeEmailAddress());

		Response response = UserEndPointsWithPropertyFile.updateUser(this.userPayload.getUsername(), userPayload);
		//use below line if you want to check something while execution
		//response.then().log().body();
		Assert.assertEquals(response.getStatusCode(), 200);

		// Checking data after update
		Response responseAfterupdate = UserEndPointsWithPropertyFile.readUser(this.userPayload.getUsername());
		Assert.assertEquals(responseAfterupdate.getStatusCode(), 200);

	}

	@Test(priority = 4)
	public void testDeleteUserByName() {

		Response response = UserEndPointsWithPropertyFile.deleteUser(this.userPayload.getUsername());
		Assert.assertEquals(response.getStatusCode(), 200);

	}

}
