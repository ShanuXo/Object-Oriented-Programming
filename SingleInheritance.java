class Employee{
    int Salary;
    public void displaySalry()
    {
        System.out.println(Salary);
    }
}

class Hr extends Employee{
    int bonus;
    public void displayBonus()
    {
        System.out.println(bonus);
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
        Hr employee=new Hr();
        employee.Salary=550000;
        employee.bonus=40000;
        employee.displaySalry();
        employee.displayBonus();
    }
}
