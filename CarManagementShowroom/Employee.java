package CarManagementShowroom;

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
        
    }
}
