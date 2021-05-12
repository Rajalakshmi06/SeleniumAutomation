package week2.ass.optional;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample {

	
		private static final Object Selectday = null;

		public static void main(String arg[]) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			
		
			driver.get("https://www.redbus.in/");		
			/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@id='src']")).click();
			driver.findElement(By.xpath("//input[@id='src']")).sendKeys("GOA");
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li[1]")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@id='dest']")).click();
			driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Mumbai");
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='search']/div/div[2]/div/ul/li[1]")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/div/label")).click();
			Thread.sleep(1000);*/
			
			String date = "10-Oct 2018";
			String splitter[] = date.split("-");
			String month_year = splitter[1];
			String day = splitter[0];	
			System.out.println(month_year);
			System.out.println(day);
			
			selectDate(month_year,day);		
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='search_btn']")).click();
			Thread.sleep(2000);
			
			
			
			List<WebElement> elements = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]"));
					
			Object monthyear = null;
			for (int i=0; i<elements.size();i++)
			{
				System.out.println(elements.get(i).getText());
				//Selecting the month
				if(elements.get(i).getText().equals(monthyear))
				{				
					//Selecting the date				
					List<WebElement> days = driver.findElements(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
					
					for (WebElement d:days)
					{					
						System.out.println(d.getText());
						if(d.getText().equals(Selectday))
						{
							d.click();
							Thread.sleep(10000);
							return;
						}
					}								
					
				}			
						
			}
			driver.findElement(By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
			selectDate(monthyear,Selectday);
			}

		private static void selectDate(Object monthyear, Object selectday2) {
			// TODO Auto-generated method stub
			
		}

		private static void selectDate(String month_year, String day) {
			// TODO Auto-generated method stub
			
		}
	  }

