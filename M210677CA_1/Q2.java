import java.util.*;
import java.lang.*;
public class Q2
{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("a: ");
	int a=input.nextInt();
	System.out.println("b:");
	int b=input.nextInt();
	System.out.println("a = "+a+"  b = "+b);
	a+=b;
	b=a-b;
	a=a-b;
	System.out.println("a = "+a+"  b = "+b);
	}
}
