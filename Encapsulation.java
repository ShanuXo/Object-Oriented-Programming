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



public class Encapsulation {//Encapsulation is a technique of restricting the user to directly modify the data memebers or a variables of a class in order to maintain the integrity of the data.
    public static void main(String[] args) {
        {
            Student sd=new Student();
            sd.setName("Shanu");
            sd.getName(); 
            sd.setAge(23);
            sd.getAge();
            sd.setId(5481);
            sd.getId();
        } 
    }
}
