import java.util.*;
import java.lang.*;
public class Q3
{
	public static void main3(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the  number:");
	int a=input.nextInt();
	int b=0;
	while(a>0)
	{
	    a=a/10;
	    b++;
	}
	System.out.println(b);
	}
}
