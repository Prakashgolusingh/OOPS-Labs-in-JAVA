/*Write a Java program to calculate the mess billin a hostel. 
An inmate can be either a student oran employee. 
The per day mess rate  for vegetariansis 100 and for non vegetarian 120.
Anemployee needs to pay 5% of the total price extra.
Calculate the total mess bill with respect toinput details. 
Assume that the name of a student oremployee has a single word. 
(All assumptionsshould be clearly specified in the submission)*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.println("Enter the inmate details: ");
	    String sentence=input.nextLine();
	    System.out.println("Enter the number of days: ");
	    int days=input.nextInt();
	    int total_bill;
	    String split_sentence[]=sentence.split(" ");
	    if(split_sentence[2].equals("nonveg"))
	        total_bill=days*120;
	    else
	    total_bill=days*100;
	    if(split_sentence[1].equals("employee"))
	        total_bill+=(total_bill*0.05);
	    System.out.println(total_bill);
	    
	}
}

