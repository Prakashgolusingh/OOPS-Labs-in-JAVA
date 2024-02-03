package lab6;

import java.util.Scanner;

class Employee
{
	private String id,name;
public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Q2 {
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter value for N : ");
	int N=scn.nextInt();
	scn.nextLine();
	Employee arr[]=new Employee[N];
	for(int i=0;i<N;i++)
	{
		Employee obj=new Employee();
		System.out.println("Enter EmpId of obj "+i+" : ");
		String id=scn.nextLine();
		System.out.println("Enter name of obj "+i+" : ");
		String name=scn.nextLine();
		obj.setId(id);
		obj.setName(name);
		arr[i]=obj;
	}
	System.out.println("The Employees are : ");
	for(int i=0;i<N;i++)
	{
		System.out.println(arr[i].getName()+"(ID : "+arr[i].getId()+")");
	}
	
	}
}
