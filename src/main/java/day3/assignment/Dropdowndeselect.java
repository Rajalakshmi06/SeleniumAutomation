package day3.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.lang.String;
public class Dropdowndeselect {
	
	public static void main(String arg[])
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		//WebElement dropdown= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
		WebElement dropdown= driver.findElement(By.xpath("//div[3]/section/div[6]/select"));
		Select sel = new Select(dropdown);
		if(sel.isMultiple())
		{
			System.out.println("Multiple choices are allowed.Select the multiple options in the dropdown");
		}
		else
		{
			System.out.println("Multiple choices are not allowed");
		}
		sel.selectByIndex(1);
		sel.selectByValue("2");
		sel.selectByVisibleText("UFT/QTP");
		sel.deselectByValue("2");
		sel.deselectAll();/*remove the selection option for all the selected items*/
		
	}

}
