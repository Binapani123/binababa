package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import sun.net.ftp.FtpDirEntry.Type;

public class Screenshot2 {
	private static final String Output = null;

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("mobile");

		// Simulate pressing the Arrow Down key once
		element.sendKeys(Keys.ARROW_DOWN);

		// Simulate pressing the Enter key
		element.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		TakesScreenshot tk = (TakesScreenshot) driver;
		File Sourcefile = tk.getScreenshotAs(OutputType.FILE);
		File DestinationFile = new File("./Takescreenshot/Guduu.png");
		FileUtils.copyFile(Sourcefile, DestinationFile);

		driver.close();

	}

}
