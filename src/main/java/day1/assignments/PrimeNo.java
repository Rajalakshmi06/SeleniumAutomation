package day1.assignments;

public class PrimeNo {
	public static void main(String args[])
	{
		int n=13; int i=0;
		boolean flag=false;
		for ( i=2;i<=n/2;i++)
			
		{
			System.out.println(n/2);
			if(n%i==0)
			{
				flag=true;
				break;
				
			}
			System.out.println(n+"  "+i);
		}
		if(flag==false)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}
/* int n=13 ; int i=2;
	 while(i<=n/2)
	 {
	 if(n%i==0)
	 {
	 	flag=false;
	 	break;
	 }
	 n++;*/
	 
}
