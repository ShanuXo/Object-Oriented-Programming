public class Finally {
    private static void A()
    {
        try{
            System.out.println("Inside A");
            throw new RuntimeException("Demo of Finally");
        }
        finally{
            System.out.println("Finally Inside A");
        }
    }
    private static void B()
    {
        try {
            System.out.println("Inside B");
            return;
        }
        finally{
            System.out.println("Finally Inside B");
        }
    }
    private static void C()
    {
        try {
            System.out.println("Inside C");
            System.exit(0);
        } finally{
            System.out.println("Check the flow");
        }
    }
    public static void main(String[] args)
    {
        try{
            A();
        }
        catch(Exception e){
            System.out.println("Caught in Main" + e);
        }
        B();
        C();
    }
}
