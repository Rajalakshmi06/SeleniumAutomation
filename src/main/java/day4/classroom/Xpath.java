package day4.classroom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\Mavansample\\drivers\\chromedriver.exe");
			// Initiate the ChromeBroswer
	         ChromeDriver driver=new ChromeDriver();
			// Maximize the browser
	         driver.manage().window().maximize();
	         WebElement source=driver.findElementById("txtStationFrom");
	         source.clear();
	         source.sendKeys("SBC",Keys.TAB);
	         Thread.sleep(3000);
	         
	         
	}

}
