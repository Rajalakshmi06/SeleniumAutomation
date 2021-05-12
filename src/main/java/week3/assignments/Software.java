package week3.assignments;

public interface Software {
	
	public int softwareResources();
	 default void display()
	{
		System.out.println("Dafault Access Modifier");
	}

	

}
