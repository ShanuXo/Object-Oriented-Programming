abstract class Car{
    //Abstract Method
    abstract public void fuelType();
    //Non Abstract method
    public void color()
    {
        System.out.println("Color of Car: Red");
    }
}

class Mahindra extends Car{
    //Implementing abstract method
    public void fuelType()
    {
        System.out.println("Fuel Type : Petrol");
    }
}

public class Abstraction {
    public static void main(String[] args)
    {
        Mahindra thar=new Mahindra();
        thar.fuelType();
        thar.color(); //Non abstract method call from child class.
    }
}
