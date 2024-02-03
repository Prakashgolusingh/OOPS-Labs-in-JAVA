import java.util.*;
public class Q11
{
	public static void main(String[] args) 
	{
	      Scanner scn=new Scanner(System.in);
	      String str=scn.nextLine().trim();
	      int n=str.length();
	      int flag=0;
	      for(int i=0;i<n;i++)
	      {
	            if(Character.isDigit(str.charAt(i)))
	            {
	                  flag=1;
	                  break;
	            }
	                  
	      }
	      if(flag==1)
	            System.out.println("INVALID");
	      else
	      {
	            int arr[]=new int[5];
	            for(int i=0;i<n;i++)
	            {
	                  if(str.charAt(i)=='a')
	                        arr[0]++;
	                  if(str.charAt(i)=='e')
	                        arr[1]++;
	                  if(str.charAt(i)=='i')
	                        arr[2]++;
	                  if(str.charAt(i)=='o')
	                        arr[3]++;
	                  if(str.charAt(i)=='u')
	                        arr[4]++;
	            }
	            for(int i=0;i<5;i++)
	            {
	                  if(arr[i]!=0)
	                  {
	                        flag=1;
	                        break;
	                  }
	            }
	            if(flag==0)
	            {
	                  System.out.println("NoVowel");
	            }
	            else
	            {
	                  int max=0;
	                  int indx=0;
	                  for(int i=0;i<5;i++)
	                  {
	                        if(arr[i]>max)
	                        {
	                              max=arr[i];
	                              indx=i;
	                        }
	                  }
	                  if(indx==0)
	                        System.out.print("a ");
	                  if(indx==1)
	                        System.out.print("e ");
	                  if(indx==2)
	                        System.out.print("i ");
	                  if(indx==3)
	                        System.out.print("o ");
	                  if(indx==4)
	                        System.out.print("u ");
	                  System.out.print(max);
	            }
	      }
	}
}
