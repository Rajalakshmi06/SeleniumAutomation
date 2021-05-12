package week5.classroom.testng;

import org.testng.annotations.Test;

public class Arithmetic {

	@Test(groups = {"arithmetic"})
	public void add()
	{
		System.out.println("Addtion of 3 + 2 is 5");
	}
	@Test
	public void sub()
	{
		System.out.println("Subraction of 3 - 2 is 1");
	}
	@Test(groups = {"arithmetic"})
	public void mul()
	{
		System.out.println("Multiplication of 3 * 2 is 6");
	}
	}
	
	
	

