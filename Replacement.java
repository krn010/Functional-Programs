import java.util.*;
class Replacement 
{
public static void main(String args[])
	
{
Scanner sc = new Scanner(System.in);
String a =sc.next();
String b = "Hello <<username>>,How are you";
	if(a.length()>=3)
	{
String c = b.replace("<<username>>",a);
	
System.out.println(c);
	}
	else
	{
		System.out.println("Minimum 3 characters needed");
	}
}
}