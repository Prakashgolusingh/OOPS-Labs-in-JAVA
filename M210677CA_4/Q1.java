import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str = in.nextLine();
        ArrayList<Character>arr=new ArrayList<>();
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u')
				arr.add(str.charAt(i));
		}
		Collections.sort(arr);
		for(char a:arr)
			System.out.print(a);
	}
}
