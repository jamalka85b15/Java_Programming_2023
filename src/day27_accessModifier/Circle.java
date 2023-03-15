package day27_accessModifier;

public class Circle {
    public double radius;
    public double diameter;
     public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
    }

    public double calArea(){
        return radius* radius*pi;
    }
    public double calPerimeter(){
        return pi*diameter;
    }
    public static void printPiValue(){
        System.out.println("PI value is "+ pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI "+pi+
                ", Area "+ calArea()+
                ", Perimeter "+ calPerimeter()+
                '}';
    }
}
