package day3.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	public static void main(String arg[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\Mavansample\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementByName("USERNAME").sendKeys("DemoSalesManager");
		driver.manage().window().maximize();
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		
		////should be correct
		driver.findElementByClassName("x-tab-strip-text").click();
		driver.findElementByLinkText("Email").click();
		
		driver.findElementByName("emailAddress").sendKeys("abc@gmail.com");
		//driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1])/a").click();
		Set<String> object=driver.getWindowHandles();
		List<String> object1=new ArrayList<String>(object);
		String s=object1.get(0);
		driver.switchTo().window(s);
		driver.findElementByLinkText("Duplicate Lead").click();
		if(driver.getTitle().contains("Duplicate"))
		{
			System.out.println("Title verified");
		}
		else
		{
			System.out.println("Not match the title");
		}
	
		driver.findElementByName("submitButton").click();
		
		driver.close();
		//check dup is sam as cap name
		//driver.close();
		
	}
}
