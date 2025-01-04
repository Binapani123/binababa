package Autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestion {
	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.navigate().refresh();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		Thread.sleep(2000);
////*[contains(@id,'sac-suggestion-row-')]//div[@role='button']
		List<WebElement> elements = driver.findElements(
				By.xpath("//div[@id='sac-autocomplete-results-container']//descendant::div[@role='button']"));
		for (WebElement webElement : elements) {
			System.out.println("==" + webElement.getText());
			String actualText = webElement.getText();

			if (actualText.equals("mobile for crib")) {
				webElement.click();
				Thread.sleep(2000);
				System.out.println(actualText + "  == clicked ");
				break;

			}

		}
		System.out.println("iehdoghierohj");
		
		driver.close();

	}
}
