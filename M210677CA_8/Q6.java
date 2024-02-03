import java.util.*;
class Queue
{
      ArrayList <Integer>arr=new ArrayList<>();
      void enqueue(int it)
      {
            arr.add(it);
      }
      void dequeue()
      {
            int it=arr.size()-1;
            if(arr.size()!=0)
            System.out.println(arr.get(it));
            arr.remove(it);
      }
}
public class Q6
{
	public static void main(String[] args) {
	      Scanner scn=new Scanner(System.in);
	      Queue obj=new Queue();
	      while(true)
	      {
	            String str=scn.nextLine();
	            String stbr[]=str.split(" ");
	            if(stbr[0].equals("E"))
	            {
	                  obj.enqueue(Integer.parseInt(stbr[1]));
	                  System.out.println("Success");
	            }
	            if(stbr[0].equals("D"))
	            {
	                  try
	                  {
	                        obj.dequeue();
	                  }
	                  catch(IndexOutOfBoundsException ae)
	                  {
	                        System.out.println("EmptyQueue");
	                        System.exit(0);
	                  }
	            }
	      }
	      
	      
	}
}
