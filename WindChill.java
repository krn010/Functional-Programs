import java.util.*;
import java.lang.*;
import java.io.*;

class WindChill
{
	public static void main(String args[])
	{
		double t,v;
		double ab1,ab2,total;
		t=Double.parseDouble(args[0]);
		v=Double.parseDouble(args[1]);
		if(t>50||v>120||v<3)
		{
			System.out.println("The values are not in correct range");
		}
		else
		{
			ab1=Math.pow(v,0.16);
			ab2=((0.4275*t)-35.75);
			total=(35.74+(0.6215*t)+((ab1*ab2)));
			System.out.println(total);
		}
	}
}	