package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takescreenshot5 {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot tks= (TakesScreenshot) driver;
	File sourcefile	=tks.getScreenshotAs(OutputType.FILE);
	File destinationfile =new File("./takesvreen/gugu.png");
	FileUtils.copyFile(sourcefile, destinationfile);
	}

}
