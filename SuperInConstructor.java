class animal{
    public animal(){
        System.out.println("Animal constructor");
    }
}

class Dog extends animal{
    public Dog(){
        super();
        System.out.println("Dog constructor");
    }
}

public class SuperInConstructor {
    public static void main(String[] args)
    {
        Dog dog=new Dog();
    }
}
