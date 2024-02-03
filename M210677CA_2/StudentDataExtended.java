package Std;
public class Student
{
      private String name;
      private String id;
      Student(String name,String id)
	{
	      this.name=name;
	      this.id=id;
	}
	private getdetais()
	{
	      
	}
}



import Std;
import java.util.*;
class Student extends StudentData
{
      private String location;
      public void setter(String name,String id,String location)
      {
            
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
	      
	      ArrayList<Student> arr[]=new ArrayList<Student>[n];
	      
	      System.out.println("Enter the details of Student "(i+1)+"(id,name,location");;
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
