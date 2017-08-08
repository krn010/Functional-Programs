import java.util.*;
class Factors 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		while(num%2==0)
		{
			System.out.print(2+"   ");
			num=num/2;
		}
		for(int i=3;i*i<num;i=i+2)
		{
			while(num%i==0)
			{
			System.out.print(i+"   ");
			num=num/i;
			}
		}
		System.out.println(num);
		if(num>2)
		{
			System.out.print(num);
		}
	}
}