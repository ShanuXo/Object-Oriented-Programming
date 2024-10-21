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



public class Inheritance {
    public static void main(String[] args)
    {
        ChildClass child=new ChildClass();
        child.show();
        child.display();
    }
}
