package projectday;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
public static void main(String arg[])
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElementById("twotabsearchtextbox").sendKeys("oneplus 7 pro mobiles");
	driver.findElementByXPath("(//input[@type='submit'])[1]").click();
	String price=driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText();
	System.out.println("The Price of first resulting mobile is "+price);
	driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
	
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    
	Set<String> object=driver.getWindowHandles();
	
	List<String> object1=new ArrayList<String>(object);
	String s=object1.get(1);
	driver.switchTo().window(s);
	
	String CusRat=driver.findElementByXPath("(//span[@id='acrCustomerReviewText'])[1]']").getText();
	System.out.println("The Number of cutomers rating is "+CusRat);
	driver.findElementByXPath("//input[@id='add-to-cart-button']").click();
	String s1=driver.findElementByXPath("//h1[contains(text(),'Added')]").getText();
	//=driver.findElementByClassName("a-size-medium a-text-bold").getText();
	if(s1.contains("Added"))
	{
		System.out.println("Added card successfully");
	}
	driver.findElementByXPath("//a[@id='hlb-ptc-btn-native']").click();
	String title=driver.getTitle();
	System.out.println("Title : "+title);
	if(title.contains("Amazon"))
	{
		System.out.println("Got the title");
	}
	else
	{
		System.out.println("Invaild title");
	}
	driver.findElementById("continue").click();
	
	String msg=driver.findElementByXPath("//div[contains(text(),'mobile')]").getText();
	
	if(msg.contains("Enter your email or mobile phone number"))
	{
		System.out.println("Got the error Message");
	}
	//driver.quit();
	
	
}

}
