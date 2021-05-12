package day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TypesOfWait {
	public static void main(String arg[])
	{
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/TextChange.html");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//div[@class='todo'])/button")));
		//driver.findElementByXPath("//div[@class='todo'])/button").click();
		driver.switchTo().alert().accept();
			

}
}