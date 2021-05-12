package day3.assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String arg[])
	
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions object=new Actions(driver);
		WebElement source=driver.findElementByXPath("(//div[@id='products']/div/ul)/li[5]");
		WebElement target=driver.findElementByXPath("(//li[@class='placeholder'])[1]");
		object.dragAndDrop(source, target).build().perform();
		WebElement soucre1=driver.findElementByXPath("(//div[@id='products']/div/ul)/li[8]");
		object.dragAndDropBy(soucre1, 150, 40).build().perform();
		System.out.println("Success");
		
	}
}
