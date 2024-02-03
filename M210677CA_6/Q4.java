import java.util.*;
abstract class Addition
{
      public abstract void add();
}
class IntegerAddition extends Addition
{
      int a,b;
      IntegerAddition(int a,int b)
      {
            this.a=a;
            this.b=b;
      }
      public void add()
      {
            System.out.println(a+b);
      }
}
class FractionAddition extends Addition
{
      int a,b,c,d;
      FractionAddition(int a,int b,int c,int d)
      {
            this.a=a;
            this.b=b;
            this.c=c;
            this.d=d;
      }
      public void add()
      {
            int e=(a*d)+(b*c);
            int f=b*d;
            a=e;
            b=f;
            while(a%b!=0)
            {
                  c=a%b;
                  a=b;
                  b=c;
            }
            System.out.println(e/b+"/"+f/b);
      }
}
public class Q4
{
	public static void main(String[] args) 
	{
	      Scanner scn=new Scanner(System.in);
	      int a=scn.nextInt();
	      int b=scn.nextInt();
	      IntegerAddition obj=new IntegerAddition(a,b);
	      obj.add();
	      a=scn.nextInt();
	      b=scn.nextInt();
	      int c=scn.nextInt();
	      int d=scn.nextInt();
	      FractionAddition obj1=new FractionAddition(a,b,c,d);
	      obj1.add();
	}
}
