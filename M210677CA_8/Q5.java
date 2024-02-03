import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      Scanner scn=new Scanner(System.in);
	      int x=scn.nextInt();
	      int y=scn.nextInt();
	      int n=scn.nextInt();
	      scn.nextLine();
	      try{
	      for(int i=0;i<n;i++)
	      {
	            String str=scn.nextLine();
	            String stbr[]=str.split(" ");
	            if(stbr[0].equals("Down"))
	            {
	                  x+=Integer.parseInt(stbr[1]);
                        if(x>8)
	                  {
	                  throw new ArithmeticException("Overflow");
	                 }
                 }
                 if(stbr[0].equals("Up"))
	            {
	                  x-=Integer.parseInt(stbr[1]);
                        if(x<1)
	                  {
	                  throw new ArithmeticException("Overflow666666");
	                 }
                 }
                 if(stbr[0].equals("Right"))
	            {
	                  y+=Integer.parseInt(stbr[1]);
                        if(y>8)
	                  {
	                  throw new ArithmeticException("Overflow");
	                 }
                 }
                 if(stbr[0].equals("Left"))
	            {
	                  y-=Integer.parseInt(stbr[1]);
                        if(y<1)
	                  {
	                  throw new ArithmeticException("Overflow");
	                 }
                 }
	      }
	      System.out.println("["+x+","+y+"]");
	      }
	      catch(ArithmeticException ae)
	      {
	            System.out.println(ae.getMessage());
	      }
	      
	}
}
