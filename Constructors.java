public class Constructors {
    int Id;
    int Age;
    public Constructors()
    {
        System.err.println("Hello From Default Constructor");
    }
    public Constructors(int Id,int Age) {
        this.Id = Id;
        this.Age = Age;
        System.err.println("Hello From Parametrised Constructors");
    }
    public static void main(String[] args) {
        Constructors obj = new Constructors(1, 20);
        System.out.println("ID: " + obj.Id + ", Age: " + obj.Age);
    }
}
