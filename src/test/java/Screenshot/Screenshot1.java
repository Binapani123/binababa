package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import sun.net.ftp.FtpDirEntry.Type;

public class Screenshot1 {
	private static final String Output = null;
	private static final String OutPuttype = null;
	private static final String OutpuType = null;

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		driver= new ChromeDriver();// browser lunch
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot tk=(TakesScreenshot) driver;// conver webdriver to takess ingterface
		
	File Sourcefile =tk.getScreenshotAs(OutputType.FILE);// takescreenshot interface call to getscreenas method.
	File destinationfile =new File("./takescreen/Gudu.png");//abject creation in file class
	FileUtils.copyFile(Sourcefile, destinationfile);// fileutils interface copy 
		
		
		
		
	}
	
	
	

}
