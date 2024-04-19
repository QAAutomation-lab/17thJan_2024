package day2.sync;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//Sync- implicit wait- After this driver will get 0-30 sec(max) for action, NoSuchElement exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://online.actitime.com/tcs/login.do");
		driver.findElement(By.name("username")).sendKeys("admin01");//0-30sec
		driver.findElement(By.name("pwd")).sendKeys("admin01");//0-30sec
		driver.findElement(By.id("loginButton")).click();//0-30sec
		
		String expectedHomepageTitle="actiTIME - Enter Time-Track";
		//Sync - explicit wait (conditional wait) WebDriverWait & FluentWait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));		
		//now implement required condition for wait
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));		
				//or
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logoutLink"))));	
		
		String actualHomepageTitle=driver.getTitle();
		
		System.out.println("Expected Title:"+expectedHomepageTitle);
		System.out.println("Actual title:"+actualHomepageTitle);
		System.out.println("Home page validation status? "+actualHomepageTitle.equals(expectedHomepageTitle));

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