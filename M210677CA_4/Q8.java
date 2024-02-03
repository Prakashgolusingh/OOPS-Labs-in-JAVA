import java.util.*;
class Student
{
      String studentName;
      int rollNo;
      int englishScore;
      int hindiScore;
      int mathsScore;
      int scienceScore;
      int ssScore;
      public void addStudent(String detail)
      {
            String split_detail[]=detail.split(" ");
            studentName=split_detail[0];
            rollNo=Integer.parseInt(split_detail[1]);
            englishScore=Integer.parseInt(split_detail[2]);
            hindiScore=Integer.parseInt(split_detail[3]);
            mathsScore=Integer.parseInt(split_detail[4]);
            scienceScore=Integer.parseInt(split_detail[5]);
            ssScore=Integer.parseInt(split_detail[6]);
      }
      public static void subjectTopper(ArrayList<Student>arr,int a)
      {
            int min=Integer.MIN_VALUE;
            Student b;
            if(a==101)
            {
                  for(int i=0;i<arr.size();i++)
                  {
                        b=arr.get(i);
                        if(min<b.englishScore)
                              min=b.englishScore;
                  }
                  for(int i=0;i<arr.size();i++)
                  {
                        b=arr.get(i);
                        if(min==b.englishScore)
                              System.out.println(b.studentName+" "+b.rollNo);
                  }
            }
            else if(a==102)
            {
                  for(int i=0;i<arr.size();i++)
                  {
                        b=arr.get(i);
                        if(min<b.hindiScore)
                              min=b.hindiScore;
                  }
                  for(int i=0;i<arr.size();i++)
                  {
                        b=arr.get(i);
                        if(min==b.hindiScore)
                              System.out.println(b.studentName+" "+b.rollNo);
                  }
            }
            else if(a==103)
            {
                  for(int i=0;i<arr.size();i++)
                  {
                        b=arr.get(i);
                        if(min<b.mathsScore)
                              min=b.mathsScore;
                  }
                  for(int i=0;i<arr.size();i++)
                  {
                        b=arr.get(i);
                        if(min==b.mathsScore)
                              System.out.println(b.studentName+" "+b.rollNo);
                  }
            }
            else if(a==104)
            {
                  for(int i=0;i<arr.size();i++)
                  {
                        b=arr.get(i);
                        if(min<b.scienceScore)
                              min=b.scienceScore;
                  }
                  for(int i=0;i<arr.size();i++)
                  {
                        b=arr.get(i);
                        if(min==b.scienceScore)
                              System.out.println(b.studentName+" "+b.rollNo);
                  }
            }
            else
            {
                  for(int i=0;i<arr.size();i++)
                  {
                        b=arr.get(i);
                        if(min<b.ssScore)
                              min=b.ssScore;
                  }
                  for(int i=0;i<arr.size();i++)
                  {
                        b=arr.get(i);
                        if(min==b.ssScore)
                              System.out.println(b.studentName+" "+b.rollNo);
                  }
            }
      }
      public static void classTopper(ArrayList<Student>arr)
      {
            int min=Integer.MIN_VALUE;
            Student b;
            int total=0;
            for(int i=0;i<arr.size();i++)
            {
                  Collections.sort(arr,(o1,o2)->(o1.rollNo-o2.rollNo));
                  b=arr.get(i);
                  total=b.englishScore+b.hindiScore+b.mathsScore+b.scienceScore+b.ssScore;
                  if(min<total)
                        min=total;
            }
            for(int i=0;i<arr.size();i++)
            {
                  b=arr.get(i);
                  if(min==b.englishScore+b.hindiScore+b.mathsScore+b.scienceScore+b.ssScore)
                  {
                        System.out.println(b.studentName+" "+b.rollNo);
                  }
            }
      }
}
public class Main
{
	public static void main(String[] args) 
	{
	      ArrayList<Student>arr=new ArrayList<>();
	      int b;
	      Scanner in=new Scanner(System.in);
	      while(true)
	      {
	            String a=in.nextLine();
	            if(a.equals("a"))
	            {
	                  String detail=in.nextLine();
	                  Student s1=new Student();
	                  s1.addStudent(detail);
	                  arr.add(s1);
	            }
	            if(a.equals("s"))
	            {
	                  b=in.nextInt();
	                  in.nextLine();
	                  
	                  Student.subjectTopper(arr,b);
	            }
	            if(a.equals("c"))
	            {
	                  Student.classTopper(arr);
	            }
	            if(a.equals("t"))
	            {
	                 System.exit(0); 
	            }
	      }
	}
}
