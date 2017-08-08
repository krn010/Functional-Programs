import java.lang.Math.*;
import java.util.Scanner;

public class Distance
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first two points(x1,y1) :");
		double x1 =sc.nextDouble();
		double y1 =sc.nextDouble();
		
		double distance = Math.sqrt(Math.pow(x1,2) +Math.pow(y1,2));
		System.out.println("The distance of the two points is  " +distance);							
	}
}
