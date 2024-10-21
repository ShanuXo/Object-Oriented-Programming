public class Student {
    int RollNo;
    String Name;

    public void whosTopper()
    {
        System.out.println(Name + "topper");
    }

    public static void main(String[] args)
    {
        Student sd=new Student();
        // sd.RollNo=1; 
        sd.Name="Shanu";
        sd.whosTopper();
        // System.out.println(sd.RollNo);
        // System.out.println(sd.Name);

    }
}
