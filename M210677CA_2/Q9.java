/* Write a java program to implement an inventory system for the video rental store. A video store
consists of many videos. Each video consists of a title and a status of whether the video is rented
out or not. There should be a method to track whether the video is rented or returned.
The video store will provide the facility to add a new video (by title) to the inventory, check out a
video (by title), return a video to the store, and list the whole inventory of videos in the store.
Create a main class VideoStoreLauncher with a method which will test the functionality. The
videos can be added in bulk by specifying the number of videos first then followed by their titles.*/
import java.util.*;
class Video
{
      String Title;
      String Status;
}
public class Main
{
	public static void main(String[] args) 
	{
	      System.out.println("1.Add video\n2.Check availability\n3.Rent a video\n4.Return\n5.List the inventory\n6.Exit");
	      Scanner input=new Scanner(System.in);
	      ArrayList<Video>arr=new ArrayList<Video>();
	      while(true)
	      {
	            System.out.println("choice : ");
	            int a=input.nextInt();
	            String str="";
	            input.nextLine();
	            if(a==1)
	            {
	                 System.out.println("N : ");
	                 int b=input.nextInt();
	                 input.nextLine();
	                 System.out.println("Titles : ");
	                 
	                 for(int i=0;i<b;i++)
	                 {
	                       str=input.nextLine();
	                       Video aa=new Video();
	                       aa.Title=str;
	                       aa.Status="Available";
	                       arr.add(aa);
	                 }
	           }
	           else if(a==2)
	           {
	                 int flag=0;
	                 System.out.println("Title : ");
                       str=input.nextLine();
                       for(int i=0;i<arr.size();i++)
                       {
                             if(arr.get(i).Title.equals(str))
                             {
                                    if(arr.get(i).Status.equals("Available"))
                                          System.out.println("Available");
                                    else if(arr.get(i).Status.equals("NotAvailable"))
                                          System.out.println("NotAvailable ");
                                   break;
                             }
                       }     
                 }
	           else if(a==3)
	           {
	                  System.out.println("Title : ");
                        str=input.nextLine();
                        for(int i=0;i<arr.size();i++)
                        {
                              if(arr.get(i).Title.equals(str))
                              {
                                    arr.get(i).Status="NotAvailable";
                                    break;
                              }
                        }
	           }
	           else if(a==4)
	           {
	                  System.out.println("Title : ");
                        str=input.nextLine();
                        for(int i=0;i<arr.size();i++)
                        {
                              if(arr.get(i).Title.equals(str))
                              {
                                    arr.get(i).Status="Available";
                                    break;
                              }
                        }
	           }
	           else if(a==5)
	           {
	                 for(int i=0;i<arr.size()-1;i++)
	                 System.out.print("\""+arr.get(i).Title+"\",");
	                 System.out.println("\""+arr.get(arr.size()-1).Title+"\"");
	           }
	           else if(a==6)
	                  System.exit(0);
	           
	      }
	}
}
