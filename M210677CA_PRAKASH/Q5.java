package lab6;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter modified String: ");
		String str=scn.nextLine().trim();
		int n=str.length();
		String str1="";
		if(n%2==0)
		{
			for(int i=n-2;i>=0;i=i-2)
			{
				str1=str1.concat(String.valueOf(str.charAt(i)));
			}
			for(int i=1;i<n;i=i+2)
			{
				str1=str1.concat(String.valueOf(str.charAt(i)));
			}
		}
		else
		{
			for(int i=n-2;i>0;i=i-2)
			{
				str1=str1.concat(String.valueOf(str.charAt(i)));
			}
			for(int i=0;i<n;i=i+2)
			{
				str1=str1.concat(String.valueOf(str.charAt(i)));
			}
		}
		System.out.println(" rt");
		System.out.println(str1);
		scn.close();
	}

}
