package week5.classroom.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead {
	@Test
	public  void createLead() {

	// Set the property for ChromeDriver
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
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
	// Click on Create Lead button
    driver.findElementByLinkText("Create Lead").click();
	// Enter Company Name
    driver.findElementByClassName("inputBox").sendKeys("TestLeaf");
	// Enter First Name
    driver.findElementById("createLeadForm_firstName").sendKeys("Rajalakshmi");
	// Enter Last Name
    driver.findElementById("createLeadForm_lastName").sendKeys("M");
	// Click on Create Lead (Submit) button
    driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Raji");
    driver.findElementById("createLeadForm_lastNameLocal").sendKeys("M");
    driver.findElementById("createLeadForm_personalTitle").sendKeys("Ms.");
    
    WebElement dropdown=driver.findElementById("createLeadForm_dataSourceId");
    Select dd=new Select(dropdown);
    dd.selectByVisibleText("Employee");
    driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Training Center");
    driver.findElementById("createLeadForm_annualRevenue").sendKeys("4,30,000");
    
    WebElement industry=driver.findElementById("createLeadForm_industryEnumId");
    Select dd1=new Select(industry);
    dd1.selectByValue("IND_SOFTWARE");
    
    WebElement ownership=driver.findElementById("createLeadForm_ownershipEnumId");
    Select dd2=new Select(ownership);
    dd2.selectByIndex(5);
    
    driver.findElementById("createLeadForm_sicCode").sendKeys("4130");
    driver.findElementById("createLeadForm_description").sendKeys("Good");
    driver.findElementById("createLeadForm_importantNote").sendKeys("Please avoid to coming late");
   // driver.findElementById("createLeadForm_parentPartyId").sendKeys("First");
    
    WebElement  mc=driver.findElementById("createLeadForm_marketingCampaignId");
    Select dd3=new Select(mc);
    dd3.selectByVisibleText("Automobile");
    
    driver.findElementById("createLeadForm_marketingCampaignId").sendKeys("4,30,000");
    driver.findElementById("createLeadForm_birthDate").sendKeys("2/5/19");
    driver.findElementById("createLeadForm_departmentName").sendKeys("IT");
    
    WebElement  pc=driver.findElementById("createLeadForm_currencyUomId");
   Select dd4=new Select(pc);
    dd4.selectByVisibleText("AUD - Australian Dollar");
  
    driver.findElementById("createLeadForm_numberEmployees").sendKeys("1000");
    driver.findElementById("createLeadForm_tickerSymbol").sendKeys("NYSE");
    
    WebElement  ccode=driver.findElementById("createLeadForm_primaryPhoneCountryCode");
    ccode.clear();
    ccode.sendKeys("+91");
    driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("612001");
    driver.findElementByName("primaryPhoneExtension").sendKeys("044");
    driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
    driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9003004441");
    
    driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("9655524812");
    driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.google.com");
    driver.findElementById("createLeadForm_generalToName").sendKeys("Raji");
    driver.findElementById("createLeadForm_generalAttnName").sendKeys("abcd");
    driver.findElementById("createLeadForm_generalAddress1").sendKeys("sholinganalur");
    driver.findElementById("createLeadForm_generalAddress2").sendKeys("M.G.R Street");
    
    driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");
    driver.findElementById("createLeadForm_generalPostalCode").sendKeys("610110");
    driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("50030");
    
    WebElement  state=driver.findElementById("createLeadForm_generalStateProvinceGeoId");
    Select dd5=new Select(state);
    dd5.selectByValue("GA");
    WebElement  country=driver.findElementById("createLeadForm_generalCountryGeoId");
    Select dd6=new Select(country);
    dd6.selectByIndex(13);
    driver.findElementByClassName("smallSubmit").click();
    driver.close();
 
	}  

}
