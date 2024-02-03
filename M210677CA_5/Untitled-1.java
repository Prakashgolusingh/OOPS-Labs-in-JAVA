import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Marathon
{
    String name;
    int chestid;
    String depname;
    int time;
    
    public Marathon(String name,String chestid,String depname,String time)
    {
        this.name=name;
        this.chestid=chestid;
        this.depname=depname;
        this.time=time;
    }
    
   
    static void FinisherIndex(ArrayList<Marathon>arr1)
    {
        ArrayList<Marathon>arr2=(ArrayList)arr1.clone();
        Collections.sort(arr2,(a,b)->(a.time.compareTo(b.time)));
        int j=0;
        while( j<3)
            {
                Marathon a=arr2.get(j);
                for(int i=0;i<arr1.size();i++)
                {
                    Marathon b=arr1.get(i);
                    if(a.time.equals(b.time))
                    {
                        System.out.println((i+1)+" "+ b.name+" "+b.time);
                        break;
                    }
                }
                j++;
            }
    }   
    
    static void SortMarathon(ArrayList<Marathon>arr,String na)
    {
       Collections.sort(arr,(a,b)->(a.time.compareTo(b.time)));
        for(int i=0;i<5;i++)
        {
        System.out.println(arr.get(i).name+" "+arr.get(i).chestid+" "+arr.get(i).depname+" "+arr.get(i).time);
        }
       
        int flag=0;
        for(int i=0;i<arr.size();i++)
        {
            Marathon temp =arr.get(i);
            if(na==temp.name)
            {
                System.out.println(na+" YES");
                flag=1;
                break;
            }
        }
            if(flag==0)
                System.out.println(na+" No");
    }
}
public class Solution {

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        in.nextLine();
        if(N>=20)
            System.out.println("MAX 20");
        else if(N<5)
            System.out.println("MIN 5");
       
        else
        {
            ArrayList<Marathon>arr=new ArrayList<Marathon>();
            int a=0;
            while(a<N)
            {
                String name=in.nextLine();
                String chestid=in.nextLine();
                String depname=in.next();;
                String time=in.nextLine();
                Marathon temp=new Marathon(name,chestid,depname,time);
                arr.add(temp);
                a++;
               
            }
            Marathon.FinisherIndex(arr);
            String na=in.nextLine();
            Marathon.sortMarathon(arr,na);
        }
           
      
        
    
  
    }
}



class BankAccount
{
    float balance;
    public float getMonthEndBalance()
    {
        return balance;
    }
}
class SavingsAccount extends BankAccount
{
    SavingsAccount(float balance)
    {
        this.balance=balance;
    }
    public float getMonthEndBalance()
    {
        return balance+balance*7/100;
    }
}
class CheckingAccount extends BankAccount
{
    CheckingAccount(float balance)
    {
        this.balance=balance;
    }
    public float getMonthEndBalance()
    {
         return (balance+balance*7/100)-(balance+balance*7/100)/10;
    }
}
public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        String name=scn.nextLine();
        String str[]=name.split(":");
        if(str[1].compareTo("20")<0)
            System.out.println( “overdraft”);
        else
        {
            if(sp[0].equals("CheckingAccount"))
            {
                CheckingAccount a=new CheckingAccount(Float.parseFloat(str[1]));
                float b=a.getMonthEndBalance();
                if(b<100)
                    b-=10;
                System.out.printf("%.2f",b);
            }
            else if(sp[0].equals("SavingAccount"))
            {
                SavingsAccount a=new SavingsAccount(Float.parseFloat(str[1]));
                float b=a.getMonthEndBalance();
                System.out.printf("%.2f",b);
            }
            else
            {
                System.out.println("invalidAccount");
            }
        }
    }
}