package week1.assignments.optional;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		       //Declare a String 
				String text1 = "stop";
				//Declare another String
				String text2 = "pots";
				
				//String text1 = "abcd";
				
				//build logic to check the given words are anagram or not
				
				/*
				 * Pseudo Code
				 * a) Check length of the strings are same then
				 * b) Convert both Strings in to characters
				 * c) Sort Both the arrays
				 * d) Check both the arrays has same value
				 * 
				 */
				int a=text1.length();
				int b=text2.length();
				if(a==b)
				{
					System.out.println("length of a and b is "+a+" "+b);
				}
				char[] s1=text1.toCharArray();
				char[] s2=text2.toCharArray();
		        Arrays.sort(s1);
		        System.out.println(s1);
				Arrays.sort(s2);
				System.out.println(s1);
				int i;
				
				for(i=0;i<s1.length;i++)
				{
					if(s1[i]==s2[i])
					{
						
						System.out.println(s1[i]+" Anagram "+s2[i]);
					}
					else
					{
						System.out.println("not a Anagram");
					}
					
				}
				
					

	}

}
