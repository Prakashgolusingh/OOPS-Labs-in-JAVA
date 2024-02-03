/* Write a Java program to find the new length of a given sorted array after removing the
occurrences more than twice from the duplicate elements.*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      Scanner input=new Scanner(System.in);
	      String sortedarr=input.nextLine();
	      System.out.println("The length of the original array is: "+sortedarr.length()/3);
		sortedarr=sortedarr.substring(1,sortedarr.length()-2);
		String splitedarr[]=sortedarr.split(", ");
	      int count =0;
	      int tempcount=1;
	      int no=Integer.parseInt(splitedarr[0]);
	      for(int pk=1;pk<splitedarr.length;pk++)
	      {
	            if(Integer.parseInt(splitedarr[pk])==no )
	            {
	                  tempcount++;
	            }
	            else 
	            {
	                  if(tempcount>1)
	                        count+=2;
	                  else
	                        count++;
	                 no=Integer.parseInt(splitedarr[pk]);
	                 tempcount=1;
	            }
	      }
	      if(tempcount>1)
	           count+=2;
	      else
                  count++;
	      System.out.println("After removing duplicates, the new length of the array is: "+count);
	}
}
