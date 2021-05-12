package projectday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ACME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		Actions object=new Actions(driver);
		
		
		WebElement object1=driver.findElementByName("dropdown2");
		Select dw1=new Select(object1);
		dw1.selectByVisibleText("Loadrunner");
		
		WebElement option=driver.findElementByXPath("(//button[@type='button'])[6]");
		object.moveToElement(option).build().perform();;
		System.out.println("Done mouse over action");
		driver.findElementByLinkText("Search for Vendor").click();
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		
		
		
		

	}

}
