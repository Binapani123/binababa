package MultiWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WbElement {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));

		for (WebElement link : alllinks)// 100 nlinks
		{
			System.out.println(link.getText());
		}

		int size = alllinks.size();
		System.out.println("no of links" + size);
		driver.close();
	}

}
