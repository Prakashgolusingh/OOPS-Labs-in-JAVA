import java.util.*;
class Alpha
{
      char a;
      int count;
}
class sorting implements Comparator<Alpha>
{
      public int compare(Alpha b,Alpha c)
      {
            return c.count - b.count;
      }
}
public class Q6
{
	public static void main(String[] args) {
	      Scanner scn=new Scanner(System.in);
	      String str=scn.nextLine();
	      StringBuilder stbr=new StringBuilder(str);
	      ArrayList<Alpha>arr=new ArrayList<>();
		while(stbr.length()!=0)
		{
		      char a1=stbr.charAt(0);
		      int c=0;
		      for(int i=0;i<stbr.length();i++)
		      {
		            if(a1==stbr.charAt(i))
		            {
		                  c++;
		                  stbr.delete(i,i+1);
		                  i--;
		            }
		      }
		      Alpha obj=new Alpha();
		      obj.a=a1;
		      obj.count=c;
		      arr.add(obj);
		}
		Collections.sort(arr,new sorting());
		for(int i=0;i<arr.size();i++)
		{
		      Alpha obj=arr.get(i);
		      for(int j=0;j<obj.count;j++)
		      {
		            System.out.print(obj.a);
		      }
		}
	}
}
