package day25_constructor;

public class TestRectangle {
    public static void main(String[] args) {
        /*Rectangle r1 = new Rectangle();
        r1.setInfo(10,15);
        System.out.println(r1);
        System.out.println(r1.area());*/

        Rectangle r2 = new Rectangle(20,20);
        Rectangle r3 = new Rectangle(10,15);
        Rectangle r4 = new Rectangle(5,10);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

    }

}
