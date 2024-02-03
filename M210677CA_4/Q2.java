import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str = in.nextLine();
            String split_str[]=str.split(" ");
            int n=split_str.length;
            int arr[]=new int[n];
		for (int i = 0; i < n; i++) 
		{
			arr[i]=Integer.parseInt(split_str[i]);
		}
		Arrays.sort(arr);
		int count=0;
		for(int i=n-1;i>-1;i--)
		{
		      for(int j=i-1;j>-1;j--)
		      {
		            for(int k=j-1;k>-1;k--)
		            {
		                  if(arr[k]+arr[j]==arr[i])
		                        count++;
		            }
		      }
		}
		System.out.print(count);
	}
}
