import java.util.*;
interface Bankfn
{
      void convertRupees(int a);
      void convertDollar(int a);
      void convertPound(int a);
}
class Bank implements Bankfn
{
      int balance;
      Bank(int balance)
      {
            this.balance=balance;
      }
      public void convertRupees(int a)
      {
            balance-=a;
      }
      public void convertDollar(int a)
      {
            a*=70;
            balance-=a;
      }
      public void convertPound(int a)
      {
            a*=100;
            balance-=a;
      }
      void getbalance()
      {
            if(balance>-1)
            System.out.print(balance);
            else
            System.out.print("-1");
      }
}
public class Main
{
	public static void main(String[] args) 
	{
	      Scanner scn=new Scanner(System.in);
            int balance=scn.nextInt();
            int A=scn.nextInt();
            int B=scn.nextInt();
            int C=scn.nextInt();
            Bank obj=new Bank(balance);
	      obj.convertRupees(A);
	      obj.convertDollar(B);
	      obj.convertPound(C);
	      obj.getbalance();
	}
}
