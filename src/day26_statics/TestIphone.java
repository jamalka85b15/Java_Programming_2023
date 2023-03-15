package day26_statics;

public class TestIphone {
    public static void main(String[] args) {
       Iphone p1 = new Iphone("14", "White", 999);
        System.out.println(p1);
        p1.printPhoneInfo(); // must have object to call instance method
        Iphone.printInfo(); // able to call without object when calling static method
        System.out.println(Iphone.hasBattery);

    }
}
