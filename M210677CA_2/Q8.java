/* ) Define a class Train in java with the following specifications:
Data Members
busno - to store Bus Number
from - to store Place name of origin (single word)
to - to store Place name of destination (single word)
distance - to store the Distance in Kilometres
type – to store Bus Type such as ‘O’ for ordinary (O, F , L use enum).
Member Functions
A constructor function to initialize all data members. Use ‘O’ as type if nothing is specified
for Type.
A function CalcFare to calculate Fare as per the following criteria*/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	      Scanner input=new Scanner(System.in);
	      ArrayList<Train>arr=new ArrayList<Train>();
	      while(true)
	      {
	            System.out.print("Enter choice  ");
	            int ac=input.nextInt();
	            input.nextLine();
	            if(ac==1)
	            {
	                 System.out.println("Enter bus details(Busno,from,to,distance,type) ");
	                 String str=input.nextLine();
	                 String splitted_details[]=str.split(" ");
	                 if(splitted_details.length==4)
	                 {
	                       String busno = splitted_details[0];
	                       String from = splitted_details[1];
	                       String to = splitted_details[2];
	                       int distance = Integer.parseInt(splitted_details[3]);
	                       Train a=new Train(busno,from,to,distance);
	                       arr.add(a);
	                 }
	                 else
	                 {
	                       String busno = splitted_details[0];
	                       String from = splitted_details[1];
	                       String to = splitted_details[2];
	                       int distance = Integer.parseInt(splitted_details[3]);
	                       Type type=Type.valueOf(splitted_details[4]);
	                       Train b=new Train(busno,from,to,distance,type);
	                       arr.add(b);
	                 }
	            }
	            else if(ac==2)
	            {
	                  for(int i=0;i<arr.size();i++)
	                  {
	                        Train ab=arr.get(i);
	                        System.out.println(ab.busno+" "+ab.from+" "+ab.to+" "+ab.distance+" "+ab.type+" "+ab.CalcFare(ab.distance,ab.type));
	                  }
	            }
	            else if(ac==3)
	                  System.exit(0);
	           
	      }
	}
}
enum Type
{
      O,
      F,
      L;
}
class Train
{
      String busno;
      String from;
      String to;
      int distance;
      Type type;
      public Train(String busno,String from,String to,int distance,Type type )
      {
            this.busno=busno;
            this.from=from;
            this.to=to;
            this.distance=distance;
            this.type=type;
      }
      public Train(String busno,String from,String to,int distance )
      {
            this.busno=busno;
            this.from=from;
            this.to=to;
            this.distance=distance;
            type=Type.O;
      }
      public static int CalcFare(int distance,Type type)
      {
            if(type==Type.O)
            return 10*distance;
            else if(type==Type.F)
            return 20*distance;
            else
            return 24*distance;
      }
}