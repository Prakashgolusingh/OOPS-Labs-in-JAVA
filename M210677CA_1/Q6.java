import java.util.*;
import java.lang.*;
public class Q6
{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the  number:");
	int a=input.nextInt();
	int d=a;
	int b=0,c=0;
	while(a>0)
	{
	    c=c*10+(a%10);
	    a=a/10;
	    
	    b++;
	}
	if(d==c)
	      System.out.println("True");
	else
	      System.out.println("False");
	}
}
