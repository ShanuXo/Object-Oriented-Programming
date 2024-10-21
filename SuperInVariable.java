class Animal{
    String color="White";
}

class Sheep extends Animal{
    String color="Black";
    void printColor()
    {
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class SuperInVariable {
    public static void main(String[] args)
    {
        Sheep sp=new Sheep();
        sp.printColor();
    }   
}
