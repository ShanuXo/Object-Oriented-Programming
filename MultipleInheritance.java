interface  Rectangle{
    public void Area();
}
interface Square{
    public void Area();
}
class Shape implements Rectangle,Square{
    public void Area()
    {
        System.out.println("Area of Rectangle or Area of Square");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Rectangle shape = new Shape();
        Square shap2=new Shape();
        shape.Area();
        shap2.Area();
    }
}
