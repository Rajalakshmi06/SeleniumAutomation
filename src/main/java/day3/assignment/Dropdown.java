package day3.assignment;

	

import org.openqa.selenium.WebDriver;

//import java.util.AbstractCollection;

	//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
    import java.lang.String;
    
	//import okio.ByteString;
	//import okio.Options;



public class Dropdown {
		public static void main(String arg[])
		{
			//System.setProperty("webdriver.chrome.driver", "E:\\Testleaf\\Mavansample\\drivers\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://leafground.com/pages/Dropdown.html");
			driver.manage().window().maximize();
			WebElement dropdown4=((RemoteWebDriver) driver).findElementById("dropdown1");
			Select dw=new Select(dropdown4);
			dw.selectByIndex(3);
			
			WebElement dropdown1=driver.findElementByName("dropdown2");
			Select dw1=new Select(dropdown1);
			dw1.selectByVisibleText("Loadrunner");
			
			
			WebElement dropdown3=driver.findElementByName("dropdown3");
			Select dw2=new Select(dropdown3);
			dw2.selectByValue("3");
			
			
			WebElement dropdown11=driver.findElementByName("dropdown2");
			Select dw11=new Select(dropdown11);
			dw11.deselectByVisibleText("Loadrunner");
			
			WebElement dpw4=driver.findElementByClassName("dropdown");
			Select dropdown = new Select(dpw4);
			WebElement options = (WebElement) dropdown.getOptions();
			 System.out.println(options.getSize());
			
			 WebElement dropdown5=driver.findElementByTagName("option");
				Select dw4=new Select(dropdown5);
				dw4.selectByIndex(2);
				
			
			/*WebElement dropdown5=driver.findElementByClassName("example");
			Select dw4=new Select(dropdown5);
			java.util.List<WebElement> count=dw4.getOptions();
			System.out.println("Number of items in dropdown"+count);
			for(WebElement eachWebElment : option)
			{
				System.out.println(eachWebElment.getText());
			}
			int size=options.size();
			for(String i=0;i<size-1;i++)
	     {
		   System.out.println(((WebDriver) options).get(i).getText());
	    }
*/
			
		}
	

}
	