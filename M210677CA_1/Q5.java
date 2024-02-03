import java.util.*;
import java.lang.*;
public class Q5
{
	public static void main(String[] args) 
	{
	      Scanner input=new Scanner(System.in);
	      System.out.println("Enter the  number:");
	      int n=input.nextInt();
	      int arr[]=new int[n];
	      for(int i=n-1;i>-1;i--)
            {
                  arr[i]=input.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                  for(int j=i;j<n;j++)
                  {
                        if(arr[i]>arr[j])
                        {
                              int a=arr[i];
                              arr[i]=arr[j];
                              arr[j]=a;
                        }
                  }
            }
            for(int i=n-1;i>-1;i--)
            {
                  System.out.print(arr[i]+" ");
            }
      }
}
