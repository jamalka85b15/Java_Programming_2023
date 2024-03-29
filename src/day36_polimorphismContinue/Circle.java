package day36_polimorphismContinue;

public class Circle {
    private double radius;
    public static final double PI=3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double  area(){
        return radius*radius*PI;
    }
    public double  perimeter(){
        return 2*radius*PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Circle)){
            System.out.println("Invalid object");
            System.exit(1);
        }
       if(this.radius==((Circle) obj).radius){
           return true;
       }
       return false;
    }
}
