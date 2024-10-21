class Anima{
    public void eat()
    {
        System.out.println("Eating");
    }
}

class Goat extends Anima{
    public void eat() {System.out.println("Eating bread");}
    public void walk() {System.out.println("Walking");}

    public void work()
    {
        super.eat();
        walk();
    }
}



public class SuperInMethod {
    public static void main(String[] args)
    {
        Goat gt=new Goat();
        gt.work();
    }
}
