/*Write a Java program that accepts a String, andremove all the duplicate characters from thatString.*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    String sentence=input.nextLine();
	    for(int findex=0;findex<sentence.length();findex++)
	    {
	        char char_sent=sentence.charAt(findex);
	        for(int sindex=findex+1;sindex<sentence.length();sindex++)
	        {
	            if(sentence.charAt(sindex)==char_sent)
	                sentence=sentence.substring(0,sindex)+sentence.substring(sindex+1);
	        }
	    }
	    System.out.println(sentence);
	    
	}
}

