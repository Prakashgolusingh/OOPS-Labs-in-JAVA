package lab6;

import java.util.Scanner;

class Room
{
	int len;
	int breadth;
	
	public Room(int len, int breadth) {
		super();
		this.len = len;
		this.breadth = breadth;
	}

	void area()
	{
		System.out.println("Area of Room : "+len*breadth);
	}
	void perimeter()
	{
		System.out.println("Perimeter of Room : "+(len+breadth)*2);
	}
}
public class Q1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the length : ");
		int a=scn.nextInt();
		System.out.println("Enter the breadth : ");
		int b=scn.nextInt();
		Room obj=new Room(a,b);
		obj.area();
		obj.perimeter();
	}

}
