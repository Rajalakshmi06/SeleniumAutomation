package day2.classroom.str;

public class FindTypes {


	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Automation Class $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0, upper=0, lower=0;

		char[] test1=test.toCharArray();
        int i;
        for(i=0;i<test.length()-1;i++)
		// Print the count here
        {
        	if(Character.isLetter(test1[i]))
        	{
        		letter=letter+1;
        		
        	}
        	if(Character.isDigit(test1[i]))
        	{
        		num=num+1;
        		
        	}
        	if(Character.isSpaceChar(test1[i]))
        	{
        		specialChar=specialChar+1;
        		
        	}
        	if(Character.isUpperCase(test1[i]))
        			{
        				upper=upper+1;
        			}
        	if(Character.isLowerCase(test1[i]))
        	{
        		lower=lower+1;
        	}
        	else
        	{
        		space=space+1;
        		
        	}
        }
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
		System.out.println("Uppercaser: " + upper);
		System.out.println("Lowercase: " + lower);
	}

	

}
