package Autosuggestion;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion1 {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		driver= new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
		 Thread.sleep(2000);
		 List<WebElement> alloptions = driver.findElements(By.xpath("//div[@id='sac-autocomplete-results-container']//descendant::div[@role='row']"));
		 
		 for (WebElement webElement : alloptions) {
			System.out.println(webElement.getText());
			String actualTxt = webElement.getText();
			webElement.click();
		}
		 
		 Thread.sleep(2000);
		 driver.close();
		 
	}

}
