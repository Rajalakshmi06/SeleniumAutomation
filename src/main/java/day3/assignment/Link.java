package day3.assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String arg[])
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
	    driver.manage().window().maximize();
	    //driver.findElementByLinkText("Find where am supposed to go without clicking me?").click();
	    
	    //driver.findElementByLinkText("Verify am I broken?").click();
	   Point Loc = driver.findElementById("position").getLocation();
	   System.out.println(Loc);
	      String bgclor=driver.findElementById("color").getCssValue("background-color");
	    System.out.println(bgclor);
	   Dimension xysize = driver.findElementById("size").getSize();
	   System.out.println(xysize);
	}
}
