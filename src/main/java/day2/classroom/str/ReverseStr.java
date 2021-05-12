package day2.classroom.str;



public class ReverseStr {

	public static void main(String[] args) {
		
		// Here is the input
		String test = "feeling good";

		// Build the logic to find the count of each
		/* Pseudo Code: 1
			a) Convert the String to character array
			b) Traverse through each character (using loop in reverse direction)
			c) Print the character (without newline -> like below
			   System.out.print(ch);
		*/

			char[] ch=test.toCharArray();
		int i=0;
		for(i=test.length()-1;i>=0;i--)
		{
			///ch=test1(i);
			System.out.print(ch[i]);
		}
		System.out.println(" ");
		
		/* Pseudo Code: 2
		a) Find the length of the string
		b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
		c) Find the character of the String using its index
		*/
		int j;
	System.out.println(test.length());
	for(j=test.length()-1;j>=0;j--)
	
	//for(j=0;j>test.length()-1;j++)
	{
		System.out.println("Char at "+j+" place "+test.charAt(j));

	}
		
}

	/*private static char[] CharAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static char[] test1(int i) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
