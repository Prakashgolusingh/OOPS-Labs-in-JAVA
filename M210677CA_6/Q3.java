import java.util.*;
class Square
{
      int a;
      Square(int a)
      {
            this.a=a;
      }
      public void Perimeter()
      {
            System.out.println("Square Perimeter "+a*4);
      }
      public void Area()
      {
            System.out.println("Square Area "+a*a);
      }
}
class Rectangle extends Square
{
      int b;
      Rectangle(int a,int b)
      {
            super(a);
            this.b=b;
      }
      public void Perimeter()
      {
            System.out.println("Recangle Perimeter "+((a+b)*2));
      }
      public void Area()
      {
            System.out.println("Rectangle Area "+a*b);
      }
}
public class Q3
{
	public static void main(String[] args) {
		System.out.println("choose\n1 -> Square \n2 -> Rectangle");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		if(a==1)
		{
		      int nt=scn.nextInt();
		      Square obj=new Square(nt);
		      obj.Perimeter();
		      obj.Area();
		}
		if(a==2)
		{
		      int nt=scn.nextInt();
		      int nt1=scn.nextInt();
		      Rectangle obj=new Rectangle(nt,nt1);
		      obj.Perimeter();
		      obj.Area();
		}
	}
}