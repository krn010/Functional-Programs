import java.util.*;
class Power
{
public static void main(String args[])
	{
	int num = Integer.parseInt(args[0]);
	if(num>0 && num<31)
		{
		for(int i=0;i<num;i++)
			{
			System.out.println("The power of 2^"+i+   "       "   +(int)Math.pow(2,i));
			}
		}
		else
			{
			System.out.println("Number is out of range");
			}
	}
}
