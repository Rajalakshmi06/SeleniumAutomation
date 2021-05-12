package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {
	public static void main(String arg[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\Mavansample\\drivers\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		WebElement source=driver.findElementById("txtStationFrom");
		source.clear();
		source.sendKeys("MAS",Keys.TAB);
		
		WebElement dest=driver.findElementById("txtStationTo");
		dest.clear();
		dest.sendKeys("SBC",Keys.TAB);
	if(driver.findElementById("chkSelectDateOnly").isSelected()==true) 
	{
		driver.findElementById("chkSelectDateOnly").click();
	}
		
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	    List<WebElement> table=driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]");
	   Set<String> tname= new HashSet<String>();
	    for(WebElement eachTrainname: table)
	    {
	    	String name=eachTrainname.getText();
	    	tname.add(name);
	    }
	   int count=tname.size();
	   System.out.println("Unique train names count"+count);
	 }
}
