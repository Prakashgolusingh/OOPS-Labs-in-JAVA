/*Write a java program to display the student details(Name, RollNumber, CGPA andPercentage). Percentage should be converted from CGPAusing member function. Input will be thetotal number of students followed by student detailsin the order of Name, RollNumber andCGPA(Assuming that the name of student has only oneword, representing the first name). Outputshould be the details of all the students in the orderName, RollNumber, CGPA and percentage.Use  accessor (setter and getter) methods for accessingthe attributes. (Percentage = 9.5*CGPA)*/
import java.util.*;
class Student
{
    private String Name;
    private String RollNumber;
    static int CGPA;
    double Percentage;
    static double get_percentage()
    {
        return CGPA*9.5;
    }
    public void setter(String Name,String RollNumber,int CGPA)
    {
        this.Name = Name;
        this.RollNumber = RollNumber;
        this.CGPA = CGPA;
        Percentage=get_percentage();
    }
    public void getter()
    {
        System.out.println(Name+" "+RollNumber+" "+CGPA+" "+Percentage+" %");
    }
}
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner input=new Scanner(System.in);
	    int no_of_students=input.nextInt();
	    input.nextLine();
	    for(int one_to_one=0;one_to_one<no_of_students;one_to_one++)
	    {
	        String student_details=input.nextLine();
	        String student_splitted_details[]=student_details.split(" ");
	        String Name = student_splitted_details[0];
	        String RollNumber = student_splitted_details[1];
	        int CGPA = Integer.parseInt(student_splitted_details[2]);
	        Student objects = new Student();
	        objects.setter(Name,RollNumber,CGPA);
	        objects.getter();
	    }
	}
}

