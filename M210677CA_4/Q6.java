import java.util.*;
class Point
{
      int abscissa;
      int ordinate;
      Point(int abscissa,int ordinate)
      {
           this.abscissa=abscissa;
           this.ordinate=ordinate;
      }
}
public class Main
{
	public static void main(String args[])
	{
            Scanner in=new Scanner(System.in);
		String str = in.nextLine();
		String str1 = in.nextLine();
            String split_str[]=str.split(",");
            String split_str1[]=str1.split(",");
            if(split_str1.length!=2||split_str.length!=2)
            {
                  System.out.println("INVALID");
                  System.exit(0);
            }
            Point a=new Point(Integer.parseInt(split_str[0]),Integer.parseInt(split_str[1]));
            Point b=new Point(Integer.parseInt(split_str1[0]),Integer.parseInt(split_str1[1]));
            float arr[]=midpoint(a,b);
            Point c=new Point((int)arr[0],(int)arr[1]);
            System.out.printf("%.2f,%.2f",arr[0],arr[1]);
	}
	public static float[] midpoint(Point a,Point b)
	{
	      float arr[]=new float[2];
	      arr[0]=(a.abscissa+b.abscissa)/(float)2;
	      arr[1]=(a.ordinate+b.ordinate)/(float)2;
            return arr;
	}
}
