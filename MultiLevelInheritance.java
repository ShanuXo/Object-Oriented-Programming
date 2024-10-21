class A{
    public void methodA()
    {
        System.out.println("Method of A Class");
    }
}

class B extends A{
    public void methodB()
    {
        System.out.println("Method of B Class");
    }
}

class C extends B{
    public void methodC()
    {
        System.out.println("Method of C Class");
    }
}


public class MultiLevelInheritance {
    public static void main(String[] args) {
        C obj=new C();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
