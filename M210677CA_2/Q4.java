/*Write Java program for Maximum length PalindromeSubstring of given String.*/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner input=new Scanner(System.in);
	    String given_string = input.nextLine();
	    int string_length=given_string.length();
	    String new_substring="";
	    int actual_length=0;
	    while(string_length>0)
	    {
	        for(int findex=0;findex<=given_string.length()-string_length;findex++)
	        {
	            new_substring=given_string.substring(findex,findex+string_length);
	            actual_length=length_palindrome(new_substring);
	            if(actual_length!=0)
	                break;
	        }
	        if(actual_length!=0)
	        {
	              System.out.println(actual_length);
	              break;
	        }
	        else
	            string_length--;
	    }
	}
	public static int length_palindrome(String substring)
	{
	   int flag=0;
	   int length=substring.length();
	   if(length==1)
	       return 1;
	   else if(length==3)
	       return 3;
	   else
	   {
	        for(int index=0;index<length/2;index++)
	        {
	           if(substring.charAt(index)!=substring.charAt(length-(1+index)))
	           {
	               flag=1;
	               break;
	           }
	       }
	    }
        if(flag==0)
	       return length;
	    else
	       return 0;
	}
}

