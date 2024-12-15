public class Finalize {
    private void Finalise()
    {
        System.out.println("Garbage Collector Called.");
        // Release any resources held by this object
        // Example: Close database connections, release file handles, etc.
        // This method will be called automatically by the garbage collector
    }
    public static void main(String[] args)
    {
        Finalize obj=new Finalize();
        obj=null;

        System.gc();
        System.out.println("Object Resources are de-allocated.");
    }
}
