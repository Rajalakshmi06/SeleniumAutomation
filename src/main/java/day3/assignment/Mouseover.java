package day3.assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {
	public static void main(String arg[])
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/mouseOver.html#");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		Actions builder=new Actions(driver);
		WebElement button=driver.findElementByLinkText("TestLeaf Courses");
		builder.moveToElement(button).build().perform();
		String link1=driver.findElementByXPath("(//a[@class='listener'])[1]").getText().toUpperCase();
				String link2=driver.findElementByXPath("(//a[@class='listener'])[2]").getText();
				System.out.println(link2);
				String link4=driver.findElementByXPath("(//a[@class='listener'])[2]").getText().toLowerCase();
				System.out.println(link4);
		String link3= driver.findElementByXPath("(//a[@class='listener'])[3]").getText();
		System.out.println(link1);
		System.out.println(link2);
		System.out.println(link3);
		driver.findElementByXPath("//a[text()='RPA']").click();
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");
		if(link3.contains("Ser"))
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println(" NotPresent");
		}
		
}
}