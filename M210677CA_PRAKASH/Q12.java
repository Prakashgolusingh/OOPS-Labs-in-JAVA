import java.util.*;
class Employee
{
	String name;
	int income,t;
	float tax;
	
	void tax()
	{
		if(income<=250000)
			t=0;
		else if(income>250000 && income<1000000)
			t=10;
		else
			t=20;
		tax=income*t/100;
		System.out.printf("%.2f\n",tax);
	}
}
public class Q12
{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		scn.nextLine();
		if(n<1)
		{
			System.out.println("INVALID");
		}
		else
		{
			Employee obj[]=new Employee[n];
			for(int i=0;i<n;i++)
			{
				String str=scn.nextLine();
				String str1[]=str.split(":");
				Employee obj1=new Employee();
				obj1.name=str1[0];
				obj1.income=Integer.parseInt(str1[1]);
				obj[i]=obj1;
			}
			for(int i=0;i<n;i++)
			{
				System.out.print(obj[i].name+":");
				obj[i].tax();
			}
		}
	}
}
