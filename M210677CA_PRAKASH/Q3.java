package lab6;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the array element: ");
		String str=scn.nextLine();
		String str1[]=str.split(" ");
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
		
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int c1=0;
		int c2=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				arr2[c2]=arr[i];
				c2++;
			}
			else
			{
				arr1[c1]=arr[i];
				c1++;
			}
		}
		System.out.print("Even array: ");
		for(int i=0;i<c2;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.print("Odd array: ");
		for(int i=0;i<c1;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}

}
