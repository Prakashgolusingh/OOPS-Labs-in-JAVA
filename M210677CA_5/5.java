import java.util.*;
class Car
{
      String modelName;
      String engineNo;
      int basePrice;
      int additionalCharge;
      public int totalPrice()
      {
            return basePrice+additionalCharge;
      }
}
class Dealer
{
      String dealerName;
      float discountPercentage;
      Car obj=new Car();
      Dealer(String modelName,String engineNo,int basePrice,int additionalCharge,String dealerName,float discountPercentage)
      {
            this.dealerName=dealerName;
            this.discountPercentage=discountPercentage;
            obj.modelName=modelName;
            obj.engineNo=engineNo;
            obj.basePrice=basePrice;
            obj.additionalCharge=additionalCharge;
      }
      public int onRoadPrice()
      {
            int a=obj.totalPrice();
            return a-(int)discountPercentage*a/100;
      }
}
public class Main
{
	public static void main(String[] args) 
	{
	      
	      
	      Scanner scn=new Scanner(System.in);
            int n=scn.nextInt();
            scn.nextLine();
            Dealer arr[]=new Dealer[n];
            for(int i=0;i<n;i++)
            {
                  String a=scn.nextLine();
                  String str[]=a.split(" ");
                  Dealer b=new Dealer(str[0],str[1],Integer.parseInt(str[2]),Integer.parseInt(str[3]),str[4],Float.parseFloat(str[5]));
                  arr[i]=b;
            }
            for(int i=0;i<n;i++)
            {
                  System.out.println(arr[i].obj.modelName+" "+arr[i].obj.totalPrice()+" "+arr[i].onRoadPrice());
            }
      }

		
}
