/* Create a class Employee(id, name, department, salary) and define a subclass
Manager of Employee with additional data member bonus. Now create some(n) objects
of manager class and display the details of manager's having a maximum
salary(including bonus). Input is given as the number of managers followed by their id,
name, department, salary and bonus*/
import java.util.*;
import java.math.*;
class Employee
{
      int id;
      String name;
      String department;
      int salary;
}
class manager extends Employee
{
      int bonus;
}
public class Main
{
	public static void main(String[] args) 
	{
	      Scanner input=new Scanner(System.in);
	      System.out.print("Enter the number of students ");
	      int n=input.nextInt();
	      input.nextLine();
	      manager arr[]=new manager[n];
	      for(int i=0;i<n;i++)
	      {
	            String details=input.nextLine();
	            String splitted_details[]=details.split(" ");
	            manager a=new manager();
	            a.id = Integer.parseInt(splitted_details[0]);
	            a.name = splitted_details[1];
	            a.department = splitted_details[2];
	            a.salary= Integer.parseInt(splitted_details[3]);
	            a.bonus= Integer.parseInt(splitted_details[4]);
	            arr[i] = a;
	      }
	      int sal=Integer.MIN_VALUE;
	      int b=0;
	      for(int i=0;i<n;i++)
	      {
	            b=arr[i].salary+arr[i].bonus;
	            if(b>sal)
	            sal=arr[i].salary+arr[i].bonus;
	      }
	      for(int i=0;i<n;i++)
	      {
	            b=arr[i].salary+arr[i].bonus;
	            if(b==sal)
	            System.out.println(arr[i].id+" "+arr[i].name+" "+arr[i].department+" "+arr[i].salary+" "+arr[i].bonus);
	      }
	}
}
