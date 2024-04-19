package day1.workingwithbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenEdgeBrowser {

	public static void main(String[] args) {
		//Create an instance of EdgeDriver class
		EdgeDriver fdriver=new EdgeDriver();
	}
}
/*
For each run selenium opens a new browser, it won't work on already opened browser
Browser opened by Selenium won't be having following-
	- no history
	- no cache
	- no cookies
	- no plugins
	- no book-mark
*/