class Student{
    private String name;
    private int age;
    private int id;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }

}   



public class Encapsulation {
    public static void main(String[] args) {
        {
            Student sd=new Student();
            sd.setName("Shanu");
            sd.getName();
        }
    }
}
