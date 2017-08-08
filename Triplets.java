import java.util.*;
class Triplets
{
public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("How many integers you want to enter?");
	int N = sc.nextInt();
	
	int sum[] = new int[N];
	System.out.println("Enter the value of integers");
	for(int l=0;l<N;l++)
		{
		sum[l] = sc.nextInt();
		}
		for(int i=0;i<N-2;i++)
			{
			for(int j=0;j<N-1;j++)
				{
				for(int k=0;k<N;k++)
					{
					int data = sum[i]+sum[j]+sum[k];
					if(data==0)
					{
					System.out.println("  value of i  " +sum[i]+ "  value of j  " +sum[j]+ "  value of k  " +sum[k]);
					break;
					}
					
					}
				}
			}
	}
}
