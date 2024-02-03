import java.util.*;
import java.lang.*;
public class Q7
{
	public static void main(String[] args) 
	{
	      Scanner input=new Scanner(System.in);
	      System.out.println("Enter the  number:");
	      int n=input.nextInt();
	      int a=0;
	      int b=1;
	      if(n>0)
	      {
	            if(n%2==0)
	            {
	                  if(n==2)
	                        System.out.print(a+" "+b);
                        else
	                  {
	                        System.out.print(a+" "+b);
	                        for(int i=4;i<=n;i+=2)
	                        {
	                              a+=b;
	                              b+=a;
	                              System.out.print(a+" "+b+" ");
	                        }
	                  }
	            }
	            else
	            {
	                  if(n==1)
	                        System.out.print(a);
	                  else
	                  {
                              System.out.print(a+" ");
	                        for(int i=3;i<=n;i+=2)
	                        {
	                              System.out.print(b+" ");
	                              a+=b;
	                              b+=a;
	                              System.out.print(a+" ");
	                        }
	                  }
	            }
            }
      }
}