import java.util.*;
interface TaxCalculatable
{
      int claculateTax();
}
class Vehicle implements TaxCalculatable
{
      String modelNumber;
      int rateBought;
      String fuelType;
      int numberOfWheels;
      public int claculateTax()
      {
            return rateBought;
      }
}
class Car extends Vehicle
{
      Car(int numberOfWheels)
      {
            this.numberOfWheels=numberOfWheels;
      }
      int numberOfPassengers;
      public int calculateTax()
      {
            if(fuelType.equals("petrol"))
                  return (int)(rateBought*0.1*numberOfPassengers*0.5);
            else
                  return (int)(rateBought*0.1*numberOfPassengers*0.4);
      }
}
class Truck extends Vehicle
{
      Truck(int numberOfWheels)
      {
            this.numberOfWheels=numberOfWheels;
      }
      int loadLimit;
      public int claculateTax()
      {
            if(fuelType.equals("petrol"))
                  return (int)(rateBought*0.1*loadLimit*0.002*0.5);
            else
                  return (int)(rateBought*0.1*loadLimit*0.002*0.4);
      }
}
public class Main
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		ArrayList<Vehicle>arr=new ArrayList<>();
		while(true)
		{
		      System.out.println("1. Add Vehicle\n2. Display Vehicles\n3. Exit");
		      System.out.print("Enter your choice:");
		      int it=scn.nextInt();
		      scn.nextLine();
		      switch(it)
		      {
		            case 1:
		                  System.out.println("a. Car\nb. Truck");
		                  System.out.print("Enter your choice:");
		                  String str=scn.nextLine();
		                  scn.nextLine();
		                  if(str.equals("a"))
		                  {
		                        Vehicle obj=new Car(4);
		                        System.out.print("ModelNumber:");
		                        obj.modelNumber=scn.nextLine();
		                        System.out.print("Rate:");
		                        obj.rateBought=scn.nextInt();
		                        scn.nextLine();
		                        System.out.print("FuelType(petrol/diesel):");
		                        obj.fuelType=scn.nextLine();
		                        System.out.print("Passengers:");
		                        obj.numberOfPassengers=nextInt();
		                        scn.nextLine();
		                        arr.add(obj);
		                  }
		                  else
		                  {
		                        Vehicle obj0=new Truck(6);
		                        System.out.print("ModelNumber:");
		                        obj0.modelNumber=scn.nextLine();
		                        System.out.print("Rate:");
		                        obj0.rateBought=scn.nextInt();
		                        scn.nextLine();
		                        System.out.print("FuelType(petrol/diesel):");
		                        obj0.fuelType=scn.nextLine();
		                        System.out.print("LoadLimit:");
		                        obj0.loadLimit=nextInt();
		                        scn.nextLine();
		                        arr.add(obj0);
		                  }
		                  break;
                        case 2:
                              Collections.sort(arr,Comparator.comparing(Vehicle::calculateTax));
                              for(int i=0;i<arr.size();i++)
                              {
                                    System.out.println(arr(i).modelNumber+" "+arr(i).fuelType+" "+arr(i).rateBought);
                              }
                              break;
                        default:
                              System.exit(0);
		      }
		}
	}
}
