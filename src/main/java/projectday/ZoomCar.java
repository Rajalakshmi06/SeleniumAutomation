package projectday;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.chrome.ChromeDriver;



public class ZoomCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\Mavansample\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.zoomcar.com/chennai");
		driver.manage().window().maximize();
		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("(//div[@class='items'])[1]").click();
		driver.findElementByXPath("//button[text()='Next']").click();
		
	    Date date=new Date();
		DateFormat obj=new SimpleDateFormat("dd");
		String today=obj.format(date);
        int tomo=Integer.parseInt(today)+1;
        
        System.out.println("Tomorrow Date is : "+tomo);
        
        driver.findElementByXPath("//div[contains(text(),'"+tomo+"')]").click();
        
		
		
		

	}

}
