import java .util.*;
public class Main
{
	public static void main(String[] args) 
	{
	      Scanner in=new Scanner(System.in);
	      String a=in.nextLine();
	      String str[]=a.split(" ");
	      if(str.length==1)
	      {
	            area(Integer.parseInt(str[0]));
	      }
	      else if(str.length==2)
	      {
	            area(Integer.parseInt(str[0]),Integer.parseInt(str[1]));
	      }
	      else if(str.length==3)
	      {
	            area(Integer.parseInt(str[0]),Integer.parseInt(str[1]),Integer.parseInt(str[2]));
	      }
	}
	static void area(int r)
	{
	      System.out.print("Circle:");
	      float d=22*r*r/7;
	      System.out.printf("%.2f",d);
	}
	static void area(int l,int b)
	{
	      System.out.print("Rectangle:");
	      float d=l*b;
	      System.out.printf("%.2f",d);
	}
	static void area(int a,int b,int c)
	{
	      System.out.print("Triangle:");
	      float s=(a+b+c)/2;
	      double e=Math.sqrt(s*(s-a)*(s-b)*(s-c));
	      float d=(float)e;
	      System.out.printf("%.2f",d);
	}
}
