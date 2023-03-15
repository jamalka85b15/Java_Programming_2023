package day17_customClass;

public class Rectangle {

    public double length;
    public double width;

    public void setInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        double area =length * width;
        return area;
    }
    public double calculatePerimeter(){
        double perimeter =2*(length+width);
       return perimeter;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}'+", Perimeter = " +calculatePerimeter()+ ","+ " Area = "+ calculateArea();
    }
}
