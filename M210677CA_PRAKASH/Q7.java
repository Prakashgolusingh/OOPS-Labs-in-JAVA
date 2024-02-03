import java.util.*;
public class Q7
{
	public static void main(String[] args) 
	{
	    Scanner scn=new Scanner(System.in);
	    int x=scn.nextInt();
	    scn.nextLine();
	    String str=scn.nextLine();
	    String strs[]=str.split(" ");
	    int n=strs.length;
	    int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=Integer.parseInt(strs[i]);
		}
		Arrays.sort(arr);
        int flag=0;
		int count=1;
		for(int i=n-1;i>0;i--)
		{
		    
		    if(arr[i]==arr[i-1])
		    {
		        count++;
		        if(i==1&& count>x)
		            System.out.print(arr[i]+" ");
		    }
		    else
		    {
		        if(count>x)
		        {
		            System.out.print(arr[i]+" ");
		            flag=1;
		        }
		            
		        count=1;
		    }
		        
		}
		if(flag==0)
		    System.out.print("NULL");
	}
}
