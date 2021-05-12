package week4.classroom;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {

		// Set the property for ChromeDriver
	    System.setProperty("webdriver.chrome.driver", "C:\\TestLeaf\\Mavansample\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("Raji");
		driver.switchTo().alert().accept();
		String s=driver.findElementById("demo").getText();
		if(s.contains("Raji"))
       {
	      System.out.println("Successfully got the name");
       }
		else
		{
			System.out.println("didn't got the name");
		}
	}
}
