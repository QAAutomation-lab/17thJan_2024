package day5.dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//identify dropdown list
		WebElement skillDropdown=driver.findElement(By.id("Skills"));
		
		//create an instance of Select class and pass above dropdown object to its constructor
		Select skillSelect=new Select(skillDropdown);
		
		System.out.println("Is skill dropdown allow multiple selected? "+skillSelect.isMultiple());
		System.out.println("Default value from dropdown: "+skillSelect.getFirstSelectedOption().getText());
		
		skillSelect.selectByIndex(1);
		System.out.println("New selected-index value from dropdown: "+skillSelect.getFirstSelectedOption().getText());
		
		
		skillSelect.selectByValue("Analytics");
		System.out.println("New selected-value value from dropdown: "+skillSelect.getFirstSelectedOption().getText());
		
		skillSelect.selectByVisibleText("Backup Management");
		System.out.println("New selected-text value from dropdown: "+skillSelect.getFirstSelectedOption().getText());
		
		int count=skillSelect.getOptions().size();
		System.out.println("Option count: "+count);
		
		for(int i=0;i<count;i++) {
			System.out.println(skillSelect.getOptions().get(i).getText());
		}

	}
}
/*
Dropdown ops:
	1. check multiselect 
	2. default value
	3. select value and check it is selected or not
			selectByIndex(int)
			selectByValue(String)
			selectByVisibleText(String)
	4. dropdown options
*/