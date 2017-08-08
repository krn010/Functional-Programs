import java.util.*;
import java.io.*;
public class Arrays
{
public static void main(String args[])
	{
	int row, col, i, j;
	int arr[][] = new int[10][10];
		
		PrintWriter pw1 = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		pw1.print("Enter number of row for array(Max 10): ");
		pw1.flush();
		row = sc.nextInt();

		pw1.print("Enter number of column for array(Max 10): ");
		pw1.flush();
		col = sc.nextInt();
		
		pw1.print("Enter" +row*col+ " array elements");
		pw1.flush();
		
		for(i=0;i<row;i++)
			{
			for(j=0;j<col;j++)
			{
			arr[i][j] = sc.nextInt();
			}
			}
		pw1.print("The array is: \n");
		for(i=0;i<row;i++)
			{
			for(j=0;j<col;j++)
			{
			pw1.print(arr[i][j]+ "   ");
			}
			pw1.println();
		
			}
		pw1.flush();
		pw1.close();
	}
}
