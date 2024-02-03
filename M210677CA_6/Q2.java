import java.util.*;
class Bank
{
      int R=0;
      void intrest(int X,int N)
      {
            System.out.println("Bank intrest is : "+R*X*N/100);
      }
}
class SBI extends Bank
{
      int R=5;
      void intrest(int X,int N)
      {
            System.out.println("Bank intrest is : "+R*X*N/100);
      }
}
class ICICI extends Bank
{
      int R=6;
      void intrest(int X,int N)
      {
            System.out.println("Bank intrest is : "+R*X*N/100);
      }
}
class AXIS extends Bank
{
      int R=7;
      void intrest(int X,int N)
      {
            System.out.println("Bank intrest is : "+R*X*N/100);
      }
}

public class Q2
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter amount and time in year with space");
		int X=scn.nextInt();
		int N=scn.nextInt();
		SBI obj=new SBI();
		ICICI obj2=new ICICI();
		AXIS obj3=new AXIS();
		obj.intrest(X,N);
		obj2.intrest(X,N);
		obj3.intrest(X,N);
	}
}
