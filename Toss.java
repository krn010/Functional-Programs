import java.util.*;
class Toss
{
public static void main(String args[])
{
int tail = 0;
int head = 0;
double b,c;
Random r = new Random();
float max = 1.0f;
float min = 0.0f;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of times to flip coins");
int a = sc.nextInt();
if (a>0)
{
  				for(int i=0;i<a;i++)
  {
				float result = r.nextFloat() *(max - min) + min;
				if(result<0.5)
					{		
						System.out.println("Tossed the coin and the result is tails ");
						tail++;
					}
				else 
					{
System.out.println("Tossed the coin and the result is heads ");
head++;
					}
 }
 
 System.out.println("The number of tails is :"+tail);
 System.out.println("The number of heads is :"+head);
 b= (double)tail/a*100;
 c= (double)head/a*100;
 System.out.println("The percentage of heads coming is :"+c);
 System.out.println("The percentage of tail coming is :"+b);
 
 
 }
}
}
