import java.util.*;
class Employee
{
      int employeeId;
      String EmployeeName;
      int salary;
      int calculateSalary()
      {
            return 0;
      }
}
class PermanentEmployee extends Employee
{
      int basicPay;
      static int PFAmout=12;
      PermanentEmployee(int employeeId,String Name,int basicPay)
      {
            this.employeeId=employeeId;
            this.EmployeeName=Name;
            this.basicPay=basicPay;
            this.salary=CalculateSalary();
      }
      int CalculateSalary()
      {
            salary=basicPay-(basicPay*12/100);
            return salary;
      }
}
class TemporaryEmployee extends Employee
{
      int hoursWorked;
      int hourlyWages;
      TemporaryEmployee(int employeeId,String Name,int hoursWorked,int hourlyWages)
      {
            this.employeeId=employeeId;
            this.EmployeeName=Name;
            this.hoursWorked=hoursWorked;
            this.hourlyWages=hourlyWages;
            this.salary=CalculateSalary();
      }
      int CalculateSalary()
      {
            salary=hourlyWages*hoursWorked;
            return salary;
      }
}
public class Main
{
      public static void main(String args[])
      {
            Scanner scn=new Scanner(System.in);
            int n=scn.nextInt();
            scn.nextLine();
            Employee arr[]=new Employee[n];
            for(int i=0;i<n;i++)
            {
                  String a=scn.nextLine();
                  String str[]=a.split(" ");
                  Employee b;
                  if(str[0].equals("1"))
                  {
                        b=new PermanentEmployee(Integer.parseInt(str[1]),str[2],Integer.parseInt(str[3]));
                        arr[i]=b;
                  }
                  else
                  {
                        b=new TemporaryEmployee(Integer.parseInt(str[1]),str[2],Integer.parseInt(str[3]),Integer.parseInt(str[4]));
                        arr[i]=b;
                  }
            }
            int c=scn.nextInt();
            scn.close();
            int flag=0;
            
            for(int i=0;i<n;i++)
            {
                  Employee b=arr[i];
                  if(c==arr[i].employeeId)
                  {
                        flag=1;
                        System.out.println(arr[i].employeeId+" "+arr[i].EmployeeName+" "+arr[i].salary);
                  }
            }
            if(flag==0)
                  System.out.println("-1");
      }
}