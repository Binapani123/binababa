package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws Exception  {
		// System.out.println("hhbh");
		WebDriver driver;
		// System.setProperty("webdriver.chrome.driver", "C:\\geckodriver.exe");
		driver = new ChromeDriver();

		// goto url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/V4/");

		// Call take screenshot function
		

		
		
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		
		
		
		// Call getScreenshotAs method to create image file
		File SourceBangloreFile = scrShot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		System.out.println(SourceBangloreFile);
		File DestinationKdpFile = new File("./kdp/babaScreenShot.png");
		System.out.println(DestinationKdpFile);
		// Copy file at destination
		FileUtils.copyFile(SourceBangloreFile, DestinationKdpFile);
		driver.close();

	}

}
