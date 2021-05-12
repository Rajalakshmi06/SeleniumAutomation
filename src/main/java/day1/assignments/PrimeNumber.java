package day1.assignments;

public class PrimeNumber {
	
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {

		// Declare an int Input and assign a value
		int n=13;
		
		// Declare a boolean input as flag
		boolean flag=false;
		int i;
		

		for(i=2;i<=n/2;i++)
		{
			
			if(n%i==0)
			{
				flag=true;
				System.out.println("Inside loop:"+n+ "   " +i + "  "+flag);
				break;
				
			}
			System.out.println("Outside loop:"+n+ "   " +i + "  "+flag);
		}
		if(flag==false)
		{
			System.out.println(n+" is a Prime Number");
			System.out.println("if loop:"+n+ "   " +i + "  "+flag);
		}
		else
		{
			System.out.println(n+" is not a Prime Number");
			System.out.println(n+ "   " +i + "  "+flag);
		}
		// Iterate from 1 to half of the input
		
			// Divide the input with each for loop variable and check the remainder
			
				// Set the flag as true when there is no remainder
				
				// break the iterator
				
		// Check the flag (Provide a condition)
		
			// Print 'Prime' when the condition matches
			
			// Print 'Not a Prime' when the condition doesn't match 
			
		

	}

}