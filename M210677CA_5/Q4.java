import java.util.*;
class Customer
{
      String customerName;
      String accountNo;
      int currentBalance;
      public void availableBalance()
      {
            System.out.print(customerName+":"+currentBalance);
      }
}
class Silver extends Customer
{
      Silver(String customerName,String accountNo,int currentBalance)
      {
            this.customerName=customerName;
            this.accountNo=accountNo;
            this.currentBalance=currentBalance;
      }
      int a=5;
      public  void availableBalance()
      {
            System.out.print(customerName+":"+currentBalance+":Silver:"+(currentBalance+((currentBalance*a)/100)));
      }
}
class Gold extends Customer
{
      Gold(String customerName,String accountNo,int currentBalance)
      {
            this.customerName=customerName;
            this.accountNo=accountNo;
            this.currentBalance=currentBalance;
      }
      int a=10;
      public void availableBalance()
      {
            System.out.print(customerName+":"+currentBalance+":Gold:"+(currentBalance+((currentBalance*a)/100)));
      }
}
class Platinum extends Customer
{
      Platinum(String customerName,String accountNo,int currentBalance)
      {
            this.customerName=customerName;
            this.accountNo=accountNo;
            this.currentBalance=currentBalance;
      }
      int a=15;
      public  void availableBalance()
      {
            System.out.print(customerName+":"+currentBalance+":Platinum:"+(currentBalance+((currentBalance*a)/100)));
      }
}
public class Main
{
	public static void main(String[] args) 
	{
	      Scanner in=new Scanner(System.in);
	      int a=in.nextInt();
	      in.nextLine();
	      Customer arr[]=new Customer[a];
	      for(int i=0;i<a;i++)
	      {
	            String b=in.nextLine();
	            String str[]=b.split(":");
                  int c=Integer.parseInt(str[2]);
                  if(c<100000)
                  {
                        Customer d=new Silver(str[0],str[1],c);
                        arr[i]=d;
                  }
                  if(c>=100000&&c<1000000)
                  {
                        Customer d=new Gold(str[0],str[1],c);
                        arr[i]=d;
                  }
                  if(c>=1000000)
                  {
                        Customer d=new Platinum(str[0],str[1],c);
                        arr[i]=d;
                  }
	      }
            for(int i=0;i<a;i++)
            {
                 Customer d=arr[i];
                 d.availableBalance();
                 System.out.println();
            }
	}
}
