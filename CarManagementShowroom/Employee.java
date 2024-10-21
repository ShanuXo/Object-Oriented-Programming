package CarManagementShowroom;

import java.util.Scanner;
import java.util.UUID;

public class Employee extends Showroom implements Utility{
    String employee_Id;
    String employee_Name;
    int employee_Age;
    String employee_Department;
    
    @Override
    public void get_details()
    {
        System.out.println("ID: "+employee_Id);
        System.out.println("Name: "+employee_Name);
        System.out.println("Age: "+employee_Age);
        System.out.println("Department: "+employee_Department);
        System.out.println("Showroom Name: "+showroom_Name);
    }
    @Override
    public void set_details()
    {
        Scanner sc=new Scanner(System.in);
        UUID uid=UUID.randomUUID();
        employee_Id=uid.toString();
        System.out.println("========== **** ENTER EMPLOYEE DETAILS **** ==========");
        System.out.println();
        System.out.print("EMPLOYEE NAME: ");
        employee_Name=sc.nextLine();
        System.out.println("EMPLOYEE AGE: ");
        employee_Age=sc.nextInt();
        System.out.println();
        System.out.println("EMPLOYEE DEPARTMENT: ");
        employee_Department=sc.nextLine();
        System.out.println();
        System.out.println("SHOWROOM NAME: ");
        showroom_Name=sc.nextLine();
    }
}
