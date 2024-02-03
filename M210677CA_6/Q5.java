import java.util.*;
abstract class Student
{
      String name;
      String roolno;
      String degree;
      int Fee;
      abstract int getFeeDetails();
      void setFeeDetails(int a)
      {
            Fee=a;
      }
}
class Undergraduate extends Student
{
      int getFeeDetails()
      {
            return Fee;
      }
}
class Postgraduate extends Student
{
      int getFeeDetails()
      {
            return Fee;
      }
}
public class Q5
{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int UGFee=scn.nextInt();
		int PGFee=scn.nextInt();
		int n=scn.nextInt();
		scn.next();
		Student arr[]=new Student[n];
		for(int i=0;i<n;i++)
		{
		      String str=scn.nextLine();
		      String strarr[]=str.split(" ");
		      if(strarr[2].equals("UG"))
		      {
		            Student a=new Undergraduate();
		            a.name=strarr[0];
		            a.roolno=strarr[1];
		            a.degree=strarr[2];
		            a.setFeeDetails(UGFee);
		            arr[i]=a;
		      }
		      if(strarr[2].equals("PG"))
		      {
		            Student a=new Postgraduate();
		            a.name=strarr[0];
		            a.degree=strarr[2];
		            a.roolno=strarr[1];
		            a.setFeeDetails(PGFee);
		            arr[i]=a;
		      }
		}
		String search=scn.next();
		for(int i=0;i<n;i++)
		{
		      if(arr[i].roolno.equals(search))
		      {
		            System.out.println(arr[i].getFeeDetails());
		      }
		}
	}
}
