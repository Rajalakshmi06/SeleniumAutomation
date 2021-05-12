package week5.classroom.testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectMethods {
	public ChromeDriver Driver;
	@BeforeMethod
public void login()
{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/control/main");
		Driver.findElementByName("USERNAME").sendKeys("DemoSalesManager");
		Driver.manage().window().maximize();
		Driver.findElementById("password").sendKeys("crmsfa");
		Driver.findElementByClassName("decorativeSubmit").click();
		Driver.findElementByLinkText("CRM/SFA").click();
		
		
}
	@AfterMethod
public void logout()
{
		Driver.close();
}
}
