package day1.workingwithbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowserWithOps {

	public static void main(String[] args) {
		//Create an instance of ChromeDriver class and upcast it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		//enter application URL
		driver.get("https://www.google.com");
		
		//get application current title
		String title=driver.getTitle();
		System.out.println("Current page title: "+title);
				//or
		//System.out.println("Current page title: "+driver.getTitle());
		
		//get current URL from opened application
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Current URL: "+currentUrl);
		
		//get current application source code
		String currentPageSourceCode=driver.getPageSource();
		System.out.println("Length of current page soruce code: "+currentPageSourceCode.length());
		
		//close current browser opened by Selenium
		driver.close();		
	}
}
/*
TC1:
	Open chrome browser
	enter google URL
	get title and print it
	get current url and print it
	close the browser
*/