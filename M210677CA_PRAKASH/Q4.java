package lab6;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the array element: ");
		String str=scn.nextLine();
		String str1[]=str.split(", ");
		int n=str1.length;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(str1[i]);
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					int b=arr[i];
					arr[i]=arr[j];
					arr[j]=b;
				}
			}
		}
		System.out.println("Maximum value= "+arr[n-1]);
		System.out.println("Minimum value= "+arr[0]);
	}

}
