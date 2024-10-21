//Interface -> It is a set of abstract method which you need to implement in our our class these method are public and abstract by defualt9we dont need to explicitely use the "abstract" keyword)
//Interface in java is used to achieve Abstraction and Multiple Inheritance

interface Animal{
    public void run();
}
interface Alien{
    public void run();
}

class Dog implements  Animal,Alien{
    public void run()
    {
        System.out.println("Dog runs in C class");
    }
    // public void bark()
    // {
    //     System.out.println("Dogs bark");
    // }
}


class Interface{
    public static void main(String[] args)
    {
        // Animal dog=new Dog();
        // Alien doggy=new Dog();
        // dog.run();
        // doggy.bark();
        Dog dog=new Dog();
        // dog.bark();
        dog.run();
    }
}

