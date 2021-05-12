package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class ProgramMap {

	public static void main(String[] args) {
		String s="Rajalashmi";
		char[] name=s.toCharArray();
		
		Map<Character,Integer> map=new HashMap<>();
		//System.out.println(map);
		for(int i=0;i<name.length;i++)
		{
			if(map.containsKey(name[i]))
			{
				System.out.println(map.get(map));
			}
			else
			{
				map.put(name[i], 1);
				System.out.println(map);
			}
		}
		
		// TODO Auto-generated method stub

	}

}
