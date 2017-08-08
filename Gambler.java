import java.util.*;
class Gambler
{
public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int stake,goal,time,win=0,loss=0;
	double win_per,loss_per;
	System.out.println("Enter amount of money in stake");
	stake = sc.nextInt();
	
	System.out.println("Enter amount of money to reach the goal");
	goal = sc.nextInt();
	
	System.out.println("Enter no of times the bet is placed");
	time = sc.nextInt();
	
	if(time>0)
		{
			for(int i=1;i<=time;i++)
				{
				 	System.out.println("No of chances :"+i);
					
					if(stake==goal)
						{
						System.out.println("Goal is reached");
						break;
						}
					else if(stake==0)
					 	{
						System.out.println("Sorry, money is over");
						break;
						}
                         double r=Math.random();
			if(r<0.4)
			{
			loss++;
		        System.out.println("You lost " +loss+ " times");
			}
			else
			{
			win++;
			System.out.println("You won" +win+ "times");
			}
			

				}
			loss_per=(double)loss/time*100;
			win_per=(double)win/time*100;
			System.out.println("% loss is: "+loss_per);
			System.out.println("% win is: "+win_per);

		
		}
			
	}
}
