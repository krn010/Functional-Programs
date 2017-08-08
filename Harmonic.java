import java.util.*;
class Harmonic
{
public static void main(String args[])
		{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of N");
		n = sc.nextInt();
		double sum = 0.0;
		
		if(n!=0)
			{
			for (int i = 1;i <=n;i++)
				{
				sum = sum + (1.0/i);
				}
			
			System.out.println("Output of Harmonic Series is "+sum);
			}
			else
				{
				System.out.println("N cannot be zero");
				}
		}
}