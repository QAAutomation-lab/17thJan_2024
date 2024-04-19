package day5.dropdownhandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://omayo.blogspot.com/");
		
		//identify dropdown list
		WebElement carDropdown=driver.findElement(By.id("multiselect1"));
		
		//create an instance of Select class and pass above dropdown object to its constructor
		Select carSelect=new Select(carDropdown);
		
		System.out.println("Is skill dropdown allow multiple selected? "+carSelect.isMultiple());
		
		int count=carSelect.getOptions().size();
		System.out.println("Option count: "+count);
		for(int i=0;i<count;i++) {
			System.out.println(carSelect.getOptions().get(i).getText());
		}
		
		carSelect.selectByIndex(0);
		carSelect.selectByValue("swiftx");
		carSelect.selectByVisibleText("Audi");
		System.out.println("Number of option selected: "+carSelect.getAllSelectedOptions().size());
		
//		carSelect.deselectByIndex(0);
//		carSelect.deselectByValue("swiftx");
//		carSelect.deselectByVisibleText("Audi");
		carSelect.deselectAll();
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