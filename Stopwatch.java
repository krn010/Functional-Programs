import java.util.*;
import java.lang.*;
import java.io.*;

class Stopwatch
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Stopwatch s = new Stopwatch();
		String sel;
		System.out.println("Select the option either to start or stop");
		sel=sc.next();
		
		if(sel.equalsIgnoreCase("start"))
		{
			System.out.println("Time count is starting");
			s.start();
		}
		else if(sel.equalsIgnoreCase("stop"))
		{
			s.stop();
		}
		else if(sel.equalsIgnoreCase("exit"))
		{
			s.exit();
		}
		else
		{
			System.out.println("Invalid option");
		}
	}
	
	double t1,t2,total;
	String ch;
	Scanner sc = new Scanner(System.in);
	void start()
	{
		t1=(System.currentTimeMillis())/1000;
		System.out.println("The started time is " +t1);
		System.out.println("Do you want to stop Y/N");
		ch=sc.next();
		if(ch.equalsIgnoreCase("y"))
		{
			stop();
		}
		else
		{
			exit();
		}
	}
	void stop()
	{
		t2=(System.currentTimeMillis())/1000;
			total = t2-t1;
			System.out.println("Elapsed time is " +total);
	}
	void exit()
	{
		System.out.println("Time count has ended");
	}
}