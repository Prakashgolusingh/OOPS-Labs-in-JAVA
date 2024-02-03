import java .util.*;
public class Main
{
	public static void main(String[] args) 
	{
	      Scanner in=new Scanner(System.in);
	      String a=in.nextLine();
	      String str[]=a.split(" ");
	      if(str.length==2)
	      {
	            bitwise(Integer.parseInt(str[0]),Integer.parseInt(str[1]));
	      }
	      else if(str.length==3)
	      {
	            bitwise(Integer.parseInt(str[0]),Integer.parseInt(str[1]),Integer.parseInt(str[2]));
	      }
	}
	static void bitwise(int a,int b)
	{
	      System.out.print(a&b);
	}
	static void bitwise(int a,int b,int c)
	{
	      System.out.print(a&b&c);
	}
}
