package day4.multipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//identify all images present in the page
		List<WebElement> imgList=driver.findElements(By.tagName("img"));
		
		System.out.println("Total image in the page: "+imgList.size());
		
		for(int i=0;i<imgList.size();i++) {
//			WebElement img=imgList.get(i);
//			String src=img.getAttribute("src");
//			System.out.println("Image src: "+src);
				//or
			System.out.println("Image src: "+imgList.get(i).getAttribute("src"));
		}

	}

}
