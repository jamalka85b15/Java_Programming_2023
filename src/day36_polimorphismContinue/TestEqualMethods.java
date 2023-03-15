package day36_polimorphismContinue;

import day30_inharitanceContinue.phoneTask.Iphone;

public class TestEqualMethods {
    public static void main(String[] args) {


        Circle circle=new Circle(5);
        Circle circle2= new Circle(10);
        System.out.println(circle==circle2); // comparing if this same object
        System.out.println(circle.equals(circle2));

        System.out.println("------------------------");
        Iphone iphone= new Iphone("14", "White", "128GB", 1999);
        Iphone iphone2= new Iphone("14", "White", "128GB", 1999);
        System.out.println("Iphone is: "+iphone.equals(iphone2));
    }
}
