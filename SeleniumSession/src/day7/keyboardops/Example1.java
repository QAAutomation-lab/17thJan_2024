package day7.keyboardops;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://online.actitime.com/cts1/login.do");
		WebElement usernameInputField=driver.findElement(By.id("username"));
//		//type user name as admin01 and use ctrl+a
//		usernameInputField.sendKeys("admin01",Keys.chord(Keys.CONTROL,"a"));
//		//use ctrl+c
//		usernameInputField.sendKeys(Keys.chord(Keys.CONTROL,"c"));
					//or
		usernameInputField.sendKeys("admin01",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		//Thread.sleep(2000);
		//paste the copy text into password field using ctrl+v
		driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL,"v"), Keys.ENTER);
	}

}
/*
Open actitime application
enter user name as admin01
copy it and paste it into password field
press enter button to login
*/