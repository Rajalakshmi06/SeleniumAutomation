package week3.assignments;

public class Desktop implements Hardware,Software {
	
	public void desktopModel()
	{
		System.out.println("My system is Dell");
	}

	@Override
	public int softwareResources() {
		System.out.println("The softwares are available in PC such as Java,Ecilipse and Mavan");
return 3;
		
	}

	@Override
	public void hardwareResources() {
		
		System.out.println("The Hardwares are Keyboard,Mouse,CPU and Monitor ");
	}
   
}
