package week5.classroom.testng;

import org.testng.annotations.Test;

public class Group {


		@Test(groups= {"Group"})
		public void tcs()
		{
			System.out.println("TCS");
		}
		
			@Test(groups= {"Group"})
			public void infosys()
			{
				System.out.println("Infosys");
			}
		@Test
			public  void hcl()
			{
				System.out.println("HCL");
			}
			@Test
			public void hexaware()
			{
				System.out.println("Hexaware");
			}
			@Test
			public void ibm()
			{
				System.out.println("IBM");
			}
			@Test
			public void infoview()
			{
			System.out.println("Infoview");
			}
		

	}


