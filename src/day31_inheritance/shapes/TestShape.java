package day31_inheritance.shapes;

import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {

        Square square=new Square(5);
        System.out.println(square);
        square.draw();
        square.area();
        square.perimeter();
        Circle circle=new Circle(4);
        System.out.println(circle);
        circle.area();
        circle.perimeter();


    }


}
