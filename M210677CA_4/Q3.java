import java.util.*;
class IntegerArray
{
      int arr[]=new int[5];
      public void inputdata(String str)
      {
            String split_str[]=str.trim().split(" ");
		for (int i = 0; i < 5; i++) 
		{
			arr[i]=Integer.parseInt(split_str[i]);
		}
      }
      public void bubsort(int arr[])
      {
            for(int i=0;i<5;i++)
		{
		      for(int j=0;j<5-i-1;j++)
		      {
		            if(arr[j]>arr[j+1])
		            {
		                int a=arr[j];
		                arr[j]=arr[j+1];
		                arr[j+1]=a;
		            }
		      }
		}
		for(int i=0;i<4;i++)
		{
		      if(arr[i]==arr[i+1])
		      {
		            System.out.print("INVALID INPUT");
		            System.exit(0);
		      }
		}
		for(int i=0;i<5;i++)
		{
		      System.out.print(arr[i]+" ");
		}
      }
}
public class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str = in.nextLine();
            IntegerArray a=new IntegerArray();
            a.inputdata(str);
		a.bubsort(a.arr);
	}
}
