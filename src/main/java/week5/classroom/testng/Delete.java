package week5.classroom.testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Delete {
	@Test
	public  void DeleteLead() throws InterruptedException {

	  System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\Mavansample\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//WebElement userName=driver.findElementById("username");
	    //userName.sendKeys("DemoSalesManager");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		// Enter the Password
	   driver.findElementById("password").sendKeys("crmsfa");
		// Click on Login Button
	   driver.findElementByClassName("decorativeSubmit").click();
	   driver.manage().window().maximize();
		// Click on crm/sfa button
	   driver.findElementByLinkText("CRM/SFA").click();
		// Click on Leads
	   driver.findElementByLinkText("Leads").click();
	   driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		//driver.findElementByXPath(//span[text()='Phone']).click();
		driver.findElementByName("phoneNumber").sendKeys("9003004441");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		driver.findElementByXPath("//a[text()='Delete']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//div[@class='x-form-element'])[18]/input").sendKeys("10000");
		//driver.findElementByXPath("((//div[@class='x-form-element'])/input)[1]").sendKeys("10216");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		String s=driver.findElementByXPath("//div[text()='No records to display']").getText();
		if(s.contains("No"))
		{
			System.out.println("No Records Found");
		}
		else
		{
			System.out.println("found");
		}
		driver.close();
}
}