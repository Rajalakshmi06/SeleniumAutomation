package week1.assignments.optional;



public class Palindrome {

	public static void main(String args[])
	   {
	     String str="Madam";
	     String rev="";
	 
	      //int length = ;
	 
	      for ( int i = str.length() - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equalsIgnoreCase(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	 
	   }
}
