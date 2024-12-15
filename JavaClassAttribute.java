public class JavaClassAttribute {
    String Name;
    int Age;
    String Address;

    public void Details()
    {
        System.out.println(Name + " " + Age + " " + Address);
    }
    public static void main(String[] args)
    {
        JavaClassAttribute obj=new JavaClassAttribute();
        obj.Name="Shanu";
        obj.Age=23;
        obj.Address="Bangalore";
        obj.Details();
        // System.out.println(obj.Name);
        // obj.Name="Subham";
        // System.out.println(obj.Name);
    }
}
