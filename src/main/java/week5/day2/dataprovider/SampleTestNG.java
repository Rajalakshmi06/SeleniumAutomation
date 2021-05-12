package week5.day2.dataprovider;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class SampleTestNG {
	public ChromeDriver driver;
	public String excelfile;
	
	@BeforeMethod
	@Parameters({"url","username","password"})
	public void login(String url,String uname,String pass)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElementByName("USERNAME").sendKeys(uname);
		driver.manage().window().maximize();
		driver.findElementById("password").sendKeys(pass);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

	}
	@AfterMethod
	public void logout()
	{
		driver.close();
	}
	@DataProvider
	public String[][] getData() throws IOException
	{
		/*String data[][]=new String[2][3];
	data[0][0]="CTS";
	data[0][1]="Roshini";
	data[0][2]="B";

	data[1][0]="Wipro";
	data[1][1]="Gomathi";
	data[1][2]="S";*/
		ConnectExcelJava data=new ConnectExcelJava();
		return data.readExcel(excelfile);
	}
}
