package day38_exceptionHandling.shapeTask;

public class Circle {

private  double  radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <=0){
            throw new InvalidShapeExcpetion("Raduis cannot be less than zero "+radius);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
       setRadius(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
