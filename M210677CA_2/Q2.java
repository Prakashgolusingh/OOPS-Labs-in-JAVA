/*Write a Java program that accepts a sentence,and print the number of words in the sentenceand ASCII code of all the characters present in thesentence.*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    String sentence=input.nextLine();
	    for(int index=0;index<sentence.length();index++)
	    {
	        System.out.println("\'"+sentence.charAt(index)+"\' "+Integer.valueOf(sentence.charAt(index)));
	    }
	}
}

