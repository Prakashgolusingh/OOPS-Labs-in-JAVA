import java .util.*;
class Student implements Comparable<Student>
{
      String Name;
      String Roll_No;
      String Height;
      Student(String Name,String Roll_No,String Height)
      {
            this.Name=Name;
            this.Roll_No=Roll_No;
            this.Height=Height;
      }
      public String toString()
      {
            return Name+","+Roll_No+","+Height;
      }
      public int compareTo(Student a)
      {
            int b=this.Height.compareTo(a.Height);
            if(b==0)
            {
                  b=this.Name.compareTo(a.Name);
            }
            return b;
      }
}
public class Main
{
	public static void main(String[] args) 
	{
	      Scanner in=new Scanner(System.in);
	      int b=in.nextInt();
	      in.nextLine();
	      List<Student> arr=new ArrayList<Student>();
	      for(int i=0;i<b;i++)
	      {
	            String a=in.nextLine();
	            a=a.substring(1,a.length()-1);
	            String str[]=a.split(",");
	            Student c=new Student(str[0],str[1],str[2]);
	            arr.add(c);
	      }
	      Collections.sort(arr);
	      int d=in.nextInt();
	      int count=0;
	      String e="-1";
            for(int i=0;i<b;i++)
            {
                  Student f=arr.get(i);
                  if(e.compareTo(f.Height)!=0)
                  {
                        count ++;
                        if(d!=count)
                              System.out.print(f.Name+",");
                        else
                        {
                              System.out.print(f.Name);
                              break;
                        }
                  }
                  e=f.Height;   
            }
	}
}
