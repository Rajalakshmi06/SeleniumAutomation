package week2.ass.optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkar {
	public static void main(String arg[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    Actions builder = new Actions(driver);
	    
	   builder.moveToElement(driver.findElementByXPath("//span[text()='Electronics']")).build().perform();
	   Thread.sleep(2000);
//builder.contextClick(driver.findElementByXPath("//*[@id='submenu_electronics']/div[2]/div[1]/ul[1]/li[1]/a")).build().perform();
	   builder.moveToElement(driver.findElementByLinkText("Mi")).build().perform();
	   Thread.sleep(2000);
	}
}
