import java.util.*;
class Swatch 
{
	public static void main(String args[])
	{
		long startTime = System.currentTimeMillis();
		
		long total = 0;
		for(int i=0;i<10000000000;i++)
		{
			total += i;
		}
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println(elapsedTime);
	}
}
