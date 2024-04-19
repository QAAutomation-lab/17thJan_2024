package day4.multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		
		//type text to search in google
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		//identify all suggestions present in the page
		List<WebElement> suggestionList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>*:first-child>*:first-child>span"));
		
		System.out.println("Total suggestions in the page: "+suggestionList.size());
		
		for(int i=0;i<suggestionList.size();i++) {
			//to avoid StaleElementReferenceException, re-identify suggestionList
			suggestionList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>div:nth-of-type(2)>*:first-child>*:first-child>span"));
			System.out.println("Suggestion: "+suggestionList.get(i).getText());
		}

	}
}
/*
 * StaleElementReferenceException:  when we identified any element and after that if page HTML gets refreshed dn you
 * will get this exception
 * 
 */
