package day3.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String arg[]) throws InterruptedException
	{
		// Set the property for ChromeDriver
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
	   driver.findElementByXPath("(//div[@class='x-form-element'])[19]/input").sendKeys("Rajalakshmi");
	   driver.findElementByXPath("//button[text()='Find Leads']").click();
	   Thread.sleep(1000);
	   driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a").click();
	   if(driver.getTitle().contains("opentabs"))
	   {
		   System.out.println("Title Vrified");
	   }
	   else
	   {
		   System.out.println("Not matched");
	   }
	   driver.findElementByXPath("((//div[@class='frameSectionExtra'])[2])/a[3]").click();
	   
	    driver.findElementByClassName("inputBox").sendKeys("TCS");
	    driver.findElementByClassName("smallSubmit").click();
	    driver.close();
	}

}
