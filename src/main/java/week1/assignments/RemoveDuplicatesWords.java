package week1.assignments;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learnt java basics as part of java sessions in week1";
		// Initialise an integer variable as count
		int count = 0;
			/*
			 * Pseudo code 
			 * a) Split the String into array and iterate over it 
			 * b) Initialise another loop to check whether the word is there in the array 
			 * c) if it is available then increase and count by 1. 
			 * d) if the count > 1 then replace the word as "" 
			 * e) print the each word
			 */
		int i;
		int j;
		
		String[] a=text.split(" ");
		System.out.println(a);
	   
	    for(j=0;j<a.length-1;j++)
	    {
	    	for(i=0;i<a.length-1;i++)
	    	{
	    		if(a[i]==a[j])
	    		{
	    			count=count+1;
	    		}
	    	}
	    		
	    		if(count>1)
				{
					a[i]="";
					
				}
	    		count=0;
	    		System.out.print(a[i]); 
	    		System.out.print(" ");
	   }
	    	
	   
	}

}
