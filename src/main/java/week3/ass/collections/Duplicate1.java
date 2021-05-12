package week3.ass.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Duplicate1 {
	public static void main(String arg[])
	{
		String s="Infosys Limited";
		char[] c=s.toCharArray();
		Map<Character,Integer> name=new LinkedHashMap<Character, Integer>();
		
		System.out.println(name);
		Integer value = null;
		for (char word : c) {
			//if(map.contains(Character))
			if(name.containsKey(word)) 
			{
				// get the value using key +1
				 value = name.get(word)+1;
				System.out.println(name.put(word, value));
				
			}
			else {
				// add the character in the map & set the value as 1
				name.put(word, 1);
				
					//System.out.println(word);
				}
			
		}	
		
		System.out.println("Distinct Characters:");
		for(char word : name.keySet())
			if(name.get(word)!=1 && !Character.isWhitespace(word))
			{
				System.out.print(word+" ");
			}
			
}
}
