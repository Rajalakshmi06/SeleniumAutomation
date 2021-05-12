package week5.classroom.testng;

//import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//@Ignore
public class SoftwareCompany {
	@Test
	public void tcs()
	{
		System.out.println("TCS");
	}
	
		@Test(groups= {"software company"},priority=-1)
		public void infosys()
		{
			System.out.println("Infosys");
		}
	@Test(invocationCount=4)
		public  void hcl()
		{
			System.out.println("HCL");
		}
		@Test(groups= {"software company"},priority=1)
		public void hexaware()
		{
			System.out.println("Hexaware");
		}
		@Test(enabled=false)
		public void ibm()
		{
			System.out.println("IBM");
		}
		@Test(dependsOnMethods = {"tcs"})
		public void infoview()
		{
		System.out.println("Infoview");
		}
	
}
