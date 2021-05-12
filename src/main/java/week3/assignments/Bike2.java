package week3.assignments;

public  abstract class Bike2 {
	
	protected abstract double cost(double price);
	//hiding the internal implementation and showing only the fuctionality to the user
	//partial abstraction
	//abstract class having abstract method and non-abstract methods.
	// Abstract method should have the declaration only in abstract class.no method body
	// we should implement this method in child class
	//we can't create the objects of abstract class
	int b=100;
	final int z=20;
	static int wheels=4;
	
	void speed()
    {
    	System.out.println("The Speed of the bike is 148 km/h");
    }
    
	void display() {
		System.out.println("Price and Speed for Bike");
	}
	

}
