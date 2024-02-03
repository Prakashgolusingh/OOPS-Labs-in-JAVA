import java.util.*;
class Angle
{
      int degrees;
      int minutes;
      Angle(int degrees,int minutes)
      {
           this.degrees=degrees;
           this.minutes=minutes;
      }
}
public class Main
{
	public static void main(String args[])
	{
            Scanner in=new Scanner(System.in);
		String str = in.nextLine();
		String str1 = in.nextLine();
            String split_str[]=str.split(" ");
            String split_str1[]=str1.split(" ");
            if(split_str1.length!=split_str.length)
                System.exit(0);
            Angle a=new Angle(Integer.parseInt(split_str[0]),Integer.parseInt(split_str[1]));
            Angle b=new Angle(Integer.parseInt(split_str1[0]),Integer.parseInt(split_str1[1]));
            angleSum(a,b);
	}
	public static void angleSum(Angle a,Angle b)
	{
	      int arr[]=new int[2];
	      arr[0]=(a.degrees+b.degrees)+(a.minutes+b.minutes)/60;
	      arr[1]=(a.minutes+b.minutes)%60;
	      Angle c=new Angle(arr[0],arr[1]);
            System.out.printf(c.degrees+" "+c.minutes);
	}
}
