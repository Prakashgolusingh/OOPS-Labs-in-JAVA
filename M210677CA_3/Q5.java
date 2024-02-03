/* At the government hospital treating patients for Covid, the management is preparing
a token system that gives priority to senior citizens who want to get tested over other
patients. Let Patient is a subclass of Person. A person has a person_name and a
patient has a patient_ID. A patient_ID have the following format: <xxxx-yyy> where xxxx
is the entrycode and yyy is the patient's age. Write a java program to read details of N
number of patients, and show their names in the order of age. That is, display the Name
of the person who needs to be tested first and then second person and so on.*/
import java.util.*;
import java.math.*;
class Person
{
      
      String name;
}
class Patient extends Person
{
      String id;
}
public class Main
{
	public static void main(String[] args) 
	{
	      Scanner input=new Scanner(System.in);
	      System.out.print("Enter the number of patients: ");
	      int n=input.nextInt();
	      input.nextLine();
	      ArrayList<Patient> arr=new ArrayList<Patient>();
	      for(int i=0;i<n;i++)
	      {
	            System.out.println("Enter the details of patients "+(i+1)+":");
	            Patient a=new Patient();
	            System.out.print("Name:");
	            a.name=input.nextLine();
	            System.out.print("Patient ID: ");
	            a.id=input.nextLine();
	            arr.add(a);
	      }
	      while(arr.size()>=0)
	      {
	            int min=Integer.MIN_VALUE;
	            int index=0;
	            for(int i=0;i<arr.size();i++)
	            {
	                  String splitted_id[]=arr.get(i).id.split("-");
	                  int age=Integer.parseInt(splitted_id[1]);
	                  if(age>min)
	                  {
	                        min=age;
	                        index=i;
	                  }
	            }
	            System.out.println(arr.get(index).id+" "+arr.get(index).name);
	            arr.remove(index);
	            if(arr.size()==0)
	                  break;
	      }
	}
}