import java.util.*;
import java.lang.*;
import java.io.*;
class Coupons
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n;
		

		System.out.println("Enter the total number of values to be generated ");
		n=sc.nextInt();
		

		randomgen(n);
	}
		static void randomgen(int n)
	{
		int a[]=new int[n];
		int j;
		for(int i=0;i<n;i++)
		{	
				int temp=(int)(Math.random()*100);
				a[i]=temp;
				
				for(j=0;j<i;j++)
				{if(a[i]==a[j])
				{
				i--;
				break;
				}
				}
			
			
				

			
		}
		for(int i=0;i<n;i++)
		{

			System.out.println(a[i]);
		}	

				
		
	

	
}
}



