package day3.assignment;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;


public class Screenshot {

	public static void main(String arg[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.tutorialspoint.com/index.htm");
		driver.get("https://www.google.com");
		//driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
	    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("sample.png"));
	
		System.out.println("Successfully took screenshot");
	}
}
