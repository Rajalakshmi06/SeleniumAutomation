package week5.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SampleTestNG {
	public static ChromeDriver driver;
	@BeforeMethod
public void login()
{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementByName("USERNAME").sendKeys("DemoSalesManager");
		driver.manage().window().maximize();
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	
}
	@AfterMethod
public void logout()
{
		driver.close();
}

}
