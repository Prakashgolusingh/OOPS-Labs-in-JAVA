import java.util.*;
interface ShapeArea
{
      void area(int a);
}
class Circle implements ShapeArea
{
     
      public void area(int a)
      {
            System.out.print(22*a*a/7);
      }
}
class Square implements ShapeArea
{
      public void area(int a)
      {
            System.out.print(a*a);
      }
}
public class Main
{
	public static void main(String[] args) 
	{
	      Scanner scn=new Scanner(System.in);
	      String str=scn.nextLine();
	      if(str.equals("Circle"))
	      {
	            int radius=scn.nextInt();
	            Circle obj0=new Circle();
	            obj0.area(radius);
	      }
            else if(str.equals("Square"))
            {
                  int length=scn.nextInt();
                  Square obj1=new Square();
                  obj1.area(length);
            }
	}
}
