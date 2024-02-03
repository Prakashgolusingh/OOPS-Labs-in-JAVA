/*Implement an invoice item management system which stores a list of invoice items
and calculates the total amount. Each invoice item stores the inventory item details and
the quantity of that particular inventory item purchased.
Each inventory item has an id, name and unit price which should be stored prior.
Implement a menu driven program which iteratively reads the invoice details, and up on
completion it generates an invoice which lists the invoice details along with the total
amount. While entering invoice details, only the inventory id and quantity purchased is
needed.*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Available item:\n100 Biscuit 20\n102 Chocolate 30");
		System.out.println("105 Milk 10\n106 Icecream 10\n109 RiceInKg 45\nOKAY");
            
            Menu arr1[]=new Menu[10];
            arr1[0]=new Menu("Biscuit",20);
            arr1[2]=new Menu("Chocolate",30);
            arr1[5]=new Menu("Milk",10);
            arr1[6]=new Menu("Icecream",10);
            arr1[9]=new Menu("RiceInKg",45);
            Invoice arr2[]=new Invoice[10];
            Menu a;
            Invoice b;
            while(true)
            {
                  for(int i=0;i<10;i++)
                  {
                        a=arr1[i];
                        b=arr2[i];
                        b.name=a.name;
                        b.price=a.price;
                  }
                  System.out.println("\n\n1.Add Invoice\n2.Exit\nChoice:");
                  int choice=input.nextInt();
                  input.nextLine();
                  int e=0,c=0,d=0;
                  if(choice==1)
                  {
                        System.out.println("Add Invoice item(Y/N");
                        String Add=input.next();
                        if(Add.equals("Y"))
                        {
                              while(true)
                              {
                                    String item=input.nextLine();
                                    String item_split[]=item.split(" ");
                                    e=item_split.length;
                                    if(e==1)
                                          break;
                                    else
                                    {
                                          c=Integer.parseInt(item_split[0])-100;
                                          d=Integer.parseInt(item_split[1]);
                                          b=arr2[c];
                                          b.quantity=d;
                                          //arr2[c].quantity=d;
                                    }
                                    
                              }
                              System.out.println("****INVOICE****");
                              int sum=0;
                              for(int i=0;i<arr2.length;i++)
                              {
                                    if(arr2[i]!=null){
                                    b=arr2[i];
                                    //if(b.quantity!=0)
                                    //{
                                          System.out.println((i+100)+","+b.name+","+b.price+","+b.quantity);
                                          sum+=(b.price*b.quantity);
                                    }//}
                              }
                              System.out.println("Total:"+sum+"\n********");
                        }
                        else
                              System.exit(0);
                  }
                  else
                        System.exit(0);
                  for(int i=0;i<10;i++)
                  {
                        b=arr2[i];
                        b.quantity=0;
                  }
            }
	}
}
class Menu
{
      String name;
      int price;
      Menu(String name,int price)
      {
            this.name=name;
            this.price=price;
      }
}
class Invoice
{
      String name;
      int price;
      int quantity;
      Invoice(String name,int price,int quantity)
      {
            this.name=name;
            this.price=price;
            this.quantity=quantity;
      }
}