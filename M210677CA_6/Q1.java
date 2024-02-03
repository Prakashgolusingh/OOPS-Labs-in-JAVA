import java.util.*;
class Oop
{
      public void display(char a,int n)
      {
            for(int i=0;i<n;i++)
            {
                  for(int j=0;j<=i;j++)
                        System.out.print(a+" ");
                  System.out.println();
            }
      }
      public void display(int n)
      {
            System.out.print(n*(n+1)/2);
      }
      public void display(int a,int b)
      {
            System.out.print(a*a+b*b);
      }
}
public class Q1
{
	public static void main(String[] args) {
		System.out.println("choose\n1 ->char,int \n2->Int\n3 ->int,int");
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		scn.nextLine();
		Oop obj=new Oop();
		if(a==1)
		{
		      String str=scn.next();
		      char chr=str.charAt(0);
		      int nt=scn.nextInt();
		      obj.display(chr,nt);
		}
		if(a==2)
		{
		      int nt=scn.nextInt();
		      obj.display(nt);
		}
		if(a==3)
		{
		      int nt=scn.nextInt();
		      int nt1=scn.nextInt();
		      obj.display(nt,nt1);
		}
	}
}
