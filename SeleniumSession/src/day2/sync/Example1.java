package day2.sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//Sync- implicit wait- After this driver will get 0-30 sec(max) for action, NoSuchElement exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");//0-30sec
		driver.findElement(By.name("password")).sendKeys("admin123");//0-30sec
		driver.findElement(By.className("orangehrm-login-button")).click();//0-30sec

	}

}
/*
Scenario to Automate: 
Open chrome browser
Enter App url as https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
Validate login page
Enter user name as Admin
Password as admin123
Click on login button
Validate home page

*/