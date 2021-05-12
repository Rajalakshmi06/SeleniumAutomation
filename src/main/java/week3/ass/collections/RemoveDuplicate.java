 package week3.ass.collections;

import java.util.LinkedHashMap;
import java.util.Map;


public class RemoveDuplicate {

	public static void main(String arg[])
	{
		String s="PayPal India";
		char[] c=s.toCharArray();
		Map<Character,Integer> name=new LinkedHashMap<Character, Integer>();
		
		//System.out.println(name);
		Integer value = null;
		for (char word : c)
		{
			//if(map.contains(Character))
			if(name.containsKey(word)) 
			{
				// get the value using key +1
				 value = name.get(word)+1;
				// System.out.println("Key-"+name.get(word));
				 //System.out.println(" Value -"+ word+ " - " +value);
				name.put(word, value);
				
			}
			else {
				// add the character in the map & set the value as 1
				name.put(word, 1);
				//System.out.println(word);
				}
			
		}
		System.out.println(" Characters:");
		for(char word : name.keySet())
			if(name.get(word)==1 && !Character.isWhitespace(word))
			{
				
				System.out.print(word);
				
			}
			
		
			
}
}