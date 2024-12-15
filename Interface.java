//Interface -> It is a set of abstract method which you need to implement in our our class these method are public and abstract by defualt9we dont need to explicitely use the "abstract" keyword)
//Interface in java is used to achieve Abstraction and Multiple Inheritance

interface Animal{
    public void run();
}
interface Alien{
    public void run();
}

class Dog implements Animal,Alien{
    public void run()
    {
        System.out.println("Dog runs");
    }
}


class Interface{ // Interface in java is a set of abstract methods you want your class to implemnst.
    public static void main(String[] args)
    {
        // Animal dog=new Dog();
        // Alien doggy=new Dog();
        // dog.run();
        // doggy.bark();
        Animal dog=new Dog();
        Alien alien=new Dog();
        dog.run();
        alien.run();
    }
}

