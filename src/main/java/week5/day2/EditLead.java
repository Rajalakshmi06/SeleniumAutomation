package week5.day2;

import org.testng.annotations.Test;

public class EditLead extends SampleTestNG{
	@Test
	public void editLead() throws InterruptedException
	{
		// Set the property for ChromeDriver
	    
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
