package day3.assignment;



import org.openqa.selenium.chrome.ChromeDriver;



public class OneButton {
	public static void main(String arg[])
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
	    driver.manage().window().maximize();
	    //driver.findElementById("home").click();
	    System.out.println("The Value of Get Poition is "+driver.findElementById("position").getLocation());
	    System.out.println("The button color is"+driver.findElementById("color").getCssValue("background-color"));
	    System.out.println("The height and width is "+driver.findElementById("size").getSize());

		
	}
}
