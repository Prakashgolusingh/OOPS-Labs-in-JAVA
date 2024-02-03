import java.util.*;
interface HDFC
{
      void hdfcmethod(int a,int b);
}
interface ICICI
{
      void icicimethod(int a,int b);
}
class Flipkart implements HDFC,ICICI
{
      int fkaccount=0;
      int bankaccount;
      public void hdfcmethod(int a,int b)
      {
            bankaccount=a-b;
            fkaccount+=b;
            System.out.println(fkaccount+" "+bankaccount);
      }
      public void icicimethod(int a,int b)
      {
            bankaccount=a-b;
            fkaccount+=b;
            System.out.println(fkaccount+" "+bankaccount);
      }
}
public class Main
{
	public static void main(String[] args) 
	{
	      Scanner scn=new Scanner(System.in);
	      int it=scn.nextInt();
	      scn.nextLine();
	      String str[]=new String[it];
	      for(int i=0;i<it;i++)
	      {
	            str[i]=scn.nextLine();
	      }
	      Flipkart obj=new Flipkart();
	      for(int i=0;i<it;i++)
	      {
	            String str1[]=str[i].trim().split(" ");
	            if(str1[0].equals("HDFC"))
	            {
	                  obj.hdfcmethod(Integer.parseInt(str1[1]),Integer.parseInt(str1[2]));
	            }
	            if(str1[0].equals("ICICI"))
	            {
	                  obj.hdfcmethod(Integer.parseInt(str1[1]),Integer.parseInt(str1[2]));
	            }
	      }
	}
}
