/* Create a class DepartmentMeetingScheduler, which schedules the meetings
happening in the department, and lists the meeting details scheduled on a particular
day. Each meeting has the characteristics:- meetingTitle, meeting date(in dd/MM/yyyy
format), meetingStartTime(in 24hr format), meetingEndTime(in 24hr format),
meetingDescription.
Note: Use an ArrayList to store all meeting objects
DepartmentMeetingScheduler have the following specification:
● There is a method scheduleMeeting, which looks if any meeting which is already
scheduled is colliding with the new meeting (based on timing) and creates the
meeting if no collision occurs.
● There is a method displayMeetings which takes an input parameter date, and
lists all the meetings scheduled on the given date*/
import java.util.*;
class DepartmentMeetingScheduler
{
      String Title;
      String Date;
      String Start;
      String End;
      String Description;
          
      
}
public class Main
{
	public static void main(String[] args) 
	{
	      ArrayList<DepartmentMeetingScheduler> arr=new ArrayList<DepartmentMeetingScheduler>();
	      while(true)
	      {
	            System.out.print("Enter your choice :");
	            Scanner input=new Scanner(System.in);
	            int a=input.nextInt();
	            input.nextLine();
	            if(a==1)
	            {
	                  DepartmentMeetingScheduler b=new DepartmentMeetingScheduler();
	                  System.out.print("Title - ");
	                  b.Title=input.nextLine();
	                  System.out.print("\nDate - ");
	                  b.Date=input.nextLine();
	                  System.out.print("\nStart time - ");
	                  b.Start=input.nextLine();
	                  System.out.print("\nEnd time - ");
	                  b.End=input.nextLine();
	                  System.out.print("\nDescription - ");
	                  b.Description=input.nextLine();
	                  if(scheduleMeeting(b,arr))
	                  {
	                        arr.add(b);
	                        System.out.print("\nScheduled successfully ");
	                  }
	                        
	                  else
	                  {
	                        System.out.print("\nCollision! Already another meeting is scheduled ");
	                  }
	            }
	            if(a==2)
	            {
	                  String b=input.nextLine();
	                  displayMeeting(b,arr);
	            }
	      }
	}
	static boolean scheduleMeeting(DepartmentMeetingScheduler a,ArrayList<DepartmentMeetingScheduler> arr)
      {
            boolean b=true;
	      if(arr.size()>=1)
	      {
	            for(int i=0;i<arr.size();i++)
	            {
	                  if(a.Date.equals(arr.get(i).Date))
	                  {
	                        if(a.Start.compareTo(arr.get(i).End)>0)
	                              return b;
	                        else if(a.End.compareTo(arr.get(i).Start)<0)
	                              return b;
	                        else
	                              b=false;
	                        return b;
	                  }
	                  else
	                        return b;
	            }
	      }
	            return b;
      }
	static void displayMeeting(String a,ArrayList<DepartmentMeetingScheduler> arr)
      {
            for(int i=0;i<arr.size();i++)
	      {
	            if(arr.get(i).Date.equals(a))
                        System.out.println("On "+arr.get(i).Date+",from "+arr.get(i).Start+" to "+arr.get(i).End+" "+arr.get(i).Description);
            }
      }
}
