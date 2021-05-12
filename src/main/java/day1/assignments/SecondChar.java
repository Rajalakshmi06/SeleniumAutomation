package day1.assignments;

public class SecondChar {
	public static void main(String arg[])
	{
		String s="Cognizant Center";
		System.out.println(s);
		int count=0;
		char[] a=s.toCharArray();
		
		for (int i=a.length-1;i>=0;i--)
		{
			if(a[i]=='C')
			{
				count=count+1;
			}
			if(count==2)
			{
				char b=a[i];
				System.out.println(s.charAt(i));
				System.out.println(s.indexOf(b));
			}
		}
	}

}
