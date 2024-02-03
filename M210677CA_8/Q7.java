import java.util.*;
public class Q7
{
	public static void main(String[] args) {
	      Scanner scn=new Scanner(System.in);
	      String str=scn.nextLine();
	      try
	      {
	            int it=Integer.parseInt(str,16);
	            System.out.println(it);
	      }
	      catch(NumberFormatException ae)
	      {
	            System.out.println("ivalidHexadecimal");
	      }
	      
	}
}
