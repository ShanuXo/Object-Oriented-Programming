package CarManagementShowroom;
import java.util.Scanner;

public class Cars extends Showroom implements Utility{
    String car_Name;
    String car_Color;
    String car_FuelType;
    int car_Price;
    String car_Type;
    String car_Transmission;

    @Override
    public void get_details()
    {
        System.out.println("NAME: "+car_Name);
        System.out.println("COLOR: "+car_Color);
        System.out.println("FUEL TYPE: "+car_FuelType);
        System.out.println("PRICE: "+car_Price);
        System.out.println("CAR TYPE: "+car_Type);
        System.out.println("TRANSMISSION: "+car_Transmission);
    }
    @Override
    public void set_details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("==== **** ENTER CAR DETAILS **** ====");
        System.out.println();
        System.out.println("CAR NAME: "+car_Name);
        car_Name=sc.nextLine();
        System.out.println("CAR COLOR: "+car_Color);
        car_Color=sc.nextLine();
        System.out.println("CAR FUEL TYPE(PETROL/DIESEL): "+car_FuelType);
        car_FuelType=sc.nextLine();
        System.out.println("CAR PRICE");
        car_Price=sc.nextInt();
        sc.nextLine();
        System.out.println("CAR TYPE(SEDAN/SUV/HATCHBACK): ");
        car_Type=sc.nextLine();
        System.out.println("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
        car_Transmission=sc.nextLine();
        total_vehicles++;

    }
    
}
