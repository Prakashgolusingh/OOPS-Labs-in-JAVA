import java.util.*;
public class Q9
{
	public static void main(String[] args) 
	{
	      Scanner scn=new Scanner(System.in);
	      int it=scn.nextInt();
	      int sum1=((it-1)*it)/2;
	      for(int i=1;i<=it;i++)
	      {
	            int c=it-1;
	            for(int j=1;j<=i;j++)
	            {
	                 int sum2=(c*(c+1))/2;
	                        System.out.print(i+sum1-sum2+" ");
	                       c--;
	            }
	            System.out.println();
	      }
	}
}
