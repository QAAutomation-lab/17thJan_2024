package day3.browseropsAndValidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ColorAndPosition2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://online.actitime.com/tcs/login.do");
		
		//login button
		driver.findElement(By.id("loginButton")).click();//
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait till the error appears
		wait.until(ExpectedConditions.textToBe(By.className("errormsg"), "Username or Password is invalid. Please try again."));
		
		//error msg
		WebElement errorMsg=driver.findElement(By.className("errormsg"));//
		Point errorMsgLoc=errorMsg.getLocation();
		int error_X=errorMsgLoc.getX();
		int error_Y=errorMsgLoc.getY();
		System.out.println("Error Msg x-cord: "+error_X);
		System.out.println("Error Msg y-cord: "+error_Y);
		
		//username input field
		WebElement usernameInputField=driver.findElement(By.id("username"));//
		Point userNameLoc=usernameInputField.getLocation();
		int userName_X=userNameLoc.getX();
		int userName_Y=userNameLoc.getY();
		System.out.println("UserName x-cord: "+userName_X);
		System.out.println("UserName y-cord: "+userName_Y);
		
		System.out.println("Is error msg getting displayed above user name input field? "+(error_Y<userName_Y));
		
		//validate color code and font size/family
		System.out.println("Error msg color: "+errorMsg.getCssValue("color"));
		System.out.println("Error msg font-size: "+errorMsg.getCssValue("font-size"));
		System.out.println("Error msg font-family: "+errorMsg.getCssValue("font-family"));
	}
}
/*
Open actitime
click on login without entering username and password
validate-
	1. error msg should be displayed above username input field
	2. error msg should be displayed in red
*/