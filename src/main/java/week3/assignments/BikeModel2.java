package week3.assignments;

public class BikeModel2 {
	public static void main(String arg[])
	{
		Bajaj2 obj=new Bajaj2();
		
		obj.display();
		obj.cost(1.4);
		obj.speed();
		
		// another way of object creation..it is dynamic polymorphism Bike2 obj1=new Bajaj2();
		//but we cant crete like below:
		//Bike2 obj3=new Bike2();
	}

}