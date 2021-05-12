package week5.annotation;

import org.testng.annotations.Test;

public class EditLead  extends SampleTestNG{
	@Test
	public void editLead() throws InterruptedException
	{

	   driver.findElementByLinkText("Leads").click();
	   driver.findElementByLinkText("Find Leads").click();
	   driver.findElementByXPath("(//div[@class='x-form-element'])[19]/input").sendKeys("Anitha");
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
	  }

}
