import java.util.*;
import java.lang.*;
public class Q1
{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the base number:");
	int a=input.nextInt();
	System.out.println("Enter the exponent:");
	int b=input.nextInt();
	System.out.println((int)Math.pow(a,b));
	}
}
