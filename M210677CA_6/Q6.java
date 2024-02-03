import java.util.*;
class Customer
{
      String Name;
      String Mobile;
      String Membership;
}
class Service
{
      int FaceWash;
      int HairCut;
}
class Membership
{
      static int premium()
      {
            return 20;
      }
      static int gold()
      {
            return 15;
      }
      static int silver()
      {
            return 10;
      }
      static int none()
      {
            return 0;
      }
}
public class Q6
{
	public static void main(String[] args) 
	{
	      Customer obj=new Customer();
	      Scanner scn=new Scanner(System.in);
		System.out.print("Enter Customer Details:\nName:");
		String Nm=scn.nextLine();
		obj.Name=Nm;
		System.out.print("Mobile:");
		String Mb=scn.nextLine();
		obj.Mobile=Mb;
		System.out.print("Membership:");
		String memb=scn.nextLine();
		obj.Membership=memb;
		Service obj1=new Service();
		Membership obj2=new Membership();
		int t=0;
		int t1=0;
		int t2=0;
		System.out.print("Add Service");
		String add=scn.nextLine();
		while(add.equals("Y"))
		{
		      System.out.print("\nServiceName:");
		      String nm1=scn.nextLine();
		      System.out.print("\nRate:");
		      int rt1=scn.nextInt();
		      scn.nextLine();
		      if(nm1.equals("FaceWash"))
		      {
		            obj1.FaceWash=rt1;
		            t1+=rt1; 
		      }
		           
		      else
		      {
		            obj1.HairCut=rt1;
		            t2+=rt1;
		      }
		      System.out.print("Add Service");
		      add=scn.nextLine();
		}
		t=t1+t2;
		System.out.println(obj.Name+"  "+obj.Mobile+"  "+memb);
		System.out.println("1. FaceWash  "+t1);
		System.out.println("2. HairCut  "+t2);
		int d=0;
		if(memb.equals("Premium"))
		      d=obj2.premium();
		else if(memb.equals("Gold"))
		      d=obj2.gold();
		else if(memb.equals("silver"))
		      d=obj2.silver();
		else 
		      d=obj2.none();
		int d1=t*d/100;
		System.out.println("Total: "+t+"-"+d1);
		t=t-d1;
		System.out.println("Please Pay: "+t);
	}
}
