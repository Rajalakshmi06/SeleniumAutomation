package week5.classroom.testng;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;


public class Merge {
	public static void main(String[] args) throws InterruptedException {

		// Set the property for ChromeDriver
	    System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\Mavansample\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
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
	   driver.findElementByLinkText("Merge Leads").click();
	   //click on from lead near icon
	    driver.findElementByXPath("(//table[@class='twoColumnForm']//img)[1]").click();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Set<String> object=driver.getWindowHandles();
		List<String> object1=new ArrayList<String>(object);
		String s=object1.get(1);
		driver.switchTo().window(s);

	   //move to new window
	   driver.findElementByXPath("((//div[@class='x-form-element'])/input)[1]").sendKeys("10029");
	  
	   driver.findElementByXPath("//button[text()='Find Leads']").click();
	   Thread.sleep(1000);
	   driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a").click();
	   driver.switchTo().window(object1.get(0));
	   driver.findElementByXPath("(//table[@class='twoColumnForm']//img)[2]").click();
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Set<String> setobj=driver.getWindowHandles();
		List<String> object2=new ArrayList<String>(setobj);
		String s1=object2.get(1);
		driver.switchTo().window(s1);
	   driver.findElementByXPath("((//div[@class='x-form-element'])/input)[1]").sendKeys("10030");
	   driver.findElementByXPath("//button[text()='Find Leads']").click();
	   Thread.sleep(1000);
	   driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])/a").click();
	   driver.switchTo().window(object1.get(0));
	   
	  driver.findElementByXPath("//a[text()='Merge']").click();
	   Alert alert=driver.switchTo().alert();
	   alert.accept();
	   driver.findElementByLinkText("Find Leads").click();
	   driver.findElementByXPath("(//div[@class='x-form-item x-tab-item'][1])//input").sendKeys("10216");
	   driver.findElementByXPath("//button[text()='Find Leads']").click();
	   String s2=driver.findElementByXPath("//div[text()='No records to display']").getText();
	   System.out.println(s2);
	   if(s2.contains("No"))
	   {
		   System.out.println("Successfully merge of the Leads");
	   }
	   else
	   {
		   System.out.println("Not matched");
	   }
	 //  driver.close();  
	   
	}

}
