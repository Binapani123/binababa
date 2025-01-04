package Action;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[@role='img']"))).build().perform();
		Thread.sleep(2000);
		//act.click(driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]/div[contains(@class,'nav-tpl-itemList')]/a[@href='#switch-lang=de_DE']")));
		// Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-icp\"]//a[@lang='ko-KR']")).click();
		
		System.out.println("gitgub testing");
		
		
		
		
		
	}
	

}
