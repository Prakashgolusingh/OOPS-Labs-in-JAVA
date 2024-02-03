import java.util.*;
class TellphoneCall
{
      String phNo;
      String custName;
      int callSlots;
      int totalBill;
      public void readCustomer(String ph,String Name,int Slots)
      {
            phNo=ph;
            custName=Name;
            callSlots=Slots;
      }
      public void computBill()
      {
            totalBill=300;
            if(callSlots<100)
                  totalBill+=500;
            else if(callSlots<200)
                  totalBill+=callSlots*8;
            else if(callSlots<300)
                  totalBill+=callSlots*10;
            else
                  totalBill+=callSlots*15;
            System.out.print(totalBill);
      }
}
public class Main
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String no = in.nextLine();
            String name=in.nextLine();
            int Slots=in.nextInt();
            TellphoneCall a=new TellphoneCall();
            a.readCustomer(no,name,Slots);
            a.computBill();
	}
}
