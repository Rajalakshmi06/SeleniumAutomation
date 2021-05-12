package week4.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	public static void main(String[] args) {

		// Set the property for ChromeDriver
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
        driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
        
        Set<String> winHand=driver.getWindowHandles();
        int count=winHand.size();
        System.out.println("Number of windows opened: "+count);
        List<String> FWH=new ArrayList<String>(winHand);
       String secWindow=FWH.get(1);
        driver.switchTo().window(secWindow);
       /* Set<String> winHand2=driver.getWindowHandles();
        List<String> FWH1=new ArrayList<String>(winHand2);
        String trdWindow=FWH1.get(2);
        driver.switchTo().window(trdWindow);*/
        String title=driver.getTitle();
        System.out.println(title);
        
       driver.quit();
        
        
	}
}
