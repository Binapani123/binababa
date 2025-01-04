package dropdown;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Dropdown {
	@Test
	public static void matchElementCheck() {
		WebDriver driver;
		SoftAssert softAssert = new SoftAssert();
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.findElement(By.xpath("//select[@id='BlogArchive1_ArchiveMenu']")).click();
		Select sel = new Select(driver.findElement(By.xpath("//*[@id='BlogArchive1_ArchiveMenu']")));
		List<WebElement> options = sel.getOptions();
		for (WebElement webElement : options) {
			String text = webElement.getText();
			
			if(text.equals("March (10)")) {
				softAssert.assertEquals(text, "March (10)");
				webElement.click();
				System.out.println("text clicked======"+ text);
				break;
			}else {
				System.out.println("text not match=="+ text);
			}
			
			
			
			
		}
		

		System.out.println("babababababbab");
		
		

		}

	}

