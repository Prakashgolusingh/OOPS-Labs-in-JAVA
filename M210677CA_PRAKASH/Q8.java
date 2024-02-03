import java.util.*;
public class Q8
{
	public static void main(String[] args) {
	      Scanner scn=new Scanner(System.in);
		System.out.println(" Enter Two No.\nEg. 5 6 *");
		String str=scn.nextLine();
		String strs[]=str.split(" ");
		int it1=Integer.parseInt(strs[0]);
		int it2=Integer.parseInt(strs[1]);
		switch(strs[2])
		{
		      case "+":
		            System.out.println(it1+it2);
		            break;
		      case "-":
		            System.out.println(it1-it2);
		            break;
                  case "*":
                        System.out.println(it1*it2);
		            break;
		      case "/":
		            System.out.println(it1/it2);
		            break;
                  case "%":
                        System.out.println(it1%it2);
		            break;
		}
	}
}
