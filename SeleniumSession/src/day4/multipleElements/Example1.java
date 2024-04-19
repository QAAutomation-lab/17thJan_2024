package day4.multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.demoblaze.com/");
		//identify all images present in the page
		List<WebElement> deviceList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		
		System.out.println("Total device in the page: "+deviceList.size());
		
		for(int i=0;i<deviceList.size();i++) {
//			WebElement device=deviceList.get(i);
//			String name=device.getText;
//			System.out.println("Device name: "+name);
				//or
			System.out.println("Device name: "+deviceList.get(i).getText());
		}

	}
}
/*
 * Along with name print price of each device
 */
