/* Write a Java program to sort (ascending order) the student data on the basis of their height
(Make your own Student class with data members: rollNumber, fullName, height, weight and with
member functions: readStudent, printStudentDetails).*/
import java.util.*;
class Student
{
      String rollNumber;
      String fullName;
      int height;
      String weight;
      public  static Student readStudent(String str)
      {
	      String student_splitted_details[]=str.split(", ");
	      Student a=new Student();
	      a.rollNumber = student_splitted_details[0];
	      a.fullName = student_splitted_details[1];
	      a.height = Integer.parseInt(student_splitted_details[2].substring(0,3));
	      a.weight = student_splitted_details[3];
	      return a; 
      }
      public static void printStudentDetails(Student a)
      {
            
            System.out.println(a.rollNumber+" "+a.fullName+" "+a.height+"cm"+" "+a.weight);     
      }
      public int compareTo(Student arr)
      {
            return this.height-height;
      }
}
public class Main
{
	public static void main(String[] args) 
	{
	      Scanner input=new Scanner(System.in);
	      System.out.print("Enter the number of students ");
	      int n=input.nextInt();
	      input.nextLine();
	      
	      Student arr[]=new Student[n];
	      
	      System.out.println("Enter details ");
	      for(int i=0;i<n;i++)
	      {
	            String student_details=input.nextLine();
	            arr[i] = Student.readStudent(student_details);
	      }
	      for(int i=0;i<n;i++)
	      {
	            for(int j=0;j<n-1;j++)
	            {
	                  if(arr[j].height>arr[j+1].height)
	                  {
	                        Student temp=arr[j];
	                        arr[j]=arr[j+1];
	                        arr[j+1]=temp;
	                  }
	            }
	      }
	      for(int i=0;i<n;i++)
	      {
	            Student aa=arr[i];
	            Student.printStudentDetails(aa);
	      }
		
	}
}
