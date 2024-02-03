import java.util.*;
class Person
{
      String personName;
      String age;
      
}
class Student extends Person
{
      String rollNumber;
      String percentageMarks;
}
class PGStudent extends Student
{
      String elective;
      String numberOfStudents;
      PGStudent(String personName,String age,String elective,String percentageMarks)
      {
            this.personName=personName;
            this.age=age;
            this.elective=elective;
            this.percentageMarks=percentageMarks;
      }
}
class sortBypercentage implements Comparator<PGStudent>
{
      public int compare(PGStudent b,PGStudent a)
      {
            return a.percentageMarks.compareTo(b.percentageMarks);
      }
}
public class Main
{
      public static void main(String args[])
      {
            Scanner scn=new Scanner(System.in);
            int n=scn.nextInt();
            scn.nextLine();
            PGStudent arr[]=new PGStudent[n];
            for(int i=0;i<n;i++)
            {
                  String a=scn.nextLine();
                  String str[]=a.split(":");
                  PGStudent b=new PGStudent(str[0],str[1],str[2],str[3]);
                  arr[i]=b;
            }
            Arrays.sort(arr,new sortBypercentage());
            for(int i=0;i<n;i++)
            {
                  System.out.println(arr[i].personName);
            }
      }
}