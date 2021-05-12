package week3.ass.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompanyList {
	public static void main(String arg[])
	{
		List<String> company=new ArrayList<String>();
		//isEmpty()--return boolean value
		System.out.println(company.isEmpty());
		System.out.println(company);
		//add(item)--added in the last
		company.add("ABC");
		//size()
		int a=company.size();
		System.out.println(a);
		//clear()
	    //company.clear();
		company.add("HCL");
		company.add("Aspire System");
		//add(index,value)--insert in the particular position
		company.add(1,"CTS");
		company.add(3, "Accenture");
		System.out.println(company);
		System.out.println("\nBefore Sorting");
		
		for(String object: company)
		{
			System.out.println(object);
		}
		//get(index)
				String value=company.get(1);
				System.out.println("\nThe index 1 st poition value is " +value);
		//remove()
				company.remove("ABC");
		//contains()--return boolean value
		System.out.println(company.contains("ABC"));
		
		System.out.println("\nSorting the Company Names below:");
		//Sort the array
        Collections.sort(company);	
        for(String object: company)
		{
			System.out.println(object);
		}
        System.out.println("\n");
        //reverse the array
        System.out.println("Reverse Order: \n");
        Collections.reverse(company);
        for(String object: company)
		{
			System.out.println(object);
		}

	}


}