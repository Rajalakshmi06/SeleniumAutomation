package implementationLayer;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	public ChromeDriver driver;
	@Given("Launch the browser")
	public void lanchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Given("Maximize the browser")
	public void maxBrowser()
	{
	  driver.manage().window().maximize();
	}
	@Given("Load the url")
	public void loadBrowser()
	{
		driver.get("http://leaftaps.com/opentaps/control/main");
		
	}
	@Given("Enter the username")
	public void enterUsername()
	{
		driver.findElementByName("USERNAME").sendKeys("Demosalesmanager");
	}
	@Given("Enter the password")
	public void enterPassword()
	{
		driver.findElementById("password").sendKeys("crmsfa");
		
	}
	@Given("click on the login button")
	public void submitLoginButton()
	{
		driver.findElementByClassName("decorativeSubmit").click();
		
	}
	@Given("click on CRMSFA link")
	public void clickCRMLink()
	{
		driver.findElementByLinkText("CRM/SFA").click();
		
	}
	@Given("click on Lead button")
	public void clickLead()
	{
		driver.findElementByLinkText("Leads").click();
		
	}
	@Given("click on Create Lead button")
	public void clickCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
		
	}
	@Given("enter the company name as (.*)")
	public void enterCompany(String cname)
	{
	
		  driver.findElementByClassName("inputBox").sendKeys(cname);
	}
	@Given("enter the first name as (.*)")
	public void enterFirstname(String fname)
	{
	    driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		
	}
	@Given("enter the last name as (.*)")
	public void enterLastName(String lname)
	{
		 driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		
	}

	@When("click on submit button")
	public void clickSubmit()
	{
		
		driver.findElementByClassName("smallSubmit").click();
	}
	@Then("Verify the Lead is created by checking the Company or First Name")
	public void verifytheLeadisCreated()
	{
		System.out.println("Lead is created");
	}
	
		
	}

