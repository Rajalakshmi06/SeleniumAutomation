package week1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// Here is the input
		String test="I am a software tester";
		
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		
		/* Pseudo Code:
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		d) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		e) print the even position words in reverse order using another loop (nested loop)
		 
	*/
		String[] ch=test.split(" ");
		int i;
		int j;
		char ch1[];
		for(i=0;i<ch.length;i++)
		{
			if(i%2!=0)
			{
				System.out.println(ch[i]+" ");
			}
			else
			{
				String sample=ch[i];
				ch1=sample.toCharArray();
				
			
			for(j=ch1.length;j>0;j--)
			{
				//System.out.println("reverse word is");
			}
			System.out.println(ch1[j]);
	}         
		}
	}
}
