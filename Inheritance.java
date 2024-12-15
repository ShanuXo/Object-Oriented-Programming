class ParentClass{
    public void display()
    {
        System.out.println("Parent class display method");   
    }
}

class ChildClass extends ParentClass{
    public void show()
    {
        System.out.println("Child class show method");
    }
}



public class Inheritance { //Inheritance in java can be defined as mechanism where one class(child class) inherit the propert of another class(parent class)
    public static void main(String[] args)
    {
        ChildClass child=new ChildClass();
        child.show();
        child.display();
    }
}
