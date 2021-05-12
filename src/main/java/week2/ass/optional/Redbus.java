package week2.ass.optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String arg[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='src']")).click();
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dest']")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Mumbai", Keys.ARROW_DOWN);
		Thread.sleep(2000);
		/*driver.findElementById("src").click();
		driver.findElementById("src").sendKeys("Chennai");*/
		/*WebElement dropdown=driver.findElementByClassName("autoFill");
		Select dw=new Select(dropdown);
		dw.selectByIndex(1);*/
		/*WebElement to=driver.findElementById("dest");
		to.clear();
		to.sendKeys("Trichy");
		/*WebElement dropdown1=driver.findElementByClassName("autoFill");
		Select dw1=new Select(dropdown1);
		dw1.selectByIndex(1);*/
		//driver.findElementByClassName("db text-trans-uc move-up").sendKeys("10-Dec-2019");
		
		driver.findElementByXPath("//td[text()='10']").click();	
		driver.findElementByClassName("db text-trans-uc tal move-up").sendKeys("19-Dec-2019");
		
	
	}

}
