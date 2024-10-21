package CarManagementShowroom;
import java.util.Scanner;

public class Showroom implements Utility{
    String showroom_Name;
    String showroom_Address;
    String manager_Name;
    int total_Employees;
    int total_vehicles;


    @Override
    public void get_details()
    {
        System.out.println("Showroom Name: "+showroom_Name);
        System.out.println("Showroom Address: "+showroom_Address);
        System.out.println("Manager Name: "+manager_Name);
        System.out.println("Total Employee: "+total_Employees);
        System.out.println("Total vehicle: "+total_vehicles);
    }
    @Override
    public void set_details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("========== **** Enter Showroom Details **** ==========");
        System.out.println();
        System.out.print("SHOWROOM NAME: ");
        showroom_Name=sc.nextLine();
        System.out.println();
        System.out.println("SHOWROOM ADDRESS: ");
        showroom_Address=sc.nextLine();
        System.out.println();
        System.out.println("MANAGER NAME: ");
        manager_Name=sc.nextLine();
        System.out.println();
        System.out.println("TOTAL NUMBER OF EMPLOYEES: ");
        total_Employees=sc.nextInt();
        System.out.println();
        System.out.println("TOTAL CARS IN STOCK: ");
        total_vehicles=sc.nextInt();
    }
}
