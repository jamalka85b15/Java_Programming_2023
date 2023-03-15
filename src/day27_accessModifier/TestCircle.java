package day27_accessModifier;

public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle(10);
        System.out.println(c1);
        //System.out.println(c1.calArea());
       // System.out.println(c1.calPerimeter());
        //Circle.printPiValue();
        Circle c2 =new Circle(5);
        System.out.println(c2);
        System.out.println(Circle.pi);
    }
}
