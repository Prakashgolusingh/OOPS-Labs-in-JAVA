import java.util.*;
class Person
{
      String Name;
      int age;
      Person(String Name,int age)
      {
            this.Name=Name;
            this.age=age;
      }
      public void calculatePension()
      {
            if(age<=65)
            System.out.print("0");
            else if(age<=70)
                  System.out.print("500");
            else if(age>70)
                  System.out.print("600");
      }
}
public class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
            String name=in.nextLine();
            int age=in.nextInt();
            Person a=new Person(name,age);
            a.calculatePension();
	}
}
