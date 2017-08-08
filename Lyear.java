import java.util.*;
class Lyear
{
public static void main(String args[])
{
int year;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the year");
year = sc.nextInt();
if(year>999)
{
		if(year%400==0 || (year%4 == 0 && year%100!= 0))
		{
		System.out.println("It is a leap year");
		}
		else
		{
		System.out.println("It ain't a leap year");
		}
						   
}

else 
{
System.out.println("Number is not valid");
}
}
}
				  
