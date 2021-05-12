package day3.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	public static void main(String[] args) {

		// Set the property for ChromeDriver
         System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\Mavansample\\drivers\\chromedriver.exe");
		// Initiate the ChromeBroswer
         ChromeDriver driver=new ChromeDriver();
		// Maximize the browser
         driver.manage().window().maximize();
          driver.get("http://leaftaps.com/opentaps/control/main");
		// Enter the UserName
           if(driver.findElementById("username").isDisplayed()==true);
           {
        	   System.out.println("Present");
           }
           
	}

}
