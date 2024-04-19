package day3.browseropsAndValidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComponentValidation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://online.actitime.com/tcs/login.do");
		
		/*
		 * validation- Username input
		 * 	- visible or not   ----> isDisplay()
		 *  - functional or not----> isEnabled()
		 *  - default value ------> getAttribute()
		 */
		WebElement userNameInputField=driver.findElement(By.id("username"));
		System.out.println("is user name input field visible? "+userNameInputField.isDisplayed());
		System.out.println("is user name input field functional/editable? "+userNameInputField.isEnabled());
		System.out.println("user name input field default visible text- "+userNameInputField.getAttribute("placeholder"));
		/*
		 * validation- checkbox 
		 * 	- visible or not   ----> isDisplay()
		 *  - functional or not----> isEnabled()
		 *  - default selection ------> isSelected()
		 */		
		WebElement checkbox=driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println("is checkbox visible? "+checkbox.isDisplayed());
		System.out.println("is checkbox functional/clickable? "+checkbox.isEnabled());
		System.out.println("is checkbox by default selected? "+checkbox.isSelected());
		checkbox.click();
		System.out.println("after click, is checkbox selected? "+checkbox.isSelected());
		
		
		/*
		 * validation- login button
		 * 	- visible or not   ----> isDisplay()
		 *  - functional or not----> isEnabled()
		 *  - name ------> getText()
		 */
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		System.out.println("is loginButton visible? "+loginButton.isDisplayed());
		System.out.println("is loginButton functional/clickable? "+loginButton.isEnabled());
		System.out.println("loginButton text- "+loginButton.getText());
		
	}
}
/*
 * password input field and Forgot your password?
 * 
 */
